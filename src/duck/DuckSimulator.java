package duck;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractDuckFactory CountingPoliteDuckFactory = new CountingPoliteDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new PoliteDecorator(new QuackAdaptor(new Goose()));

        System.out.println("\nDuck Simulator");

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(rubberDuck);
        flock1.add(gooseDuck);

        flock1.quack();

        System.out.println("--------");
        System.out.println("Duck Quack: "+ QuackCounter.getNumOfQuacks() + " times");
        System.out.println("Polite Duck Quack: "+ PoliteCounter.getPoliteCount() + " times");
    }

    void simulate(Quackable duck){
        duck.quack();
        System.out.println();
    }
}
