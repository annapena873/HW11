package com.example.hw11.model;

public class Team {
    private String name;
    private String country;
    private String league;
    private String stadium;
    private int yearFounded;

    public Team(String name, String country, String league, String stadium, int yearFounded) {
        this.name = name;
        this.country = country;
        this.league = league;
        this.stadium = stadium;
        this.yearFounded = yearFounded;
    }

    public String getName() { return name; }
    public String getCountry() { return country; }
    public String getLeague() { return league; }
    public String getStadium() { return stadium; }
    public int getYearFounded() { return yearFounded; }
}