package org.example.adapter.model.command;

import lombok.Data;

@Data
public class ScoreSaveCommand {
    /**
     * 学号
     */
    private Integer studentNumber;
    /**
     * 语文成绩
     */
    private Integer chineseScore;
    /**
     * 数学成绩
     */
    private Integer mathScore;

}
