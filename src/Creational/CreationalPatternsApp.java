package Creational;

import Creational.AbstractFactory.AbstractDinnerFactory;
import Creational.AbstractFactory.AsianDinnerFactory;
import Creational.AbstractFactory.DinnerCreator;
import Creational.Builder.AsianDinnerBuilder;
import Creational.Builder.Dinner;
import Creational.Builder.DinnerBuilder;
import Creational.Builder.DinnerDirector;
import Creational.Prototype.DishesSchedule;
import Creational.Prototype.PremiumDishesSchedule;
import Domain.*;
import Creational.FactoryMethod.DrinkFactory;
import Creational.FactoryMethod.WineFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreationalPatternsApp {

    public static void main(String[] args) throws CloneNotSupportedException {
        callAbstractFactory();
        callFactoryMethod();
        callBuilder();
        callPrototype();
    }

    private static void callAbstractFactory() {
        System.out.println("Order dinner by abstract factory:");
        AbstractDinnerFactory dinnerFactory = new AsianDinnerFactory();
        DinnerCreator dinnerCreator = new DinnerCreator(dinnerFactory);
        dinnerCreator.createDinner();
        System.out.println();
    }

    private static void callFactoryMethod() {
        System.out.println("Order drink by factory method:");
        DrinkFactory drinkFactory = new WineFactory();
        AbstractDrink abstractDrink = drinkFactory.createDrink();
        abstractDrink.getDrink();
        System.out.println();
    }

    private static void callBuilder() {
        System.out.println("Dinner made by dinner builder:");
        DinnerDirector dinnerDirector = DinnerDirector.getInstance();
        DinnerBuilder dinnerBuilder = new AsianDinnerBuilder();
        dinnerDirector.construct(dinnerBuilder);
        Dinner dinner = dinnerBuilder
                .getDinner()
                .addDrink(new CocktailDrink());
        dinner.getSoup();
        dinner.getMainDish();
        dinner.getDrink();
        System.out.println();
    }

    private static void callPrototype() throws CloneNotSupportedException {
        PremiumDishesSchedule dishesSchedule = createDishSchedule();
        System.out.println("Preparing event by Cloneable clone...");
        List<DishesSchedule> eventByCloneableClone = prepareEvent(dishesSchedule, true);
        System.out.println("Event for " + eventByCloneableClone.size() + " people has been prepared!");
        System.out.println();
        System.out.println("Preparing event by Constructor clone...");
        List<DishesSchedule> eventByConstructorClone = prepareEvent(dishesSchedule, false);
        System.out.println("Event for " + eventByConstructorClone.size() + " people has been prepared!");
        System.out.println();
    }

    private static PremiumDishesSchedule createDishSchedule() {
        System.out.println("Event made by prototype:");
        System.out.println();
        Dinner dinner = new Dinner()
                .soup(new ItalianSoup())
                .mainDish(new ItalianMainDish())
                .addDrink(new WineDrink());
        List<String> starters = new ArrayList<>(Arrays.asList("Carpaccio", "Caprese", "Shrimps salad", "Salmon wrap"));
        PremiumDishesSchedule dishesSchedule = new PremiumDishesSchedule()
                .name("Birthday schedule")
                .dinner(dinner)
                .smoothie("Raspberry-Lemon-Basil")
                .starters(starters)
                .dessert("Tiramisu")
                .coffee("Peruvian coffee")
                .champagne("Prosecco");
        dishesSchedule.getName();
        dishesSchedule.getChampagne();
        dishesSchedule.getStarters();
        dishesSchedule.getSmoothie();
        dishesSchedule.getDinner().getSoup();
        dishesSchedule.getDinner().getMainDish();
        dishesSchedule.getDinner().getDrink();
        dishesSchedule.getDessert();
        dishesSchedule.getCoffee();
        System.out.println();
        return dishesSchedule;
    }

    private static List<DishesSchedule> prepareEvent(PremiumDishesSchedule dishesSchedule, boolean isPreparedByCloneable) throws CloneNotSupportedException {
        List<DishesSchedule> event = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            PremiumDishesSchedule clonedDishesSchedule = (isPreparedByCloneable) ? dishesSchedule.clone() : dishesSchedule.Clone();
            event.add(clonedDishesSchedule);
            String sufix = "th";
            if (i == 1)
                sufix = "st";
            if (i == 2)
                sufix = "nd";
            if (i == 3)
                sufix = "rd";
            System.out.println();
            System.out.println(i + sufix + " person schedule name: ");
            clonedDishesSchedule.getName();
            System.out.println("Will be started from:");
            clonedDishesSchedule.getChampagne();
        }
        System.out.println();
        return event;
    }

}
