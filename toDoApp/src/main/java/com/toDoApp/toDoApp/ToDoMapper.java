package com.toDoApp.toDoApp;

import com.toDoApp.toDoApp.Dto.ToDoPatchDto;
import com.toDoApp.toDoApp.Dto.ToDoPostDto;
import com.toDoApp.toDoApp.Dto.ToDoResponseDto;
import org.mapstruct.Mapper;


//Dto -> Entity, Entity -> Dto
@Mapper(componentModel = "spring")
public interface ToDoMapper {
    ToDo ToDoPostDtoToToDo(ToDoPostDto toDoPostDto);

    ToDo ToDoPatchDtoToToDo(ToDoPatchDto toDoPatchDto);

    //ToDo엔티티객체 -> 리스폰스DTo
    ToDoResponseDto ToDoToToDoResponseDto(ToDo todo);
}
