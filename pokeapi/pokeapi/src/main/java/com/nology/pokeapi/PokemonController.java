package com.nology.pokeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// ***********
// Talking / incoming http requests / outgoing responses
// ***********
@RestController() // NIce bit of spring functionality which will link our methods (below) into incoming http requests
public class PokemonController {

    @Autowired
    PokemonMapper mapper;

    @Autowired
    PokemonRepository repository;

    @GetMapping("/pokemon") // OOOOO so we can change the path in the url? that's awesome.
    public PokemonListResult getAll() {
        return mapper.mapPokemonToResult(this.repository.findAll());
    }


    @GetMapping("/pokemon/{id}")
    public Pokemon getById(@PathVariable int id) {
        return this.repository.findById(id).get();
    }
}
