package duck;

public class CountingPoliteDuckFactory extends AbstractDuckFactory{

    public Quackable createMallardDuck() {
        return new PoliteCounter(new PoliteDecorator(new QuackCounter(new MallardDuck())));
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new PoliteCounter(new PoliteDecorator(new QuackCounter(new RedheadDuck())));
    }

    @Override
    public Quackable createDuckCall() {
        return new PoliteCounter(new PoliteDecorator(new QuackCounter(new DuckCall())));
    }

    @Override
    public Quackable createRubberDuck() {
        return new PoliteCounter(new PoliteDecorator(new QuackCounter(new RubberDuck())));
    }
}
