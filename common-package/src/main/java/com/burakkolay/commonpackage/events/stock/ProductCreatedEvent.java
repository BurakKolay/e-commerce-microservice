package com.burakkolay.commonpackage.events.stock;

import com.burakkolay.commonpackage.events.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreatedEvent implements Event {
    private UUID carId;
    private UUID modelId;
    private UUID brandId;
    private int modelYear;
    private String plate;
    private String state;
    private double dailyPrice;
    private String modelName;
    private String brandName;
}
