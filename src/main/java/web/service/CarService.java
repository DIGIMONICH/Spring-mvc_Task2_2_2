package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCarsList();

    List<Car> getCars();

    List<Car> getCarsByCount(int count, List<Car> cars);
}
