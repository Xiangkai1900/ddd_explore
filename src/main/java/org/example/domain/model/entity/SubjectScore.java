package org.example.domain.model.entity;

import lombok.Data;
import org.example.adapter.model.command.ScoreSaveCommand;
import org.example.domain.model.valueobject.ChineseScoreValueObject;
import org.example.domain.model.valueobject.MathScoreValueObject;
import org.example.domain.service.SubjectScoreService;
import org.example.infrastructure.model.po.ChineseScorePo;
import org.example.infrastructure.model.po.MathScorePo;
import org.example.infrastructure.model.utils.SpringUtils;

/**
 * 学生各学科成绩领域对象
 */
@Data
public class SubjectScore {

    /**
     * 学号
     */
    private Integer studentNumber;
    /**
     * 语文成绩值对象
     */
    private ChineseScoreValueObject chineseScoreValueObject;
    /**
     * 数学成绩值对象
     */
    private MathScoreValueObject mathScoreValueObject;

    public SubjectScore(ScoreSaveCommand scoreSaveCommand) {
        this.studentNumber = scoreSaveCommand.getStudentNumber();
        this.chineseScoreValueObject = new ChineseScoreValueObject(scoreSaveCommand.getChineseScore());
        this.mathScoreValueObject = new MathScoreValueObject(scoreSaveCommand.getMathScore());
    }


    public ChineseScorePo toChineseScorePo() {
        ChineseScorePo chineseScorePo = new ChineseScorePo();
        chineseScorePo.setStudentNumber(studentNumber);
        chineseScorePo.setScore(chineseScoreValueObject.score);
        return chineseScorePo;
    }

    public MathScorePo toMathScorePo() {
        MathScorePo mathScorePo = new MathScorePo();
        mathScorePo.setStudentNumber(studentNumber);
        mathScorePo.setScore(mathScoreValueObject.score);
        return mathScorePo;
    }

    public void save() {
        SpringUtils.getApplicationContext().getBean(SubjectScoreService.class).save(this);

    }
}
