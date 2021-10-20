package com.johnyehyo.agentLive;

import com.johnyehyo.agentLive.handler.Email;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AgentLiveApplication.class})
class AgentLiveApplicationTests {

    @Autowired
    private Email email;


    @Test
    void sendEmai() {
        email.send("测试");
    }

}
