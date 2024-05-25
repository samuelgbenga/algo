package week_5.class_activity3a;

import week_5.class_activity3a.enums.Gender;
import week_5.class_activity3a.enums.MealType;
import week_5.class_activity3a.model.Cafeteria;
import week_5.class_activity3a.model.DecaDevs;
import week_5.class_activity3a.service.implementation.CafeteriaServiceImpl;

public class Main {



    public static void main(String[] args) {


        DecaDevs male1 = new DecaDevs("samuel joseph", Gender.MALE);
        DecaDevs female1 = new DecaDevs("Angel Angel", Gender.FEMALE);
        DecaDevs male2 = new DecaDevs("egien vector", Gender.MALE);
        DecaDevs female2 = new DecaDevs("itomi oti", Gender.FEMALE);

        // create a sample meal
        Cafeteria cafeteria = new Cafeteria(MealType.FRIED_RICE);

        // create a cafeteria
        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();

        cafeteriaService.addDecadevs(female2);
        cafeteriaService.addDecadevs(male2);
        cafeteriaService.addDecadevs(female1);

        System.out.println(cafeteriaService.collectMeal(cafeteria));
        System.out.println(cafeteriaService.collectMeal(cafeteria));
        System.out.println(cafeteriaService.collectMeal(cafeteria));



    }

}
