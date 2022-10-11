package com.example.demo.Controller;

import com.example.demo.model.SalaryDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("calculate")
    public int calc(@RequestParam int salary, @RequestParam int daysOff){
        SalaryDTO salaryDTO = new SalaryDTO(salary, daysOff);
        return salaryDTO.calculation();
    }

}
