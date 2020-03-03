package Creational.FactoryMethod;

import Domain.AbstractDrink;
import Domain.VodkaDrink;

public class VodkaFactory implements DrinkFactory {

    @Override
    public AbstractDrink createDrink() {
        return new VodkaDrink();
    }

}
