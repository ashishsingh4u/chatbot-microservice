package com.techienotes.chatterbot.configuration;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;
import org.alicebot.ab.configuration.BotConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public Chat alice() {
        var bot = new Bot(BotConfiguration.builder()
                        .name("alice")
                        .path("src/main/resources")
                        .build()
        );
        return new Chat(bot);
    }

    @Bean
    public ScheduledExecutorService executorService() {
        return Executors.newScheduledThreadPool(2);
    }
}
