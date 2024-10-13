package org.example.infrastructure.model.po;

import lombok.Data;

/**
 * 总成绩
 */
@Data
public class TotalScorePo {

    private Integer id;
    /**
     * 学号
     */
    private Integer studentNumber;
    /**
     * 成绩
     */
    private Integer totalScore;

}
