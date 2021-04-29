package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.entities.Task;
import com.example.demo.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {
  
  private final TaskRepository taskRepository;

  @Autowired
  public TaskController(TaskRepository taskRepository){
    this.taskRepository = taskRepository;
  }

  @GetMapping("/index")
  public String showUserList(Model model){
    model.addAttribute("users", taskRepository.findAll());
    return "index";
  }

  @GetMapping("/signup")
  public String showSignUp(Task task){
    return "signup";
  }

  @PostMapping("/addUser")
  public String addUser(@Valid Task task, BindingResult result, Model model){
    if (result.hasErrors()){
      return "signup";
    }

    taskRepository.save(task);
    return "redirect:/index";
  }

  @GetMapping("/edit/{id}")
  public String showUpdate(@PathVariable("id") long id, Model model){
    Task task = taskRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("No such user with id " + id));
    model.addAttribute("user", task);

    return "update";
  }

  @PostMapping("/update/{id}")
  public String updateUser(@PathVariable("id") long id, @Valid Task task, BindingResult result, Model model){
    if (result.hasErrors()){
      return "update";
    }

    taskRepository.save(task);

    return "redirect:/index";
  }

  @GetMapping("/delete/{id}")
  public String deleteUser(@PathVariable("id") long id, Model model){
    Task task = taskRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("No such user with id " + id));

    taskRepository.delete(task);

    return "redirect:/index";
  }
}
