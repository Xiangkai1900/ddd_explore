package org.example.infrastructure.repository;

import org.example.infrastructure.datasource.MathScoreDao;
import org.example.infrastructure.model.po.MathScorePo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class MathScoreRepository {
    @Resource
    private MathScoreDao mathScoreDao;

    public void saveMathScore(MathScorePo mathScorePo) {
        mathScoreDao.saveMathScore(mathScorePo);
    }
}
