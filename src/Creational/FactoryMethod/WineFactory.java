package Creational.FactoryMethod;

import Domain.AbstractDrink;
import Domain.WineDrink;

public class WineFactory implements DrinkFactory {

    @Override
    public AbstractDrink createDrink() {
        return new WineDrink();
    }

}
