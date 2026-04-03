package com.example.chatbot.Controller;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.chatbot.DTO.ChatBotDto;
import com.example.chatbot.Service.ChatBotService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/chat")
public class chatBotController {

    @Autowired
    ChatBotService chatbotservice;

    @PostMapping("/reply")
    public String reply(@RequestBody ChatBotDto chatbotdto) {
        return chatbotservice.getReply(chatbotdto.getText());
        
    }
    
    }
    
    
