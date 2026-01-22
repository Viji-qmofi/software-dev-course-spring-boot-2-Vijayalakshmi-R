package com.example.mycollections.models;

public class Movie extends LibraryItem{
    private String director;
    private int runTime;

    public Movie(String name, int year, String director, int runTime) {
        super(name, year);
        this.runTime = runTime;
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    @Override
    public String toString() {
        return name + " by " + director;
    }
}
