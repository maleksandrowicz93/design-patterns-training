package Creational.Builder;

import Domain.PolishMainDish;
import Domain.PolishSoup;

public class PolishDinnerBuilder extends AbstractDinnerBuilder {

    @Override
    public void makeSoup() {
        soup = new PolishSoup();
    }

    @Override
    public void makeMainDish() {
        mainDish = new PolishMainDish();
    }

}
