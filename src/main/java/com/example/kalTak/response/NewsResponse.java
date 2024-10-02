package com.example.kalTak.response;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewsResponse {

    String status;
    int totalResults;

    List<com.example.kalTak.response.ArticleResponse> articles;
}