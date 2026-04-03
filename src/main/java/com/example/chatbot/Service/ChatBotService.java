package com.example.chatbot.Service;

import org.springframework.stereotype.Service;

@Service
public class ChatBotService {
    public String getReply(String message){
        message=message.toLowerCase();

        if(message.contains("hi")){
            return "hello";
        }
        else if(message.contains("bye")){
            return "goodbye";
        }
        else if(message.contains("how are you doing")){
            return "I am doing great";
        }
        else{
            return "I don't understand";
        }

    }

    
}
