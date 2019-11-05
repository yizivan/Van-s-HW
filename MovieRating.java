import java.util.Scanner;
/**
 * @author Hong Tran
 */

public class MovieRating
{
    private static Scanner keyboard = new Scanner(System.in);
    private static String[] Movie = new String[1];
    private static int[] Rating = new int[1];
    private static String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static int ReturnInt()
    {
        String str;
        Boolean bo;
        int arraysetlength = 0;
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                arraysetlength = Integer.valueOf(str);
                if (arraysetlength <= 0)
                    arraysetlength = Integer.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number which is positive.");
                bo = false;
            }
        }
        while (!bo);
        return (arraysetlength);
    }
    public static int ReturnRating()
    {
        String str;
        Boolean bo;
        int rating = 0;
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                rating= Integer.valueOf(str);
                if (rating <= 0 || rating > 4)
                    rating = Integer.valueOf("asd");
                bo = true;
            }
            catch(Throwable e)
            {
                System.out.println("wrong enter type, please enter an Int type number which between 1 and 4.");
                bo = false;
            }
        }
        while (!bo);
        return (rating);
    }
    public static void main(String[] args)
    {
        System.out.println("Please enter how many movies you want to add in the list?");
        int length = ReturnInt();
        Movie = new String[length];
        Rating = new int[length];
        int movieNameLength = 0;
        for (int i = 0; i < length; i++)
        {
            Movie[i] = "";
            movieNameLength = (int)(Math.random() * 14) + 2;
            for (int j = 0; j < movieNameLength; j++)
            {
                Movie[i] = Movie[i] + chars[(int)(Math.random()*26)];
            }
            Rating[i] = (int)(Math.random() * 4) + 1;
        }
        System.out.println("Here are all your movies in the list : ");
        for (int i = 0; i < length; i++)
        {
            System.out.println(Movie[i]);
        }
        while (true)
        {
            System.out.println("Please enter the rating level you want to search.");
            int SearchRate = ReturnRating();
            int count = 1;
            for (int i = 0; i < length; i++)
            {
                if (Rating[i] == SearchRate)
                {
                    if (count == 1)
                    {
                        System.out.println("Here are the movies match your rating level: ");
                        count ++;
                    }
                    System.out.println(Movie[i]);
                }
                    
            }
            System.out.println("Do you want to choose another level rating of movies? If you do, please enter yes, otherwise enter anything else.");
            String enter = keyboard.nextLine();
            if (!enter.toUpperCase().equals("YES"))
                break;
        }
    }
}