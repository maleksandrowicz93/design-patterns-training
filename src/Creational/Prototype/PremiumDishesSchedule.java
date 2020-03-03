package Creational.Prototype;

import Creational.Builder.Dinner;

import java.util.Arrays;
import java.util.List;

public class PremiumDishesSchedule extends DishesSchedule {

    private String dessert;
    private String coffee;
    private String smoothie;
    private List<String> starters;
    private String champagne;

    public PremiumDishesSchedule() {
    }

    public PremiumDishesSchedule(PremiumDishesSchedule dishesSchedule) {
        super(dishesSchedule);
        this.dessert = dishesSchedule.dessert;
        this.coffee = dishesSchedule.coffee;
        this.smoothie = dishesSchedule.smoothie;
        this.starters = dishesSchedule.starters;
        this.champagne = dishesSchedule.champagne;
    }

    @Override
    public PremiumDishesSchedule clone() throws CloneNotSupportedException {
        return (PremiumDishesSchedule) super.clone();
    }

    @Override
    public PremiumDishesSchedule Clone() {
        return new PremiumDishesSchedule(this);
    }

    @Override
    public PremiumDishesSchedule name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public PremiumDishesSchedule dinner(Dinner dinner) {
        this.dinner = dinner;
        return this;
    }

    public void getDessert() {
        System.out.println("Chosen cake is " + dessert + "!");
    }

    public void getCoffee() {
        System.out.println("Chosen coffee is " + coffee + "!");
    }

    public void getSmoothie() {
        System.out.println("Chosen smoothie is " + smoothie + "!");
    }

    public void getStarters() {
        System.out.println("Chosen starters are " + Arrays.toString(starters.toArray()) + "!");
    }

    public void getChampagne() {
        System.out.println("Chosen champagne is " + champagne + "!");
    }

    public PremiumDishesSchedule dessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public PremiumDishesSchedule coffee(String coffee) {
        this.coffee = coffee;
        return this;
    }

    public PremiumDishesSchedule smoothie(String smoothie) {
        this.smoothie = smoothie;
        return this;
    }

    public PremiumDishesSchedule starters(List<String> starters) {
        this.starters = starters;
        return this;
    }

    public PremiumDishesSchedule champagne(String champagne) {
        this.champagne = champagne;
        return this;
    }

}
