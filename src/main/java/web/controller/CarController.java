package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.ResourceBundle;

@Controller
@RequestMapping("/Cars")
public class CarController {

    @GetMapping
    public String getCars(@RequestParam(name="count", defaultValue = "5", required = false)int count, Model model) {
        CarService carService = new CarService();
        carService.getCars();
        model.addAttribute("cars", carService.getCarsByCount(count, carService.getCarsList()));
        return "cars";
    }
}
