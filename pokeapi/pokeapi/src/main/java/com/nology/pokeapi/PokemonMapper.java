package com.nology.pokeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// ***********
// Maps a list of Pokemon into the PokemonListResult for the controller
// ***********
@Service
public class PokemonMapper {

    public PokemonMapper() {
    }

    public PokemonListResult mapPokemonToResult(List<Pokemon> pokemonList) {
        PokemonListResult result = new PokemonListResult();

        // we need some results
        ArrayList<Pokemon> allPokemon = (ArrayList<Pokemon>) pokemonList;
        result.setResults(allPokemon);

        // we need a count
        int size = result.getResults().size();
        result.setCount(size);

        // we need to return it
        return result;
    }
}
