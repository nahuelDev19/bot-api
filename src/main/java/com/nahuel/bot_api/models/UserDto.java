package com.nahuel.bot_api.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    private UUID id;
    private String name;
    private String email;
    private String password;




}
