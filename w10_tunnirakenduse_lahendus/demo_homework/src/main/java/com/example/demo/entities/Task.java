package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotBlank(message = "Must enter a task")
  private String task;

  @NotBlank(message = "Must enter do date")
  private String doDate;

  public Task() {
  }

  public Task(String task, String doDate) {
    this.task = task;
    this.doDate = doDate;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public void setDoDate(String doDate) {
    this.doDate = doDate;
  }

  public String getTask() {
    return task;
  }

  public String getDoDate() {
    return doDate;
  }

  @Override
  public String toString() {
    return "Task{" + "id=" + id + ", todo=" + task + ", do date=" + doDate + '}';
  }
}