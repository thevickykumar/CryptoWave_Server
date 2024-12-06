package com.example.Trading.service;

import com.example.Trading.model.CoinDTO;
import com.example.Trading.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}

