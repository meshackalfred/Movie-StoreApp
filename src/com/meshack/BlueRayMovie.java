package com.meshack;

import java.util.List;

public class BlueRayMovie extends Movie{
    private final int PRICE = 20;
    private final int LOYALTY_POINTS = 10;

    public BlueRayMovie(String title, int stock) {
        super(title, stock);
    }

    public BlueRayMovie(String title, String releaseYear, EMovieGenre genre, Director director, List<Actor> actors, int stock) {
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
