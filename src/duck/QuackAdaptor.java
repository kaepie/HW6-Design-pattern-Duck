package duck;

public class QuackAdaptor implements Quackable{
    private Goose goose;


    public QuackAdaptor(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
