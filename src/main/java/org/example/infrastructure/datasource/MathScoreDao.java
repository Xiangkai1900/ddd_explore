package org.example.infrastructure.datasource;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.model.po.MathScorePo;
@Mapper
public interface MathScoreDao {
    int saveMathScore(MathScorePo mathScorePo);
}
