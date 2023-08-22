package cvicenie1;

import java.util.Random;

public class Ulohy {

    public int nahodneCislo(int limit){
        Random random = new Random();
        return random.nextInt(2*limit + 1) - limit;
    }
}
