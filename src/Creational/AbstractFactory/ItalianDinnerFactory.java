package Creational.AbstractFactory;

import Domain.AbstractMainDish;
import Domain.AbstractSoup;
import Domain.ItalianMainDish;
import Domain.ItalianSoup;

public class ItalianDinnerFactory implements AbstractDinnerFactory {

    @Override
    public AbstractSoup createSoup() {
        return new ItalianSoup();
    }

    @Override
    public AbstractMainDish createMainDIsh() {
        return new ItalianMainDish();
    }

}
