package com.sparta.boardmaster.dto;

import lombok.Getter;

@Getter
public class BoardSimpleResponseDto {

    private final String title;

    public BoardSimpleResponseDto(String title) {
        this.title = title;
    }
}
