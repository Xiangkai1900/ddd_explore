package org.example.domain.model.entity;

import lombok.Data;
import org.example.adapter.model.command.ScoreSaveCommand;
import org.example.domain.service.TotalScoreService;
import org.example.infrastructure.model.po.TotalScorePo;
import org.example.infrastructure.model.utils.SpringUtils;

/**
 * 学生总成绩领域对象
 */
@Data
public class TotalScore {


    /**
     * 学号
     */
    private Integer studentNumber;
    /**
     * 总成绩
     */
    private Integer totalScore;


    public TotalScore(ScoreSaveCommand scoreSaveCommand) {
        this.studentNumber = scoreSaveCommand.getStudentNumber();
        this.totalScore = scoreSaveCommand.getChineseScore() + scoreSaveCommand.getMathScore();
    }

    public TotalScorePo toTotalScore() {
        TotalScorePo totalScorePo = new TotalScorePo();
        totalScorePo.setTotalScore(totalScore);
        totalScorePo.setStudentNumber(studentNumber);
        return totalScorePo;
    }

    public void save() {
        SpringUtils.getApplicationContext().getBean(TotalScoreService.class).save(this);
    }

}
