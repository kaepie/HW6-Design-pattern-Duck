package duck;

import java.util.Random;

public class PigeonAdaptor implements Quackable{
    private Pigeon pigeon;

    public PigeonAdaptor(Pigeon pigeon) {
        this.pigeon = pigeon;
    }


    @Override
    public void quack() {
        pigeon.coo();
    }
}
