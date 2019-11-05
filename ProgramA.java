import java.util.Scanner;
/**
 * @author Hong Tran
 */
class ProgramA
{
    private static Scanner keyboard = new Scanner(System.in);
    static String firstname, lastname;
    static int year;
    public static void main(String[] args)
    {
        boolean bo;
        String str;
        System.out.println("Please enter your firstname (end as Enter).");
        firstname = keyboard.nextLine();
        System.out.println("Please enter your lastname (end as Enter).");
        lastname = keyboard.nextLine();
        System.out.println("Please enter your birth year.");
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                year = Integer.valueOf(str);
                if (year <= 0)
                    year = Integer.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number which is greater than 0.");
                bo = false;
            }
        }
        while (!bo);
        System.out.println(firstname + " " + lastname + " " + year);
    }
}