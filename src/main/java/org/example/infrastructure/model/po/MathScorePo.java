package org.example.infrastructure.model.po;

import lombok.Data;

/**
 * 数学成绩
 */
@Data
public class MathScorePo {

    private Integer id;
    /**
     * 学号
     */
    private Integer studentNumber;
    /**
     * 成绩
     */
    private Integer score;
}
