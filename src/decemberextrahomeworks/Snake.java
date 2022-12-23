package decemberextrahomeworks;

public class Snake {
    public static void main(String[] args)
    {
        test();
    }

    public static void drawSnake(int height, int width)
    {

        int count1 = 1;
        int count2 = 0;

        for(int i = 1; i <= width+2; i++)
            System.out.print("_");

        System.out.println();

        for(int i = 1; i <= height; i++)
        {
            System.out.print("|");

            for (int j = 1; j < count1-count2; j++)
            {
                System.out.print(" ");
            }

            System.out.print("*");

            for(int j = 1; j <= width-count1+count2; j++)
                System.out.print(" ");

            if(count1 == width)
                count2++;
            if(count1 < width)
                count1++;
            if(count1 == width && count2 == width)
            {
                count1 = 2;
                count2 = 0;
            }

            System.out.println("|");
        }

        for(int i = 1; i <= width+2; i++)
            System.out.print('\u00AF');
    }
    public static void test(){
        drawSnake(16,6);
    }
}
