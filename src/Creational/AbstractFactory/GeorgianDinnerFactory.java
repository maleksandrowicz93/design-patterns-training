package Creational.AbstractFactory;

import Domain.AbstractMainDish;
import Domain.AbstractSoup;
import Domain.GeorgianMainDish;
import Domain.GeorgianSoup;

public class GeorgianDinnerFactory implements AbstractDinnerFactory {

    @Override
    public AbstractSoup createSoup() {
        return new GeorgianSoup();
    }

    @Override
    public AbstractMainDish createMainDIsh() {
        return new GeorgianMainDish();
    }

}
