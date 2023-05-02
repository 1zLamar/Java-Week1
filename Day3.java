import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        //1.Write a program that prints the numbers from 1 to 100 such that:

        for(int i = 1 ; i<=100 ; i++) {

            if (i % 3  != 0 && i % 5  != 0) {
                System.out.println(i);
            }
            else if(i % 3  == 0){
                System.out.println("Fizz");
            }
            else if (i % 5  == 0){
                System.out.println("Buzz");
            }
            else if (i % 3  == 0 && i % 5  == 0){
                System.out.println("FizzBuzz");
            }

        }


        //2.Write a Java program to reverse a string.
        String sentence= "The quick brown fox";

        String revers="";

        for(int i = sentence.length()-1;i>=0;i--){
            revers=revers+sentence.charAt(i);
        }
        System.out.println(revers);


        //3.Write a program that prompts the user to input a positive integer.
        // It should then print the multiplication table of that number.
        int integ;
        System.out.println("Enter an integer number: ");
        integ = s.nextInt();

        for (int i = 1;i<=10;i++){
            System.out.println("The multiplication of "+integ+" x "+i+" = "+(i*integ));
        }


        //4.Write a program to find the factorial value of any number entered
        // through the keyboard.
        int result=1;

        System.out.println("Enter a number: ");
        int factorial= s.nextInt();

        for (int i=1;i<=factorial;i++){
            result=result*i;
        }
        System.out.println("The factorial of the number is: "+result);


        //5.Two numbers are entered through the keyboard.

        int power=1;
        System.out.println("Enter the number: ");
        int num= s.nextInt();

        System.out.println("Enter the power: ");
        int pwr=s.nextInt();

        for(int i=1;i<=pwr;i++){
            power=power*num;
        }

        System.out.println("The result is: "+power);


        //6.Write a program that reads a set of integers, and then prints
        // the sum of the even and odd integers.


        int sumEven=0,sumOdd=0;
        int counter=0;

        while(counter==0){


            System.out.println("Enter an integer: ");
            System.out.println("Enter negative number to Exit.. ");
            int oddEven=s.nextInt();

            if(oddEven<=-1){
                break;
            }

            else if(oddEven % 2 ==0 ){
                sumEven=sumEven+oddEven;
            }

            else{
                sumOdd=sumOdd+oddEven;
            }
        }

        System.out.println("The sum of even numbers is: "+sumEven);
        System.out.println("The sum of odd numbers is: "+sumOdd);



        //7.Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a
        // prime number.
        int num3 = 0;

        while (num3 <= 0) {
            System.out.print("Enter a positive integer: ");
            num3 = s.nextInt();

            if (num3 <= 0) {
                System.out.println("try again with a positive integer");
            }
        }
        boolean bool = true;
        if (num3 < 2) {
            bool = false;

        } else {
            for (int i = 2; i <= num3 / 2; ++i) {
                if (num3 % i == 0) {
                    bool = false;
                    break;
                }
            }
        }

        if (bool) {
            System.out.println(num3 + " is a prime number.");
        } else {
            System.out.println(num3 + " is not a prime number.");
        }




        //8.Write a program to enter the numbers till the user wants and at
        // the end it should display the count of positive, negative and zeros
        // entered.


        int positive = 0, negative = 0, zero = 0;
        int number1;
        char choice = 'C';

        while (choice == 'C' || choice == 'c') {

            System.out.println("Enter an integer: ");
            number1 = s.nextInt();

            if (number1 > 0) {
                positive++;
            } else if (number1 < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.println("Enter C to continue or E to Exit.. ");
            choice = s.next().charAt(0);
        }

        System.out.println("The sum of positive numbers is: "+positive);
        System.out.println("The sum of negative numbers is: "+negative);
        System.out.println("The sum of zeros is: "+zero);


        //9.Use a for loop to print headings for four weeks (Weeks 1 - 4).
        // Then use another for loop to print the days (Days 1 -7) for each
        // week.

        for(int i=1;i<=4;i++){
            System.out.println("Week "+i);
            for(int j=1;j<=7;j++){
                System.out.println("Day "+j);
            }
        }




        //10.Write a program that check if the word is a palindrom or not.
        System.out.println("Enter a word: ");
        String word=s.nextLine();

        boolean boolea=true;
        int length = word.length();

        for (int i =0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                boolea = false;
                break;
            }
        }

        if (boolea) {
            System.out.println(word +" is a palindrome word");
        } else {
            System.out.println(word+ " is not a palindrome word");
        }






    }
}
