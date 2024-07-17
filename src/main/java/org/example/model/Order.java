package org.example.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Order {
   private long order_id;
   private int order_quantity;
   private String order_name;
   private int order_ratings;

}
