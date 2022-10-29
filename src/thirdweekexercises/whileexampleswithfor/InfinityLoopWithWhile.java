package thirdweekexercises.whileexampleswithfor;

public class InfinityLoopWithWhile {
    public static void main(String[] args)
    {


        for(byte number = 1; number > 0; ++number){
            System.out.println("Its not infinite.");
            System.out.println(number);
        }

        for(int number = 0;true;number++){
            System.out.println("It's infinite ;)");
            System.out.println(number);

            if(number == 127)
                return;
        }


    }
}
