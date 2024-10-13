package org.example.infrastructure.repository;

import org.example.infrastructure.datasource.ChineseScoreDao;
import org.example.infrastructure.model.po.ChineseScorePo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class ChineseScoreRepository {
    @Resource
    private ChineseScoreDao chineseScoreDao;

    public void saveChineseScore(ChineseScorePo chineseScorePo) {
        chineseScoreDao.saveChineseScore(chineseScorePo);
    }
}
