package it.develhope.primipassiFirstAPI05.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CarDTO {

    @NotBlank(message = "Mondatory")
    public String id;
    @NotBlank(message = "Mondatory")
    public String modelName;
    public double price;

}
