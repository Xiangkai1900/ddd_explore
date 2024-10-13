package org.example.infrastructure.model.po;

import lombok.Data;
/**
 * 语文成绩
 */
@Data
public class ChineseScorePo {

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
