import java.util.Scanner; //from the package java.util you are importing the Scanner class
/**
/**
 * Madlibs Generator
 * @author Caroline Nielsen
 * @version 9-19-22
 */
public class Madlibs
{
    public static void main(String[] args){
        Scanner input = new Scanner( System.in ); //initializing a new Scanner
        
        System.out.print( "Enter your name: ");
        String name = input.nextLine();
        System.out.print( "Enter the date in the form mmddyy: ");
        int date = input.nextInt();
        input.nextLine(); //to clear the buffer
        
        System.out.print("Enter feeling: ");
        String feeling = input.nextLine();
        System.out.print("Enter plural noun: ");
        String pluralNoun = input.nextLine();
        System.out.print("Enter adjective: ");
        String adjective2 = input.nextLine();
        System.out.print("Enter color: ");
        String color = input.nextLine();
        System.out.print("Enter color: ");
        String color2 = input.nextLine();
        System.out.print("Enter plural pattern: ");
        String pluralPattern = input.nextLine();
        System.out.print("Enter plural noun: ");
        String pluralNoun2 = input.nextLine();
        System.out.print("Enter verb: ");
        String verb = input.nextLine();
        System.out.print("Enter plural shape: ");
        String pluralShape = input.nextLine();
        
        System.out.print("Enter number: ");
        int number = input.nextInt();
        input.nextLine(); //to clear the buffer
        
        System.out.print("Enter plural noun: ");
        String pluralNoun3 = input.nextLine();
        System.out.print("Enter plural noun: ");
        String pluralNoun4 = input.nextLine();
        System.out.print("Enter plural noun: ");
        String pluralNoun5 = input.nextLine();
        System.out.print("Enter number: ");
        String number2 = input.nextLine();
        
        System.out.println(name + ", " + date);
        System.out.print("Do you " + feeling + " Christmas cookies? I love them! My mom's "+ pluralNoun + " are the " + adjective2 + " ones with " + color + " and " + color2 + " " + pluralPattern + ". ");
        System.out.println("They can take a really long time to cook though. She has to get " + pluralNoun2 + " and " + verb + " them on the counter. Then she takes them and rolls them into " + pluralShape + ". After that she bakes them for " + number + " minutes.");
        System.out.print(" One year she mixed " + pluralNoun3 + ", " + pluralNoun4 + ", and " + pluralNoun5 + " together and baked them for " + number2 + " minutes. I didn't like those very much, but don't tell her!");
    
    }
}
