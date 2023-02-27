package it.develhope.primipassiFirstAPI05.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class CarDTO {

    public CarDTO(){};

    @NotBlank(message = "Mondatory")
    public String id;
    @NotBlank(message = "Mondatory")
    public String modelName;
    public double price;

}
