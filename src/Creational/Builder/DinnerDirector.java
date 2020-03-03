package Creational.Builder;

public class DinnerDirector {

    private static DinnerDirector INSTANCE;

    private DinnerDirector() {
    }

    public static DinnerDirector getInstance() {
        if (INSTANCE == null)
            INSTANCE = new DinnerDirector();
        return INSTANCE;
    }

    public void construct(DinnerBuilder dinnerBuilder) {
        dinnerBuilder.makeSoup();
        dinnerBuilder.makeMainDish();
    }

}
