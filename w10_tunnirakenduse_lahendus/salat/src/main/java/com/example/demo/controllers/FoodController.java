package com.example.demo.controllers;

import javax.validation.Valid;

import com.example.demo.FoodClass;
import com.example.demo.repositories.FoodRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {
  
  private final FoodRepository foodRepository;

  @Autowired
  public foodController(FoodRepository userRepository){
    this.foodRepository = foodRepository;
  }

  @GetMapping("/index")
  public String showUserList(Model model){
    model.addAttribute("users", foodRepository.findAll());
    return "index";
  }

  @GetMapping("/signup")
  public String showSignUp(FoodClass food){
    return "signup";
  }

  @PostMapping("/addUser")
  public String addUser(@Valid FoodClass food, BindingResult result, Model model){
    if (result.hasErrors()){
      return "signup";
    }

    foodRepository.save(food);
    return "redirect:/index";
  }

  @GetMapping("/edit/{id}")
  public String showUpdate(@PathVariable("id") long id, Model model){
    FoodClass food = foodRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("No such user with id " + id));
    model.addAttribute("food", food);

    return "update";
  }

  @PostMapping("/update/{id}")
  public String updateUser(@PathVariable("id") long id, @Valid FoodClass food, BindingResult result, Model model){
    if (result.hasErrors()){
      return "update";
    }

    foodRepository.save(food);

    return "redirect:/index";
  }

  @GetMapping("/delete/{id}")
  public String deleteUser(@PathVariable("id") long id, Model model){
    FoodClass food = foodRepository.findById(id)
      .orElseThrow(() -> new IllegalArgumentException("No such food with id " + id));

    foodRepository.delete(food);

    return "redirect:/index";
  }
}