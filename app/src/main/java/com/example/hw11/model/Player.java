package com.example.hw11.model;

public class Player {
    private String name;
    private int age;
    private String country;
    private String position;
    private String team;
    private int jerseyNumber;

    public Player(String name, int age, String country, String position, String team, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.position = position;
        this.team = team;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCountry() { return country; }
    public String getPosition() { return position; }
    public String getTeam() { return team; }
    public int getJerseyNumber() { return jerseyNumber; }
}
