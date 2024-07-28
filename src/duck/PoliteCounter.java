//6510450291 Chutipong Triyasith
package duck;

public class PoliteCounter implements Quackable{
    public Quackable quackable;
    static int politeCount;
    public PoliteCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        politeCount++;
    }

    public static int getPoliteCount(){
        return politeCount;
    }
}
