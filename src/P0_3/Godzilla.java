

package P0_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ag
 * Date: 9/18/13
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Godzilla implements Raceable {


    private int mStride;
    private final int FEET = 15;     //2
    private final double mSpeed = .05;   //percentage  //.80
    private Random mRandom;


    public Godzilla() {
        mStride = 0;
        mRandom = new Random();
    }

    @Override
    public void stride() {

        if (mRandom.nextInt(100) * mSpeed > 4) {
            mStride += FEET;
        }

        System.out.print("Godzilla >");
        for (int nC = 0; nC < mStride; nC++) {
            System.out.print("@");
        }
        System.out.println();
    }

    @Override
    public boolean isFinished() {
        return  mStride >= Raceable.FINISH;
    }

    @Override
    public String exclaimVictory() {
        return "Tokyo is destroyed! GGGRRRRRRRRAAAAA.\n\n";

    }





    @Override
    public String toString() {
        String strR = "";
        String strPath =  System.getProperty("user.dir") + "//src//P0_3//godzilla.txt";
        Scanner in;
        File fileInput = new File(strPath);
        try {
            in = new Scanner(fileInput);
        } catch (FileNotFoundException e) {
            return "There's been an error: " + e.getMessage();

        }

        while(in.hasNextLine()){
            strR += in.nextLine() + "\n";
        }
        return strR;

    }

    @Override
    public void reset() {
        mStride = 0;
    }


}




