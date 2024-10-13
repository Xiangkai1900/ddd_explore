package org.example.infrastructure.datasource;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.model.po.StudentInfoPo;
@Mapper
public interface StudentInfoDao {
    StudentInfoPo selectStudentInfo(Integer studentNumber);
}
