package com.scienjus.smartqq.callback;

import com.scienjus.smartqq.model.*;

/**
 * 收到消息的回调
 * @author ScienJus
 * @date 2015/12/18.
 */
public interface MessageCallback {

    /**
     * 收到私聊消息后的回调
     * @param message
     * @param friend
     */
    void onMessage(Message message, Friend friend);

    /**
     * 收到群消息后的回调
     * @param message
     * @param group
     */
    void onGroupMessage(GroupMessage message, Group group);

    /**
     * 收到讨论组消息后的回调
     * @param message
     * @param discuss
     */
    void onDiscussMessage(DiscussMessage message, Discuss discuss);
}
