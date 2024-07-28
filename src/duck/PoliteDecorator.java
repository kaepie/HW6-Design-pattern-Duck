//6510450291 Chutipong Triyasith
package duck;

public class PoliteDecorator implements Quackable{
    Quackable duck;

    public PoliteDecorator(Quackable duck) {
        this.duck = duck;
    }


    @Override
    public void quack() {
        duck.quack();
        System.out.print(" kub");
    }
}
