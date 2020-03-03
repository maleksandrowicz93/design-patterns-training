package Creational.AbstractFactory;

import Domain.AbstractMainDish;
import Domain.AbstractSoup;
import Domain.PolishMainDish;
import Domain.PolishSoup;

public class PolishDinnerFactory implements AbstractDinnerFactory {

    @Override
    public AbstractSoup createSoup() {
        return new PolishSoup();
    }

    @Override
    public AbstractMainDish createMainDIsh() {
        return new PolishMainDish();
    }

}
