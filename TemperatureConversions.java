import java.util.Scanner;
public class TemperatureConversions
{
    static private double Celsius, Fahrenheit;
    static private Scanner keyboard = new Scanner(System.in);
    static public double celsius(double fahrenheit)
    {
        return (5.0 / 9.0 * (fahrenheit - 32));
    }
    static public double fahrenheit(double celsius)
    {
        return (9.0 / 5.0 * celsius + 32);
    }
    public static void main(String[] args)
    {
        String choice, str;
        Boolean bo;
        System.out.println("If you want to enter a Fahrenheit temperature and display the Celsius equivalent please enter \"1\"");
        System.out.println("If you want to enter a Celsius temperature and display the Fahrenheit equivalent please enter \"2\"");
        choice = keyboard.nextLine();
        while (!(choice.equals("1") || choice.equals("2")))
        {
            System.out.println("wrong enter, please enter the new number bewteen 1 and 2.");
            choice = keyboard.nextLine();
        }
        if (choice.equals("1"))
        {
            System.out.println("Please enter the original Fahrenheit temperature.");
            do
            {
                try
                {
                    str = keyboard.nextLine();
                    Fahrenheit = Double.valueOf(str);
                    bo = true;
                }
                catch (Exception e)
                {
                    System.out.println("wrong enter, please enter a double type number.");
                    bo = false;
                }
            }while (!bo);
            Celsius = celsius(Fahrenheit);
            System.out.println("The temperature in Celsius equivalent is " + String.format("%.2f", Celsius));
            System.out.println("Good Bye.");
        }
        if (choice.equals("2"))
        {
            System.out.println("Please enter the original Celsius temperature.");
            do
            {
                try
                {   
                    str = keyboard.nextLine();
                    Celsius = Double.valueOf(str);
                    bo = true;
                }
                catch (Exception e)
                {
                    System.out.println("wrong enter, please enter a double type number.");
                    bo = false;
                }
            }while (!bo);
            Fahrenheit = fahrenheit(Celsius);
            System.out.println("The temperature in Fahrenheit equivalent is " + String.format("%.2f", Fahrenheit));
            System.out.println("Good Bye.");
        }
    }
}