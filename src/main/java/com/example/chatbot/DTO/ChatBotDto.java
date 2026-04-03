package com.example.chatbot.DTO;

public class ChatBotDto {
    String message;

    public String getText(){
       return message;
    }
    public void setText(String message){
        this.message=message;
    }
    
}
