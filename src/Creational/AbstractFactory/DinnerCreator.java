package Creational.AbstractFactory;

import Domain.AbstractMainDish;
import Domain.AbstractSoup;

public class DinnerCreator {

    private AbstractDinnerFactory dinnerFactory;

    public DinnerCreator(AbstractDinnerFactory dinnerFactory) {
        this.dinnerFactory = dinnerFactory;
    }

    public void createDinner() {
        AbstractSoup soup = dinnerFactory.createSoup();
        AbstractMainDish mainDIsh = dinnerFactory.createMainDIsh();
        soup.getSoup();
        mainDIsh.getMainDish();
    }
}
