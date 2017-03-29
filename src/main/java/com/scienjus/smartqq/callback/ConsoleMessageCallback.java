package com.scienjus.smartqq.callback;

import com.scienjus.smartqq.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleMessageCallback implements MessageCallback {
    private Logger logger = LoggerFactory.getLogger(ConsoleMessageCallback.class);
    private SimpleDateFormat format = new SimpleDateFormat("HH:ss:mm");

    @Override
    public void onMessage(Message message, Friend friend) {
        String date = this.format.format(new Date(message.getTime()));
        logger.info("[ {}({}) {} ] {}", friend.getNickname(), friend.getUserId(), date, message.getContent());
    }

    @Override
    public void onGroupMessage(GroupMessage message, Group group) {
        String date = this.format.format(new Date(message.getTime()));
        logger.info("[ {}({}) {}] {} ", group.getName(), group.getId(), date, message.getContent());
    }

    @Override
    public void onDiscussMessage(DiscussMessage message, Discuss discuss) {
        String date = this.format.format(new Date(message.getTime()));
        logger.info("[ {}({}) {}] {} ", discuss.getName(), discuss.getId(), date, message.getContent());
    }
}
