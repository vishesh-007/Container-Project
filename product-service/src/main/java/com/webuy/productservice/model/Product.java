package com.webuy.productservice.model;

import lombok.AllArgsConstructor;
import lombok. Builder;
import lombok. Data;
import lombok. NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping. Document;

import java.math. BigDecimal;
@Document (value = "product")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    public String getId() {
        return null;
    }

    public String getName() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public BigDecimal getPrice() {
        return null;
    }


}
