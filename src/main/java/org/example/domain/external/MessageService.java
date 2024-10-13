package org.example.domain.external;

import org.example.domain.model.entity.MessageNotice;
import org.springframework.stereotype.Service;

@Service
public class MessageService {


    public String sendMessage(MessageNotice messageInfo) {
        return "发送成功";
    }
}
