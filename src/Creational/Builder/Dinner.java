package Creational.Builder;

import Domain.AbstractDrink;
import Domain.AbstractMainDish;
import Domain.AbstractSoup;

public class Dinner {

    private AbstractSoup soup;
    private AbstractMainDish mainDish;
    private AbstractDrink drink;

    public Dinner soup(AbstractSoup soup) {
        this.soup = soup;
        return this;
    }

    public Dinner mainDish(AbstractMainDish mainDish) {
        this.mainDish = mainDish;
        return this;
    }

    public Dinner addDrink(AbstractDrink drink) {
        this.drink = drink;
        return this;
    }

    public void getSoup() {
        soup.getSoup();
    }

    public void getMainDish() {
        mainDish.getMainDish();
    }

    public void getDrink() {
        drink.getDrink();
    }

}
