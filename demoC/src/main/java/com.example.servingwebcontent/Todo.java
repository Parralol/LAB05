package com.example.servingwebcontent;

public class Todo {
    private Integer userId;
    private Integer id;
    private String title;
    private boolean completed;

    @Override
    public String toString() {
        return "Todo{" +
                "userId=" + userId +
                ", id=" + id +
                ", tittle='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
