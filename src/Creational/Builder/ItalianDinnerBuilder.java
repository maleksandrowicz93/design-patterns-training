package Creational.Builder;

import Domain.ItalianMainDish;
import Domain.ItalianSoup;

public class ItalianDinnerBuilder extends AbstractDinnerBuilder {

    @Override
    public void makeSoup() {
        soup = new ItalianSoup();
    }

    @Override
    public void makeMainDish() {
        mainDish = new ItalianMainDish();
    }

}
