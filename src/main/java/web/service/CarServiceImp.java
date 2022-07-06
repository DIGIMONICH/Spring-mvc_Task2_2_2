package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImp implements CarService {
    private List<Car> carsList = new ArrayList<>();

    public List<Car> getCarsList() {
        return carsList;
    }

    public List<Car> getCars() {
        carsList.add(new Car(1, "Honda", "Black"));
        carsList.add(new Car(2, "Mercedes", "White"));
        carsList.add(new Car(3, "BMW", "Grey"));
        carsList.add(new Car(4, "Lada", "Red"));
        carsList.add(new Car(5, "Hyundai", "Black"));
        return  carsList;
    }

    public List<Car> getCarsByCount(int count, List<Car> cars) {
        if (count == 0 || count > 5) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
