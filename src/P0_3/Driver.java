package P0_3;

/**
 Name your packages according to its Programming Exercise identifier, except replace the period with underscore.
 For example, if the Programming Exercise identifier is P1.15, then name your package file P1_15
 */
public class Driver {


    public static void main(String[] args) {


        Raceable racOne = new Rabbit();
        Raceable racTwo = new Godzilla();


        for (int nC = 0; nC < 20 ; nC++) {
            System.out.println("New Race ====================================================");
            while (true){
               racOne.stride();
               if(racOne.isFinished()){
                   racOne.printMe();
                   System.out.println(racOne.exclaimVictory());
                   break;
               }
               racTwo.stride();
               if(racTwo.isFinished()){
                   racTwo.printMe();
                   System.out.println(racTwo.exclaimVictory());
                   break;
               }

            }
            racOne.reset();
            racTwo.reset();
        }

    }

}
