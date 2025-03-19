package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService {
    List<Car> carsList = new ArrayList<>();

    public CarServiseImpl() {
        carsList.add(new Car("VAZ", "Blue", 2000));
        carsList.add(new Car("Hyundai", "Red", 2009));
        carsList.add(new Car("BMW", "White", 2004));
        carsList.add(new Car("Honda", "Yellow", 2010));
        carsList.add(new Car("Mercedes", "Blue", 2011));

    }


    public List<Car> getCountCars(Integer count) {

        if (count == null || count >= 5) {
            return carsList;
        } else {
            return carsList.subList(0, count);
        }
    }

}