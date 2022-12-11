package com.toDoApp.toDoApp.Dto;

import com.toDoApp.toDoApp.CompletedStatus;
import com.toDoApp.toDoApp.ToDo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ToDoResponseDto {

    private long toDoId;
    private String title;
    private int order;
    private CompletedStatus completedStatus;

    }

