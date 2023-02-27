package it.develhope.primipassiFirstAPI05.Controller;

import it.develhope.primipassiFirstAPI05.DTO.CarDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class CarController {

    @GetMapping(value = "/cars")
    public CarDTO getCars() {
        return new CarDTO();
    }


    @PostMapping(value = "/cars")
    public HttpStatus postCars(@Valid @RequestBody CarDTO carDTO) {
        System.out.println(carDTO.toString());
        return HttpStatus.CREATED;
    }
}
