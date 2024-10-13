package org.example.domain.service;

import org.example.domain.model.entity.SubjectScore;
import org.example.domain.repository.SubjectScoreRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SubjectScoreService {

    @Resource
    private SubjectScoreRepository studentScoreRepository;
    public void save(SubjectScore studentScore){

        studentScoreRepository.save(studentScore);
    }
}
