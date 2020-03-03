package Creational.Prototype;

import Creational.Builder.Dinner;

public class BasicDishesSchedule extends DishesSchedule {

    public BasicDishesSchedule() {
    }

    public BasicDishesSchedule(BasicDishesSchedule dishesSchedule) {
        super(dishesSchedule);
    }

    @Override
    public BasicDishesSchedule clone() throws CloneNotSupportedException {
        return (BasicDishesSchedule) super.clone();
    }

    @Override
    public BasicDishesSchedule Clone() {
        return new BasicDishesSchedule(this);
    }

    @Override
    public BasicDishesSchedule name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BasicDishesSchedule dinner(Dinner dinner) {
        this.dinner = dinner;
        return this;
    }

}
