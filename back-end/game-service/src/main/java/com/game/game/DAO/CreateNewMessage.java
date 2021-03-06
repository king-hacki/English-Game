package com.game.game.DAO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class CreateNewMessage {

    @NotBlank(message = "Field 'message' must be filled")
    private String message;

    @NotBlank(message = "Field 'username' must be filled")
    private String username;

    @NotBlank(message = "Field 'date' must be filled")
    private String date;

    @NotBlank(message = "Field 'game' must be filled")
    private String game;
}
