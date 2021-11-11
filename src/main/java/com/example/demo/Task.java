package com.example.demo;

public class Task {

    private int id;
    private String nameTask;
    private String textTask;

    public Task(int id, String nameTask, String textTask) {
        this.id = id;
        this.nameTask = nameTask;
        this.textTask = textTask;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getTextTask() {
        return textTask;
    }

    public void setTextTask(String textTask) {
        this.textTask = textTask;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", nameTask='" + nameTask + '\'' +
                ", textTask='" + textTask + '\'' +
                '}';
    }
}
