import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
//importing pakages to analyze the date 
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your date of birth (YYYY-MM-DD) :");
        String dobInput=sc.next();

        LocalDate dob=LocalDate.parse(dobInput);
        LocalDate today=LocalDate.now();

        int age=Period.between(dob,today).getYears();

        System.out.println("Your age is : "+ age);

         if(age>=18){
            System.err.println( "You are eligible to vote..");
        }else{
            System.err.println("You are not eligible to vote..!");
        }
        sc.close();
    }
}
