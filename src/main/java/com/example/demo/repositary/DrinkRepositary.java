package com.example.demo.repositary;

import com.example.demo.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface DrinkRepositary extends JpaRepository<Drink, Long> {
    // @Query("")
    //
}
