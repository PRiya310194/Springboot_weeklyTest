package com.example.restaurant.controller;
import com.example.restaurant.model.Restaumodel;
import com.example.restaurant.service.Restauservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/restaurant")
public class Restaucontroller {
    @Autowired
    private final Restauservice restauservice;
    public Restaucontroller(Restauservice restauservice) {
        this.restauservice = restauservice;
    }
    @GetMapping("/get-all")
    public List<Restaumodel> getrestau(){
        return restauservice.getAll();
    }
    @GetMapping("/get-by/name/{name}")
    public Restaumodel getByname(@PathVariable String name){
        return restauservice.getbyname(name);
    }
    @PostMapping("/save-restau-info")
    public void addResatu(@RequestBody Restaumodel restaumodel){
        restauservice.addInfo(restaumodel);
    }
    @PutMapping("/update-restau-by/name/{name}")
    public void updateByname(@PathVariable String name,@RequestBody Restaumodel restaumodel){
        restauservice.updatebyname(name,restaumodel);
    }
    @DeleteMapping("/delete-restau-by/name/{name}")
    public void deleteByname(@PathVariable String name){
        restauservice.deletebyname(name);
    }

}
