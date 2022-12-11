package com.toDoApp.toDoApp.Dto;
import com.toDoApp.toDoApp.CompletedStatus;
import com.toDoApp.toDoApp.ToDo;
import lombok.*;

import javax.validation.constraints.Positive;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class ToDoPatchDto {
    private long toDoId;

    private String title;

    private int order;

    private CompletedStatus completedStatus;

    //public void setToDo(long todoId){this.todoId = todoId}

}

