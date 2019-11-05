import java.util.Scanner;
/**
 * @author Hong Tran
 */
class ProgramC
{
    private static int[] number = new int[10];
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean bo,found;
        String str, YorN;
        int enter = 0;
        System.out.println("Those are default numbers we have save in this number arrays.");
        for (int i = 0; i < 10; i++)
        {
            number[i] = (int)(Math.random()*10000) / 100;
            System.out.print(number[i] + " ");
        }
        System.out.println();
        do
        {
            System.out.println("Please enter a number you want to find from the arrays.");
            YorN = " ";
            found = false;
            bo = false;
            do
            {
                try
                {
                    str = keyboard.nextLine();
                    enter = Integer.valueOf(str);
                    bo = true;
                }
                catch(Throwable e)
                {
                    System.out.println("wrong enter type, please enter an Int type number which is between 1 and 12.");
                    bo = false;
                }
            }
            while (!bo);
            for(int i = 0; i < 10; i++)
            {
                if (number[i] == enter)
                {
                    System.out.println("This number was found in position " + (i+1) + " in this number arrays.");
                    found = true;
                }
            }
            if (!found )
            {
                System.out.println("This number was not found in this number arrays.");
            }
            System.out.println("Do you want to search another number again? if yes please enter Yes(ignore Capitalization), otherwise enter any other things");
            YorN = keyboard.nextLine();
        }
        while (YorN.toUpperCase().equals("YES"));
    }
}