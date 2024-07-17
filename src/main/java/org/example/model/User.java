package org.example.model;

import lombok.*;


    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    @ToString
    @Builder
    public class User {

        private int user_id;
        private String user_name;
        private String user_address;
        private String user_phone;

        public String getId() {
            return null;
        }

        public String getName() {
            return null;
        }

        public String getAddress() {
            return null;
        }

        public String getPhone() {
            return null;
        }
    }
