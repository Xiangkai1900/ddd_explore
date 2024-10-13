package org.example.infrastructure.datasource;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.model.po.TotalScorePo;
@Mapper
public interface TotalScoreDao {
    int saveTotalScore(TotalScorePo totalScorePo);

}
