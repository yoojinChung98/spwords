package com.project.spwords.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TestService {

    private final OpenAiChatModel chatModel;

    public String testAsk(String prompt) {
        return chatModel.call(prompt);
    }
}
