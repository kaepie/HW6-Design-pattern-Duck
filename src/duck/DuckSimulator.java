package duck;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackAdaptor(new Goose());

        System.out.println("\nDuck Simulator");

        Flock flock1 = new Flock();
        flock1.add(mallardDuck);
        flock1.add(rubberDuck);
        flock1.add(gooseDuck);

        flock1.quack();

        System.out.println("--------");
        System.out.println(QuackCounter.getNumOfQuacks() + " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
