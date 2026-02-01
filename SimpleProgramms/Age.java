import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age:");
        int a=sc.nextInt();
        if(a>=18){
            System.err.println("Your age is :"+ a +"\n you are eligible to vote..");
        }else{
            System.err.println("Your age is :"+ a +"\n you are not eligible to vote..!");
        }
        sc.close();
    }
}
