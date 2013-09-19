

package P0_3;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ag
 * Date: 9/18/13
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Godzilla implements Raceable {


    private int mStride;
    private final int FEET = 20;     //2
    private final double mSpeed = .08;   //percentage  //.80
    private Random mRandom;


    public Godzilla() {
        mStride = 0;
        mRandom = new Random();
    }

    @Override
    public String stride() {

        if (mRandom.nextInt(100) * mSpeed > 4) {
            mStride += FEET;
        }

        String strR = "";
        for (int nC = 0; nC < mStride; nC++) {
            strR += "*";
        }
        return strR;
    }

    @Override
    public boolean isFinished() {
        return  mStride >= Raceable.FINISH;
    }

    @Override
    public String exclaimVictory() {
        return "Tokyo is destroyed! GGGRRRRRRRRAAAAA.";
    }
}




