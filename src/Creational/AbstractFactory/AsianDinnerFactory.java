package Creational.AbstractFactory;

import Domain.AbstractMainDish;
import Domain.AbstractSoup;
import Domain.AsianMainDish;
import Domain.AsianSoup;

public class AsianDinnerFactory implements AbstractDinnerFactory {

    @Override
    public AbstractSoup createSoup() {
        return new AsianSoup();
    }

    @Override
    public AbstractMainDish createMainDIsh() {
        return new AsianMainDish();
    }

}
