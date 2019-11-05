import java.util.Scanner;
/**
 * @author Hong Tran
 */
class ProgramB
{
    private static Scanner keyboard = new Scanner(System.in);
    static String firstname, lastname;
    static int month;
    private static String[] Month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static void main(String[] args)
    {
        boolean bo;
        String str;
        System.out.println("Please enter your firstname (end as Enter).");
        firstname = keyboard.nextLine();
        System.out.println("Please enter your lastname (end as Enter).");
        lastname = keyboard.nextLine();
        System.out.println("Please enter your birth month (number between 1 and 12).");
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                month = Integer.valueOf(str);
                if (month <= 0 || month > 12)
                    month = Integer.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number which is between 1 and 12.");
                bo = false;
            }
        }
        while (!bo);
        System.out.println(firstname + " " + lastname + " " +Month[month - 1]);

    }
}