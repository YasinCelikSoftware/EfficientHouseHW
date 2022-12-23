package decemberextrahomeworks;

public class Diamond {
    public static void main(String[] args)
    {
        test();
    }

    public static int inputHeight()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.print("Please enter the height of the diamond : ");
        return kb.nextInt();

    }
    public static void drawDiamond2()
    {
        int height = inputHeight();
        int numberOfSpaces = height - 1;
        int star = 0;

        for (int i = 1; i <= height * 2 - 1; i++)
        {
            for (int j = 0; j < height * 2 - 1; j++)
            {
                if (j < numberOfSpaces - star || j > numberOfSpaces + star)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }


            if (i < height)
                star++;
            else
                star--;

            System.out.println();

        }
    }

    public static void test(){
        drawDiamond2();
    }
}
