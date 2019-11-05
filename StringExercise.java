/**
 * @author Hong Tran
 */
public class StringExercise
{
    private static String Txt;
    public static void main(String[] agrs)
    {
        Txt = "Hello Everbody";
        System.out.println("The first occurrence of \"e\" in the Txt position is " + Txt.indexOf("e"));
        Txt = "Hello";
        System.out.println("The length of the Txt is " + Txt.length());
        Txt = "String txt = \"Hello\";";
        Txt = Txt.toUpperCase();
        System.out.println("Now the Txt is all uppercase. Here is the new Txt: " + Txt);
        String firstName = "Mary", lastName = "Doe";
        String fullname = firstName + " " + lastName;
        System.out.println("The full name is " + fullname);
        Txt = "String txt = \"Hello Everybody\";";
        System.out.println("The first occurrence of \"e\" in the Txt position is " + Txt.indexOf("e"));
    }
}