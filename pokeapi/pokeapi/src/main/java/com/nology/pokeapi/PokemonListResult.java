package com.nology.pokeapi;

import java.util.ArrayList;

public class PokemonListResult {

    private int count;
    private ArrayList<Pokemon> results;

    public int getCount() {
        return count;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList<Pokemon> getResults() {
        return this.results;
    }

}
