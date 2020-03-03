package Creational.Builder;

import Domain.AbstractMainDish;
import Domain.AbstractSoup;

public abstract class AbstractDinnerBuilder implements DinnerBuilder {

    protected AbstractSoup soup;
    protected AbstractMainDish mainDish;

    @Override
    public Dinner getDinner() {
        return new Dinner()
                .soup(soup)
                .mainDish(mainDish);
    }

}
