package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BeerService {

    @Autowired
    private BeerRestRepository repo;

    public Beer saveBeer(Beer beer){
        return repo.save(beer);
    }

    public List<Beer> getBeers(){
        return repo.findAll();
    }

    public String delete(long id){
        repo.deleteById(id);
        return "Beer removed";
    }

}
