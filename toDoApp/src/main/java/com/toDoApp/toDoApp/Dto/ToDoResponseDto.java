package com.toDoApp.toDoApp.Dto;

import com.toDoApp.toDoApp.ToDo;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class ToDoResponseDto {

    private long toDoId;
    private String title;
    private int order;
    private ToDo.CompletedStatus completedStatus;

    public long getToDoId() {
        return toDoId;
    }

    public void setToDoId(long toDoId) {
        this.toDoId = toDoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public ToDo.CompletedStatus getCompletedStatus() {
        return completedStatus;
    }

    public void setCompletedStatus(ToDo.CompletedStatus completedStatus) {
        this.completedStatus = completedStatus;
    }
}

