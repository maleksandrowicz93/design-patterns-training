package Creational.Builder;

import Domain.AsianMainDish;
import Domain.AsianSoup;

public class AsianDinnerBuilder extends AbstractDinnerBuilder {

    @Override
    public void makeSoup() {
        soup = new AsianSoup();
    }

    @Override
    public void makeMainDish() {
        mainDish = new AsianMainDish();
    }

}
