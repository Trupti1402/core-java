package org.example.model;

import lombok.*;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
    @Builder
    public class Item {

        private long food_id;
        private double food_price;
        private String food_name;
        private String food_category;
        private int food_ratings;


    }

