package ie.atu.week5_ioc_di;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Min(value = 1, message = "ID must be greater than 0")
    private int id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @Positive(message = "Value must be positive")
    private double price;
}
