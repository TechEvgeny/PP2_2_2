package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String testCarsMethod(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carService.getCountCars(count));
        return "car";
    }
}
