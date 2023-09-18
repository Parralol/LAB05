package com.example.servingwebcontent;


public class User {
    private Integer userId;
    private Integer id;
    private String title;
    private Boolean completed;

    public Boolean getCompleted() {
        return completed;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId(Integer userid) {
        this.userId = userid;
    }
    public User(Integer userId, Integer id, String title, Boolean completed){
        super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
    }
    public User() {}
}

