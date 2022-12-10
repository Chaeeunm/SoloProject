package com.toDoApp.toDoApp.Dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class ToDoPostDto {
    public String getTitle() {
        return title;
    }

    public int getOrder() {
        return order;
    }

    @NotBlank(message = "할일 내용을 입력해야 합니다.")
        private String title;

        @Positive
        @NotBlank(message = "할일 순서를 입력해야 합니다.")
        private int order;

    }
