package P9_14;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/25/13
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {

        SodaCan[] sSodas = new SodaCan[5];
        sSodas[0] = new SodaCan(3.4, 4);
        sSodas[1] = new SodaCan(2,3);
        sSodas[2] = new SodaCan(4,5);
        sSodas[3] = new SodaCan(2,4);
        sSodas[4] = new SodaCan(3,3.3);

        double sumSA = 0;
        for (int i = 0; i <sSodas.length ; i++) {
            sumSA += sSodas[i].getMeasure();
        }

        System.out.printf("The average can volume is: %.4f", sumSA/sSodas.length);


    }
}

