package com.example.restaurant.service;
import com.example.restaurant.model.Restaumodel;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
@Service
public class Restauservice {
    private static List<Restaumodel> restaus = new ArrayList<>();
    private static int uid = 0;
        static {
            restaus.add(new Restaumodel(++uid, "Panjabi", "Ranchi",55415928,"24-Hour-front-desk",500));
            restaus.add(new Restaumodel(++uid, "Marathi", "patna",55415928,"24-Hour-front-desk",700));
            restaus.add(new Restaumodel(++uid, "Taj", "Delhi",55415928,"24-Hour-front-desk",900));
   }
    public void addInfo(Restaumodel restaumodel) {
     restaus.add(restaumodel);
    }
    public List<Restaumodel> getAll() {
        return restaus;
    }
    public Restaumodel getbyname(String name) {
        Predicate<? super Restaumodel> predicate = restaumodel -> restaumodel.getRestauName().equals(name);
        Restaumodel restaumodel =restaus.stream().filter(predicate).findFirst().get();
        return restaumodel;
    }
    public void deletebyname(String name) {
            Predicate<? super Restaumodel> predicate = restaumodel -> restaumodel.getRestauName().equals(name);
            restaus.removeIf(predicate);
    }
    public void updatebyname(String name, Restaumodel restaumodel) {
            Restaumodel restaumodel1 = getbyname(name);
            restaumodel1.setRestauUID(restaumodel.getRestauUID());
            restaumodel1.setRestauName(restaumodel.getRestauName());
            restaumodel1.setRestauAdd(restaumodel.getRestauAdd());
            restaumodel1.setContNumber(restaumodel.getContNumber());
            restaumodel1.setSpeciality(restaumodel.getSpeciality());
            restaumodel1.setTotalStaff(restaumodel.getTotalStaff());
    }
}
