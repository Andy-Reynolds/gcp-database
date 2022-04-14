package com.nology.pokeapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Indicating to spring that this is a repository, and we can use it for accessing external information
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

}
