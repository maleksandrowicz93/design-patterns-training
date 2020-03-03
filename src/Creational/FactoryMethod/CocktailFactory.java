package Creational.FactoryMethod;

import Domain.AbstractDrink;
import Domain.CocktailDrink;

public class CocktailFactory implements DrinkFactory {

    @Override
    public AbstractDrink createDrink() {
        return new CocktailDrink();
    }

}
