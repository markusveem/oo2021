package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Food {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotBlank(message = "Must enter a food")
  private String food;

 /* @NotBlank(message = "Must enter an e-mail")
  private String email;*/

  public Food() {
  }

  public Food(String name) {
    this.food = food;
    //this.email = email;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setFood(String food) {
    this.food = food;
  }

  /*public void setEmail(String email) {
    this.email = email;
  }*/

  public String getFood() {
    return food;
  }

  /*public String getEmail() {
    return email;
  }*/

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", food=" + food + ", email=" + food + '}';
  }
}