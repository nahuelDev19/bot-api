package com.nahuel.bot_api.models;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "users")
@NoArgsConstructor @AllArgsConstructor @Data
public class UserEntity {


    private String name;
    private String email;
    private String password;



}
