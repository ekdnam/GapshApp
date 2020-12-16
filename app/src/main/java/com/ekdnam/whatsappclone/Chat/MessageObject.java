package com.ekdnam.whatsappclone.Chat;

import java.util.ArrayList;

/**
 * Encapsulates information required to identify an unique text message, the messageID, senderID,
 * and the message text
 */
public class MessageObject {

    String messageId,
            senderId,
            message;

    ArrayList<String> mediaUrlList;

    /**
     * @param messageId
     * @param senderId
     * @param message
     * @param mediaUrlList the urls of images attached in a message, fetched from Firebase
     */
    public MessageObject(String messageId, String senderId, String message, ArrayList<String> mediaUrlList) {
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.mediaUrlList = mediaUrlList;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getMessage() {
        return message;
    }

    public ArrayList<String> getMediaUrlList() {
        return mediaUrlList;
    }
}
