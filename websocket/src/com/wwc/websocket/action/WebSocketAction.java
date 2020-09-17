package com.wwc.websocket.action;

import com.alibaba.fastjson.JSONObject;
import com.wwc.websocket.common.BaseServlet;
import com.wwc.websocket.common.WebSocket;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
//@WebServlet(urlPatterns = {"/webSocketByTomcat/serviceToClient"})
@RequestMapping(value="/webSocketByTomcat/serviceToClient")
public class WebSocketAction {

    private WebSocket websocket = new WebSocket();

    public void sendMsg(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("strat sendMsg....");
        JSONObject json = new JSONObject();
        json.put("to", request.getSession().getId());
        json.put("msg", "欢迎连接WebSocket！！！！");
        websocket.onMessage(json.toJSONString());
    }

   /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //加上这个super后为什么会出现405
        super.doGet(request, resp);
        JSONObject json = new JSONObject();
        json.put("to", request.getSession().getId());
        json.put("msg", "欢迎连接WebSocket！！！！");
        websocket.onMessage(json.toJSONString());
        System.out.println("doGet");
    }*/
}
