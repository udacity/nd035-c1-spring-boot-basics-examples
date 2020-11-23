package com.udacity.jwdnd.c1.review.mapper;

import com.udacity.jwdnd.c1.review.model.ChatMessage;
import com.udacity.jwdnd.c1.review.model.MoodCount;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MessageMapper {

    @Select("SELECT * FROM MESSAGES order by messageid desc limit 3")
    List<ChatMessage> getAllMessages();

    @Insert("INSERT INTO MESSAGES (username, messagetext, mood) VALUES(#{username}, #{messageText}, #{mood})")
    @Options(useGeneratedKeys = true, keyProperty = "messageId")
    int addMessage(ChatMessage chatMessage);

    @Select("select count(messageid) as count,mood from messages group by mood")
    List<MoodCount> getAllMoods();

}