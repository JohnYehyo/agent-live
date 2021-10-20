package com.johnyehyo.agentLive.handler;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.johnyehyo.agentLive.entity.ResponseVo;
import com.johnyehyo.agentLive.enums.ResponseEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: JohnYehyo
 * @create: 2021-10-20 14:20:53
 */
@Component
public class Agent {

    @Value("${app.urls}")
    private String urls;

    @Autowired
    private Email email;

    @Scheduled(cron = "*/5 * * * * ?")
    public void agent() {
        String[] arrUrl = urls.split(",");
        if (null == arrUrl) {
            return;
        }
        for (int i = 0; i < arrUrl.length; i++) {
            judageHealth(arrUrl[i]);
        }
    }

    private void judageHealth(String url) {
        String s = null;
        try {
            s = HttpUtil.get(url);
        } catch (Exception e) {

        }
        if (null == s) {
            email.send("服务:" + url + " " + ResponseEnum.CONNECTION_EXCEPTION.getValue());
        }
        ResponseVo responseVo = JSONUtil.toBean(s, ResponseVo.class);
        if (responseVo.getCode().intValue() != ResponseEnum.SUCCESS.getCode().intValue()) {
            email.send("服务:" + url + " " + responseVo.getMsg());
        }
    }
}
