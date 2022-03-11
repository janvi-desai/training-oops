package com.tarktech.training.ipl.domain;

public class Player {
    private String name;
    private PlayerRole Role;

    public Player(String name, PlayerRole Role) {
        this.name = name;
        this.Role = Role;
    }

    public PlayerRole getRole(){
        return Role;
    }

    @Override
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }
}
