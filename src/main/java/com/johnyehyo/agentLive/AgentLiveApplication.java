package com.johnyehyo.agentLive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class AgentLiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgentLiveApplication.class, args);
    }

}
