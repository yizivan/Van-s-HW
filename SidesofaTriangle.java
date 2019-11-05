/**
 * @author Hong Tran
 */
import java.util.Scanner;

public class SidesofaTriangle
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        double line[] = new double[3];
        System.out.println("please enter 3 nonzero values.");
        for (int i = 0; i < 3; i++)
        {
            line[i] = keyboard.nextDouble();
        }
        for (int i = 0; i < 3; i++)
        {
            for (int j = i+1; j < 3; j++)
            {
                if (line[i] > line[j])
                {
                    double m;
                    m = line[i];
                    line[i] = line[j];
                    line[j] = m;
                }
            }
        }
        if (line[0] + line[1] > line[2])
        {
            System.out.println("These three values are sides of a triangle.");
        }
        else
        {
            System.out.println("These three values are not sides of a triangle.");
        }
        keyboard.close();
    }
}