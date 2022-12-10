package com.toDoApp.toDoApp.Dto;

import com.toDoApp.toDoApp.ToDo;
import lombok.Getter;

import javax.validation.constraints.Positive;
public class ToDoPatchDto {
    private long toDoId;

    private String title;

    public long getToDoId() {
        return toDoId;
    }

    public String getTitle() {
        return title;
    }

    public int getOrder() {
        return order;
    }

    public ToDo.CompletedStatus getCompletedStatus() {
        return completedStatus;
    }

    @Positive
    private int order;

    private ToDo.CompletedStatus completedStatus;

    //public void setToDo(long todoId){this.todoId = todoId}

}

