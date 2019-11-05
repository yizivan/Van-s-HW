import java.util.Scanner;
public class FindtheMinimum
{
    private static float Float1, Float2, Float3;
    private static Scanner keyboard = new Scanner(System.in);
    static public float minimum3(float float1, float float2, float float3)
    {
        float flo;
        flo = Math.min(float1, float2);
        return (Math.min(flo, float3));
    }
    public static void main(String[] args)
    {
        Boolean bo;
        bo = false;
        String str;
        System.out.println("Please enter three float type of numbers.");
        do
        {
            try
            {
                str = keyboard.nextLine();
                Float1 = Float.valueOf(str);
                bo = true;
            }
            catch (Throwable e)
            {
                bo = false;
                System.out.println("wrong enter! Please enter a float type.");
            }
        }while (!bo);
        System.out.println("First float recored.");
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                Float2 = Float.valueOf(str);
                bo = true;
            }
            catch (Throwable e)
            {
                bo = false;
                System.out.println("wrong enter! Please enter a float type.");
            }
        }while (!bo);
        System.out.println("Second float recored.");
        bo = false;
        do
        {
            try
            {
                str = keyboard.nextLine();
                Float3 = Float.valueOf(str);
                bo = true;
            }
            catch (Throwable e)
            {
                bo = false;
                System.out.println("wrong enter! Please enter a float type.");
            }
        }while (!bo);
        System.out.println("Last float recored.");
        System.out.println("This is the minimum number between those three numbers : " + String.format("%.2f", minimum3(Float1, Float2, Float3)));
        System.out.println("Good Bye.");
    }
}