import java.util.Scanner;

public class Firsthw
{
    /*
    **  author Hong Tran
    */

    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        String fname, lname;
        Integer year;
        System.out.println("Please enter the year when you were born.");
        year = keyboard.nextInt();
        fname = keyboard.nextLine();
        System.out.println("Please enter your first name.");
        fname = keyboard.nextLine();
        System.out.println("Please enter your last name.");
        lname = keyboard.nextLine();
        if ( year < 2019 && year >=0 )
        {
            year = 2019 - year;
            System.out.println("This user's age is " + year + " years old, and user's full name is " + fname + " " + lname + ".");
        }
        else 
        {
            System.out.println("The year you entered was out of range, it must be between 0 and 2019.");
        }

        keyboard.close();
        
    }
}