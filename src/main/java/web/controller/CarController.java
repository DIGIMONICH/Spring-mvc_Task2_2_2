package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
@RequestMapping("/Cars")
public class CarController {
    CarService carServiceImp = new CarServiceImp();

    @GetMapping
    public String getCars(@RequestParam(name="count", defaultValue = "5", required = false)int count, Model model) {

        carServiceImp.getCars();
        model.addAttribute("cars", carServiceImp.getCarsByCount(count, carServiceImp.getCarsList()));
        return "cars";
    }
}
