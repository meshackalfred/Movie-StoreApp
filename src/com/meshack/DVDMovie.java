package com.meshack;

import com.sun.jdi.PrimitiveValue;

import java.util.List;

public class DVDMovie extends  Movie{
    private final int PRICE = 10;
    private final int LOYALTY_POINTS = 5;

    public DVDMovie(String title, int stock) {
        super(title, stock);
    }

    public DVDMovie(String title, String releaseYear, EMovieGenre genre, Director director, List<Actor> actors, int stock) {
        super(title, releaseYear, genre, director, actors, stock);
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    protected int getLoyaltyPoints() {
        return LOYALTY_POINTS;
    }
}
