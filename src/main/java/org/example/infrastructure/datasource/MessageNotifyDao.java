package org.example.infrastructure.datasource;

import org.apache.ibatis.annotations.Mapper;
import org.example.infrastructure.model.po.MessageNotifyPo;
@Mapper
public interface MessageNotifyDao {
    /**
     * 保存消息记录
     */
    int saveMessageNotify(MessageNotifyPo messageNotifyPo);

}
