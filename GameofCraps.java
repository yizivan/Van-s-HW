import java.util.Random;
/**
 * @author Hong Tran
 */
public class GameofCraps
{
    private static Random random = new Random();
    private static int counter;
    public static int GetPoint()
    {
        
        int number1, number2, total;
        number1 = Math.abs(random.nextInt()) % 6 + 1;
        number2 = Math.abs(random.nextInt()) % 6 + 1;
        total = number1 + number2;
        return total;
    }
    public static Boolean PlayCraps()
    {
        int point, ThePoint;
        counter = 0;
        ThePoint = GetPoint();
        counter ++;
        if (ThePoint == 7 || ThePoint == 11)
        {
            return true;
        }
        else if (ThePoint == 2 || ThePoint == 3 || ThePoint == 12)
        {
            return false;
        }
        do
        {
            point = GetPoint();
            counter ++;
            if (point == 7)
            {
                return false;
            }
        }
        while (ThePoint != point);
        return true;
    }
    public static void main(String[] args)
    {
        Boolean[] WinOrLose = new Boolean[1000000];
        int[] Counter = new int[1000000];
        double[] WinRolls = new double[21];
        double[] LoseRolls = new double[21];
        double WinTotal = 0;
        double LoseTotal = 0;
        long Sum = 0;
        for (int i = 0; i < 21; i++)
        {
            WinRolls[i] = 0;
            LoseRolls[i] = 0;
        }
        for (int i = 0; i < 1000000; i++)
        {
            Counter[i] = 0;
            WinOrLose[i] = PlayCraps();
            Counter[i] = counter;
            if (WinOrLose[i])
            {
                if (Counter[i] > 20)
                {
                    WinRolls[20] ++;
                }
                else 
                {
                    WinRolls[ Counter[i] - 1 ] ++;
                }
                WinTotal ++;
            }
            else
            {
                if (Counter[i] > 20)
                {
                    LoseRolls[20] ++;
                }
                else 
                {
                    LoseRolls[ Counter[i] - 1 ] ++;
                }
                LoseTotal ++;
            }
        }
        System.out.println("There are " + WinRolls[0] + " times wining in the 1st roll.");
        System.out.println("There are " + WinRolls[1] + " times wining in the 2nd roll.");
        System.out.println("There are " + WinRolls[2] + " times wining in the 3rd roll.");
        for (int i = 3; i < 20; i++)
        {
            System.out.println("There are " + WinRolls[i] + " times wining in the " + (i+1) + "th roll.");
        }
        System.out.println("There are " + WinRolls[20] + " times wining after 20th roll");
        System.out.println("There are " + LoseRolls[0] + " times losing in the 1st roll.");
        System.out.println("There are " + LoseRolls[1] + " times losing in the 2nd roll.");
        System.out.println("There are " + LoseRolls[2] + " times losing in the 3rd roll.");
        for (int i = 3; i <20; i++)
        {
            System.out.println("There are " + LoseRolls[i] + " times wining in the " + (i+1) + "th roll.");
        }
        System.out.println("There are " + LoseRolls[20] + " times losing after 20th roll");
        System.out.println("The chances of winning at craps are about " + String.format("%.2f", WinTotal/(WinTotal + LoseTotal) * 100) + "%.");
        for (int i = 0; i < 1000000; i++)
        {
            Sum = Sum + Counter[i];
        }
        System.out.println("The average length of a game of craps is " + (Sum / 1000000));
        System.out.println("The chance to win in every roll from first roll to after twentieth roll as show : ");
        for (int i = 0; i < 21; i++)
        {
            System.out.print(String.format("%.2f", WinRolls[i]/(WinRolls[i] + LoseRolls[i]) * 100) + " ");
        }
        System.out.println();
        System.out.println("As we see, the chances of winning doesn't improve with the length of the game.");
    }
}