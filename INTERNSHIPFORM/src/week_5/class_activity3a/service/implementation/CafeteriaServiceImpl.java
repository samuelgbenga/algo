package week_5.class_activity3a.service.implementation;

import week_5.class_activity3a.model.Cafeteria;
import week_5.class_activity3a.model.DecaDevs;
import week_5.class_activity3a.model.DecadevsComparator;
import week_5.class_activity3a.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {

   PriorityQueue<DecaDevs> devsQueue;

    public CafeteriaServiceImpl() {
        devsQueue = new PriorityQueue<>(new DecadevsComparator());
    }

    @Override
    public void addDecadevs(DecaDevs devs) {
        devsQueue.add(devs);

    }

    @Override
    public String collectMeal(Cafeteria meal) {

        if(devsQueue.isEmpty()){
            return "No devs on the queue";
        }

        DecaDevs decaDevs = devsQueue.poll();

        return decaDevs.getName()+ " has taken "+ meal.getMealType();
    }
}
