/*
package com.chatbot.web.test;

import com.chatbot.web.domains.*;
import com.chatbot.web.mappers.ChatHistoryMapper;
import com.chatbot.web.mappers.ChatMapper;
import com.chatbot.web.mappers.ExamMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

@Service
public class Test {
    @Autowired
    User user;
    @Autowired Chat chat;
    @Autowired ChatHistory chatHistory;
    @Autowired
    ChatMapper chatMapper;
    @Autowired
    ChatHistoryMapper chatHistoryMapper;
    @Autowired
    ExamMapper examMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisTemplate<String, Object> redisTemplate;
    private ObjectMapper mapper;
    private JSONParser parser;
    private String jsonStr;
    private JSONObject obj, obj1, obj2, obj3, obj4, obj5, obj6, arrObj;
    private JSONArray arr, arr2;
    private ValueOperations<String, Object> vop;

    /*
    public void examAnalysis() {
        System.out.println("---chat---");
        System.out.println("id: "+chat.getId());
        System.out.println("chatBody: "+chat.getChatBody());

        System.out.println("---chat history---");
        System.out.println(chatHistory.getChatId());
        System.out.println("chatKind: "+chatHistory.getChatKind());
        System.out.println(chatHistory.getChatBody());

        System.out.println("---exam---");
        System.out.println(exam.getExamKind());
        System.out.println(exam.getExamAnswer());
        System.out.println(exam.getExamChoice1());
        System.out.println(exam.getExamChoice2());
        System.out.println(exam.getExamChoice3());
        System.out.println(exam.getExamChoice4());
        System.out.println(exam.getExamChoice5());
        System.out.println(exam.getExamContent());
        System.out.println(exam.getExamDivision());
        System.out.println(exam.getExamNum());
        System.out.println(exam.getExamQuestion());
        System.out.println(exam.getSubejectCode());

        System.out.println("---exam_analysis---");
        System.out.println(examAnalysis.getExamKind());
        System.out.println(examAnalysis.getExamNum());
        System.out.println(examAnalysis.getSubjectCode());
        System.out.println(examAnalysis.getWrongAnswer());
    }

}

 */
