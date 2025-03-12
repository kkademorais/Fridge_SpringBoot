package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodService {

    public FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository){
        this.foodRepository = foodRepository;
    }

    //CRUD = Create - Read - Update - Delete
    public List<Food> getAll(){
        return foodRepository.findAll();
    }
    public Food save(Food food){
        return foodRepository.save(food);
    }
    public void delete(Long id){
        foodRepository.deleteById(id);
    }

}
