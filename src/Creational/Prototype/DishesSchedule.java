package Creational.Prototype;

import Creational.Builder.Dinner;

public abstract class DishesSchedule implements Cloneable {

    protected String name;
    protected Dinner dinner;

    public DishesSchedule() {
    }

    public DishesSchedule(DishesSchedule dishesSchedule) {
        this.name = dishesSchedule.name;
        this.dinner = dishesSchedule.dinner;
    }

    public abstract DishesSchedule Clone();
    public abstract DishesSchedule name(String name);
    public abstract DishesSchedule dinner(Dinner dinner);

    public void getName() {
        System.out.println("Schedule name is " + name + "!");
    }

    public Dinner getDinner() {
        return dinner;
    }

}
