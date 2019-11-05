import java.util.Scanner;
public class test
{
    private static Scanner keyboard = new Scanner(System.in);
    public static int ReturnIntWithoutZero()
    {
        String str;
        Boolean bo;
        int enterint = 0;
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                enterint = Integer.valueOf(str);
                if (enterint == 0)
                    enterint = Integer.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number which is not zero.");
                bo = false;
            }
        }
        while (!bo);
        return (enterint);
    }
    public static int ReturnInt()
    {
        String str;
        Boolean bo;
        int enterint = 0;
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                enterint = Integer.valueOf(str);
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number.");
                bo = false;
            }
        }
        while (!bo);
        return (enterint);
    }
    public static void main(String[] args)
    {
        System.out.println("Please enter two numbers which you want to do devision.");
        System.out.println("Please enter a number.");
        int i = ReturnInt();
        System.out.println("Please enter a divisor.");
        int j = ReturnIntWithoutZero();
        int k = i / j;
        int m = i % j;
        System.out.println(i + " / " + j + " = " + k + "r" +m);
    }
}