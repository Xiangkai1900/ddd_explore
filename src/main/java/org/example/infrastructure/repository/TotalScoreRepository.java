package org.example.infrastructure.repository;

import org.example.infrastructure.datasource.TotalScoreDao;
import org.example.infrastructure.model.po.TotalScorePo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TotalScoreRepository {
    @Resource
    private TotalScoreDao totalScoreDao;

    public void saveTotalScore(TotalScorePo totalScorePo) {
        totalScoreDao.saveTotalScore(totalScorePo);
    }
}
