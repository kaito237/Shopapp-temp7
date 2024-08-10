package com.project.shopapp.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductDTO {
    @Size(min=3, max =200, message = "title must be between 3 and 200 characters")
    private String name;
    @Min(value= 0, message = "price must be greater than or equal to O")
    @Max(value = 1000, message = "price must be less than or equal to 10,000,000")
    private  Float price;
    private  String thumbnail;
    private String description;
    @JsonProperty
    private  String categoryId;

}
