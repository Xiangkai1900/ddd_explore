package org.example.infrastructure.model.po;

import lombok.Data;

@Data
public class MessageNotifyPo {
    /**
     * 学生号
     */
    private Integer studentNumber;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 消息体
     */
    private String message;


}
