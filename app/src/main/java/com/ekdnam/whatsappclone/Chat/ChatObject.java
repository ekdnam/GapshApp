package com.ekdnam.whatsappclone.Chat;

/**
 * A simple class which encapsulates the data required to differentiate a chat, its unique id.
 *
 */
public class ChatObject {
    private String chatId;

    public ChatObject(String chatId){
        this.chatId = chatId;
    }

    public String getChatId() {
        return chatId;
    }
}
