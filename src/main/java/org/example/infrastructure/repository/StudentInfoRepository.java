package org.example.infrastructure.repository;

import org.example.infrastructure.datasource.StudentInfoDao;
import org.example.infrastructure.model.po.StudentInfoPo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class StudentInfoRepository {
    @Resource
    private StudentInfoDao studentInfoDao;

    public StudentInfoPo selectStudentInfo(Integer studentNumber) {
        return studentInfoDao.selectStudentInfo(studentNumber);
    }
}
