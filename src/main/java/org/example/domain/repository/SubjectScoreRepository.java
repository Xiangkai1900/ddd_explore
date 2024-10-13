package org.example.domain.repository;

import org.example.domain.model.entity.SubjectScore;
import org.example.infrastructure.repository.ChineseScoreRepository;
import org.example.infrastructure.repository.MathScoreRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 领域层存储
 */
@Repository
public class SubjectScoreRepository {

    @Resource
    private ChineseScoreRepository chineseScoreRepository;
    @Resource
    private MathScoreRepository mathScoreRepository;

    public void save(SubjectScore studentScore){
        // 保存语文成绩
        chineseScoreRepository.saveChineseScore(studentScore.toChineseScorePo());

        // 保存数学成绩
        mathScoreRepository.saveMathScore(studentScore.toMathScorePo());

    }
}
