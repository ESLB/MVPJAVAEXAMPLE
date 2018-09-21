package com.seleb.eduardo.mvp_java_example.data.models;

public class Task {

    private String id;
    private String Description;
    private String Title;
    private String Date;

    public Task(){

    }

    public Task(String id, String description, String title, String date) {
        this.id = id;
        Description = description;
        Title = title;
        Date = date;
    }

    public Task(String description, String title, String date) {
        Description = description;
        Title = title;
        Date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
