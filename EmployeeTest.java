import java.util.Scanner;

public class EmployeeTest
{
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        Employee firstperson = new Employee( "yiyang" , "shi" , 100000);
        Employee secondperson = new Employee( "vanna" , "tran" , 150000);
        System.out.println("Please enter first person's first name, last name, and salary.(using space to divide)");
        firstperson.setFirstname(keyboard.next());
        firstperson.setLastname(keyboard.next());
        firstperson.setSalary(keyboard.nextDouble());
        System.out.println("Please enter second person's first name, last name, and salary.(using space to divide)");
        secondperson.setFirstname(keyboard.next());
        secondperson.setLastname(keyboard.next());
        secondperson.setSalary(keyboard.nextDouble());
        System.out.println("firstperson's name is " + firstperson.getFirstname() + " " + firstperson.getLastname() + ".");
        System.out.println("this person's salary is " + String.format("%.2f",firstperson.getSalary()) + ".");
        System.out.println("secondperson's name is " + secondperson.getFirstname() + " " + secondperson.getLastname() + ".");
        System.out.println("this person's salary is " + String.format("%.2f",secondperson.getSalary()) + ".");
        firstperson.setSalary(firstperson.getSalary() * 1.1);
        secondperson.setSalary(secondperson.getSalary() * 1.1);
        System.out.println("after raising salary by 10 percents, the firstperson's new salary will be " + String.format("%.2f",firstperson.getSalary()) + ".");
        System.out.println("after raising salary by 10 percents, the secondperson's new salary will be " + String.format("%.2f",secondperson.getSalary()) + ".");
        keyboard.close();
    }
}