package org.example.adapter.controller;

import org.example.adapter.model.command.ScoreSaveCommand;
import org.example.application.service.ScoreSaveService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 方法入参
 */
@RestController
@RequestMapping("/score")
public class ScoreController {

    @Resource
    private ScoreSaveService scoreSaveService;

    /**
     * 需求背景：某次考试后，录入学生成绩，包含语文、数学两科
     * 要求：
     * 1 录入的语文、数学两科，存入各自学科成绩的表中；
     * 2 计算出总成绩，保存在总成绩表中；
     * 3 给学生发短信通知成绩（学生信息在学生表中已存在），并保存短信记录
     */
    @PostMapping("/save")
    public String saveScore(@RequestBody ScoreSaveCommand scoreSaveCommand) {
        scoreSaveService.scoreSave(scoreSaveCommand);

        return "success";
    }
}
