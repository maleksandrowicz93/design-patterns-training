package Creational.Builder;

import Domain.GeorgianMainDish;
import Domain.GeorgianSoup;

public class GeorgianDinnerBuilder extends AbstractDinnerBuilder {

    @Override
    public void makeSoup() {
        soup = new GeorgianSoup();
    }

    @Override
    public void makeMainDish() {
        mainDish = new GeorgianMainDish();
    }

}
