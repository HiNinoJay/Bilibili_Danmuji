package xyz.acproject.danmuji.service;

import xyz.acproject.danmuji.entity.chatgpt.ChatResVo;

/**
 * @author : zengzhongjie
 * @date : 2024/2/3 01:27
 */
public interface ChatGPTService {


    ChatResVo chatCompletions(String msg);
}
