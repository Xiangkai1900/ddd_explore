package org.example.domain.model.entity;

import lombok.Data;
import org.example.adapter.model.command.ScoreSaveCommand;
import org.example.domain.external.MessageService;
import org.example.infrastructure.model.po.MessageNotifyPo;
import org.example.infrastructure.model.po.StudentInfoPo;
import org.example.infrastructure.model.utils.SpringUtils;
import org.example.infrastructure.repository.MessageNotifyRepository;
import org.example.infrastructure.repository.StudentInfoRepository;

/**
 * 消息发送领域对象
 */
@Data
public class MessageNotice {

    /**
     * 学号
     */
    private Integer studentNumber;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 短信内容
     */
    private String message;


    public MessageNotice(ScoreSaveCommand scoreSaveCommand) {
        // 查询学生信息
        StudentInfoPo studentInfoPo = SpringUtils.getApplicationContext().getBean(StudentInfoRepository.class).selectStudentInfo(scoreSaveCommand.getStudentNumber());

        this.studentNumber = studentInfoPo.getStudentNumber();
        this.name = studentInfoPo.getName();
        this.phoneNumber = studentInfoPo.getPhoneNumber();

        this.message = studentInfoPo.getName() + "同学，你的考试成绩出来了，请登录系统查看。";

    }

    public MessageNotifyPo toMessageNotifyPo() {
        MessageNotifyPo messageNotifyPo = new MessageNotifyPo();
        messageNotifyPo.setStudentNumber(this.studentNumber);
        messageNotifyPo.setPhoneNumber(this.phoneNumber);
        messageNotifyPo.setMessage(this.message);
        return messageNotifyPo;
    }

    public void notice() {

        // 发送消息
        SpringUtils.getApplicationContext().getBean(MessageService.class).sendMessage(this);

        // 保存记录
        SpringUtils.getApplicationContext().getBean(MessageNotifyRepository.class).saveMessageNotify(this.toMessageNotifyPo());
    }
}
