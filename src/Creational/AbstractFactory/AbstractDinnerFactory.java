package Creational.AbstractFactory;

import Domain.AbstractMainDish;
import Domain.AbstractSoup;

public interface AbstractDinnerFactory {

    AbstractSoup createSoup();
    AbstractMainDish createMainDIsh();

}
