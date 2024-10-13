package org.example.infrastructure.repository;

import org.example.infrastructure.datasource.MessageNotifyDao;
import org.example.infrastructure.model.po.MessageNotifyPo;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class MessageNotifyRepository {
    @Resource
    private MessageNotifyDao messageNotifyDao;

    public void saveMessageNotify(MessageNotifyPo messageNotifyPo) {
        messageNotifyDao.saveMessageNotify(messageNotifyPo);
    }
}
