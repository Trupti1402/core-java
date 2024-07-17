package org.example.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Restaurant {
    private long restaurant_id;
    private String restaurant_name;
    private String restaurant_address;
    private String restaurant_phone;
    private int restaurant_ratings;

}
