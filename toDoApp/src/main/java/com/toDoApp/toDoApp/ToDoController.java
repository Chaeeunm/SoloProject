package com.toDoApp.toDoApp;

import com.toDoApp.toDoApp.Dto.ToDoPatchDto;
import com.toDoApp.toDoApp.Dto.ToDoPostDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;

@RestController
@RequestMapping("/todo")
@Validated
@Slf4j
public class ToDoController {

//할일 등록 메서드
    @PostMapping
    public ResponseEntity postToDo(@Valid @RequestBody ToDoPostDto requestBody){
//        ToDo toDo = mapper.
//        return new RequestEntity<>((//
//                // )),
//                HttpStatus.CREATED);
//        )
        return null;
    }

//할일 수정 메서드
    @PatchMapping("/{toDo-id}")
    public ResponseEntity patchToDo(@PathVariable("toDo-id") @Positive long toDoId,
        @Valid @RequestBody ToDoPatchDto requestBody){
return null;
    }

//할일 1개 가져오는 메서드
    @GetMapping("/{toDo-id}")
    public RequestEntity getToDo(
            @PathVariable("toDo-id") @Positive long toDoId){
        return null;
    }

    //할일 리스트 가져오는 메서드
    public ResponseEntity getToDoList(){
        return null;
    }

    //할일 1개 삭제 메서드
    @DeleteMapping("/{toDo-id}")
    public ResponseEntity deleteToDo(@PathVariable("toDo-id") @Positive long toDoId){
        return null;
    }

    //할일 전부 삭제 메서드
    @DeleteMapping
    public RequestEntity deleteAllToDo(){
        return null;
    }


}
