package com.techienotes.chatterbot.controller;

import lombok.extern.slf4j.Slf4j;
import org.alicebot.ab.Chat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatterbot")
@Slf4j
public class ChatBotController {

    @Autowired
    private Chat chatSession;

    @GetMapping("{question}")
    public String getAnswer(@PathVariable("question") String question) {
        return chatSession.multisentenceRespond(question);
    }
}
