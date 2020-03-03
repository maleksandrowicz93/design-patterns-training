package Creational.Prototype;

import Creational.Builder.Dinner;

public class ExtendedDishesSchedule extends DishesSchedule {

    private String cake;
    private String coffee;
    private String juice;
    private String starter;

    public ExtendedDishesSchedule() {
    }

    public ExtendedDishesSchedule(ExtendedDishesSchedule dishesSchedule) {
        super(dishesSchedule);
        this.cake = dishesSchedule.cake;
        this.coffee = dishesSchedule.coffee;
        this.juice = dishesSchedule.juice;
        this.starter = dishesSchedule.starter;
    }

    @Override
    public ExtendedDishesSchedule clone() throws CloneNotSupportedException {
        return (ExtendedDishesSchedule) super.clone();
    }

    @Override
    public ExtendedDishesSchedule Clone() {
        return new ExtendedDishesSchedule(this);
    }

    @Override
    public ExtendedDishesSchedule name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ExtendedDishesSchedule dinner(Dinner dinner) {
        this.dinner = dinner;
        return this;
    }

    public void getCake() {
        System.out.println("Chosen cake is " + cake + "!");
    }

    public void getCoffee() {
        System.out.println("Chosen coffee is " + coffee + "!");
    }

    public void getJuice() {
        System.out.println("Chosen juice is " + juice + "!");
    }

    public void getStarter() {
        System.out.println("Chosen starter is " + starter + "!");
    }

    public ExtendedDishesSchedule cake(String cake) {
        this.cake = cake;
        return this;
    }

    public ExtendedDishesSchedule coffee(String coffee) {
        this.coffee = coffee;
        return this;
    }

    public ExtendedDishesSchedule juice(String juice) {
        this.juice = juice;
        return this;
    }

    public ExtendedDishesSchedule starter(String starter) {
        this.starter = starter;
        return this;
    }

}
