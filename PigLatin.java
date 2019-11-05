import java.util.Scanner;
/**
 * @author Hong Tran
 */
public class PigLatin
{
    private static String Sentence;
    private static Scanner keyboard = new Scanner(System.in);
    public static void printLatinWord(String originalSentence)
    {
        String str = "";
        String[] Words = Sentence.split(" ");
        for (int i = 0; i < Words.length; i++)
        {
            str = str + printLatin_Word(Words[i]);
            if (i != (Words.length -1) )
            {
                str = str + " ";
            }
        }
        System.out.println("So the whole sentence will be \"" + str + "\"");
    }
    public static String printLatin_Word(String originalWord)
    {
        String str = originalWord.substring(1, originalWord.length());
        str = str + originalWord.substring(0, 1);
        str = str + "ay";
        System.out.println("This pigLatin for \"" + originalWord +"\" will be \"" + str + "\"");
        return str;
    }
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("Please enter the sentence which you want to transfer to pigLatin.");
            Sentence = keyboard.nextLine();
            printLatinWord(Sentence);
            System.out.println("Do you want to try another sentence? if you want to, plz enter yes, otherwise enter anything else.");
            if(!keyboard.nextLine().toUpperCase().equals("YES"))
            {
                break;
            }

        }
        System.out.println("Thank you for using pigLatin translate, see you next time.");
    }
}