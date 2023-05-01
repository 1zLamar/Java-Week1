import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        //1.Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers.
        int num1= 125;
        int num2= 24;

        int sum= num1+num2;
        int sub= num1-num2;
        int multi= num1*num2;
        int division= num1/num2;
        int mod=num1%num2;


        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+ sub);
        System.out.println(num1+" x "+num2+" = "+multi);
        System.out.println(num1+" / "+num2+" = "+division);
        System.out.println(num1+" mod "+num2+" = "+mod);
        System.out.println();
        System.out.println();


        //2.Write a Java program to convert a given string into lowercase.


        String sentence= "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(sentence.toLowerCase());
        System.out.println();


        //3.Write a Java program that takes a string and a number from the user,then prints the character in the given index.
        String str ;
        System.out.println("Enter a string: ");
        str = scan.nextLine();
        System.out.println("Enter an index: ");
        int indx = scan.nextInt();
        char index1 = str.charAt(indx);
        System.out.print(index1);
        System.out.println();
        System.out.println();


        /*4.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even
        or 0 if the number is odd. (use if-statement)*/

        int number;

        System.out.println("Enter a number: ");
        number= scan.nextInt();

        if (number % 2 == 0) //even
            System.out.println(1);
        else //odd
            System.out.println(0);
        System.out.println();
        System.out.println();


        //5.Write a program that checks the role of the user

        System.out.println("Enter your role");
        String role;
        role= scan.nextLine();

        if (role.toLowerCase().equals("admin")){
            System.out.println("Welcome Admin");
        }
        else if (role.toLowerCase().equals("user")){
            System.out.println("Welcome User");
        }
        else if (role.toLowerCase().equals("superuser")){
            System.out.println("Welcome User");
        }
        else{
            System.out.println("not correct input");
        }

        /* 6.Write a Java program to calculate the sum of two integers
         and return true if the sum is equal to a third integer.*/

        System.out.print("Enter the First number: ");
        int firstNum=scan.nextInt();

        System.out.print("Enter the Second number: ");
        int secondNum=scan.nextInt();

        System.out.print("Enter the Third number: ");
        int thirdNum=scan.nextInt();

        int sum1=firstNum+secondNum;

        if(sum1==thirdNum){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println();
        System.out.println();



        //7.Take three numbers from the user and print the greatest number.
        int numOne;
        System.out.println("1st number: ");
        numOne= scan.nextInt();

        int numTwo;
        System.out.println("2st number: ");
        numTwo= scan.nextInt();

        int numThree;
        System.out.println("3rd number: ");
        numThree= scan.nextInt();

        if(numOne>=numTwo && numOne>=numThree){
            System.out.println("The greatest number is: "+numOne);
        }
        else if(numTwo>=numOne && numTwo>=numThree){
            System.out.println("The greatest number is: "+numTwo);
        }
        else {
            System.out.println("The greatest number is: "+numThree);
      }
        System.out.println();
        System.out.println();


        //8.Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
        System.out.println("choose a number to display weekday: ");
        int days=scan.nextInt();

        switch (days){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("you have choose from 1-7");

        }
    }
}