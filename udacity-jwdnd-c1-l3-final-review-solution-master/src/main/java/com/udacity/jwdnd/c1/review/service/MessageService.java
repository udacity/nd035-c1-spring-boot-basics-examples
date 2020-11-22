package com.udacity.jwdnd.c1.review.service;

import com.udacity.jwdnd.c1.review.mapper.MessageMapper;
import com.udacity.jwdnd.c1.review.model.ChatForm;
import com.udacity.jwdnd.c1.review.model.ChatMessage;
import com.udacity.jwdnd.c1.review.model.MoodCount;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MessageService {
    private MessageMapper messageMapper;

    public MessageService(MessageMapper messageMapper) {
        this.messageMapper = messageMapper;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating MessageService bean");
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());
        switch (chatForm.getMessageType()) {
            case "Say":
                newMessage.setMessageText(chatForm.getMessageText());
                break;
            case "Shout":
                newMessage.setMessageText(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                newMessage.setMessageText(chatForm.getMessageText().toLowerCase());
                break;
        }
        if (chatForm.getMessageVolume() <= 5){
            newMessage.setMood("weakly");
        }else if (chatForm.getMessageType().equals("Shout")){
            newMessage.setMood("angrily");
        }else{
            newMessage.setMood("anxiously");
        }
        this.messageMapper.addMessage(newMessage);
    }

    public List<ChatMessage> getChatMessages() {
        return messageMapper.getAllMessages();
    }
    public List<MoodCount> getMoodCounts() {
        return messageMapper.getAllMoods();
    }
}
