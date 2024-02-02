package xyz.acproject.danmuji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import xyz.acproject.danmuji.entity.base.Response;
import xyz.acproject.danmuji.entity.chatgpt.ChatResVo;
import xyz.acproject.danmuji.entity.login_data.Qrcode;
import xyz.acproject.danmuji.http.HttpUserData;
import xyz.acproject.danmuji.service.ChatGPTService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author : zengzhongjie
 * @date : 2024/2/3 01:15
 */
@Controller("/chatGPT")
public class ChatGPTController {

    @Resource
    private ChatGPTService chatGPTService;


    @ResponseBody
    @GetMapping(value = "/test")
    public Response<?> test(HttpServletRequest req) {
        ChatResVo chatResVo = chatGPTService.chatCompletions("你好！");
        return Response.success(chatResVo, req);
    }

}
