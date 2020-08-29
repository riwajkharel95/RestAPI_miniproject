package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BeerController {

    @Autowired
    private BeerService service;

    @PostMapping("/addBeer")
    public Beer addBeer(@RequestBody Beer beer){
        return service.saveBeer(beer);
    }

    @GetMapping("/allbeers")
    public List<Beer> getallbeers(){
        return service.getBeers();
    }

    @DeleteMapping("/delete/{id}")
    public String deletebeer(@PathVariable  long id){
        return service.delete(id);
    }

}
