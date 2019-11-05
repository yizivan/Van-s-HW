import javax.lang.model.util.ElementScanner6;

/**
 * @author Hong Tran
 */

public class TwelveSongs
{

    public static void main(String[] args)
    {
        for (int i = 0; i < 12; i++)
        {
            switch (i+1)
            {
                case 1 :
                    System.out.println("On the first day of Christmas my true love sent to me;");
                    break;
                case 2 :
                    System.out.println("On the second day of Christmas my true love sent to me;");
                    break;
                case 3 :
                    System.out.println("On the third day of Christmas my true love sent to me;");
                    break;
                case 4 :
                    System.out.println("On the fourth day of Christmas my true love sent to me;");
                    break;
                case 5 :
                    System.out.println("On the fifth day of Christmas my true love sent to me;");
                    break;
                case 6 :
                    System.out.println("On the sixth day of Christmas my true love sent to me;");
                    break;
                case 7 :
                    System.out.println("On the seventh day of Christmas my true love sent to me;");
                    break;
                case 8 :
                    System.out.println("On the eighth day of Christmas my true love sent to me;");
                    break;
                case 9 :
                    System.out.println("On the nineth day of Christmas my true love sent to me;");
                    break;
                case 10 :
                    System.out.println("On the tenth day of Christmas my true love sent to me;");
                    break;
                case 11 :
                    System.out.println("On the eleventh day of Christmas my true love sent to me;");
                    break;
                case 12 :
                    System.out.println("On the twelfth day of Christmas my true love sent to me;");
                    break;
            }
            switch (i+1)
            {
                case 12 :
                    System.out.println("Twelve drummers drumming,");
                case 11 :
                    System.out.println("Eleven pipers piping,");
                case 10 :
                    System.out.println("Ten lords a-leaping,");
                case 9 :
                    System.out.println("Nine ladies dancing,");
                case 8 :
                    System.out.println("Eight maids a-milking,");
                case 7 :
                    System.out.println("Seven swans a-swimming,");
                case 6 :
                    System.out.println("Six geese a-laying,");
                case 5 :
                    System.out.println("Five gold rings,");
                case 4 :
                    System.out.println("Four calling birds,");
                case 3 :
                    System.out.println("Three French hens,");
                case 2 :
                    System.out.println("Two turtle doves,");
                case 1 :
                    if ( i+1 == 1)
                    {
                        System.out.println("A partridge in a pear tree.");
                    } 
                    else
                    System.out.println("And a partridge in a pear tree.");     
            }
        }
    }
}