package com.toDoApp.toDoApp;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long toDoId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private int order;

    @Enumerated(EnumType.STRING)
    private CompletedStatus completedStatus = CompletedStatus.TODO_FALSE;

    public Long getToDoId() {
        return toDoId;
    }

    public void setToDoId(Long toDoId) {
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

    public CompletedStatus getCompletedStatus() {
        return completedStatus;
    }

    public void setCompletedStatus(CompletedStatus completedStatus) {
        this.completedStatus = completedStatus;
    }

    public enum CompletedStatus {
        TODO_FALSE("시작 전"),
        TODO_INPROGRESS("진행중"),
        TODO_COMPLECATION("완료");

        @Getter
        private  String completedStatus;

        CompletedStatus(String completedStatus){
            this.completedStatus = completedStatus;
        }
    }
    }

