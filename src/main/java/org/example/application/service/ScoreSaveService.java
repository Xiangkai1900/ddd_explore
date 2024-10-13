package org.example.application.service;

import org.example.adapter.model.command.ScoreSaveCommand;
import org.example.domain.model.entity.MessageNotice;
import org.example.domain.model.entity.SubjectScore;
import org.example.domain.model.entity.TotalScore;
import org.springframework.stereotype.Service;

@Service
public class ScoreSaveService {

    public void scoreSave(ScoreSaveCommand scoreSaveCommand) {

        // 保存各学科（语文、数学）成绩
        new SubjectScore(scoreSaveCommand).save();

        // 保存总成绩
        new TotalScore(scoreSaveCommand).save();

        // 发送短息并保存
        new MessageNotice(scoreSaveCommand).notice();

    }
}
