package com.chatbot.web.domains;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import java.util.LinkedHashMap;

@Component @Getter @Setter
@NoArgsConstructor
public class Response {
    private String version = "2.0";
    private Response template;
    private LinkedHashMap<String, String> outputs;
    private String text;
}