package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/food")
public class FoodController {

    public final FoodService foodService;

    public FoodController(FoodService foodService){
        this.foodService = foodService;
    }

    //Requisições = Get - Post - Put - Delete
    @GetMapping
    public List<Food> getAll(){
        return foodService.getAll();
    }

    @PostMapping
    public Food create(@RequestBody Food food){
        return foodService.save(food);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable long id){
        foodService.delete(id);
    }


}
