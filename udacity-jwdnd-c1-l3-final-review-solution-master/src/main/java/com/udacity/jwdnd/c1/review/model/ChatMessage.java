package com.udacity.jwdnd.c1.review.model;

public class ChatMessage {
    private Integer messageId;
    private String username;
    private String messageText;
    private String mood;

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
