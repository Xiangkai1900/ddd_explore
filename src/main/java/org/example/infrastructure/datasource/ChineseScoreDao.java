package org.example.infrastructure.datasource;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.model.po.ChineseScorePo;
@Mapper
public interface ChineseScoreDao {
    int saveChineseScore(ChineseScorePo chineseScorePo);
}
