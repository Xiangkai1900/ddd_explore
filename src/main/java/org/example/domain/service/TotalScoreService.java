package org.example.domain.service;

import org.example.domain.model.entity.TotalScore;
import org.example.infrastructure.repository.TotalScoreRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TotalScoreService {

    @Resource
    private TotalScoreRepository totalScoreRepository;

    public void save(TotalScore totalScore) {

        // 保存总成绩
        totalScoreRepository.saveTotalScore(totalScore.toTotalScore());
    }

}
