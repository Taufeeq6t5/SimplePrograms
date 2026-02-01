import java.util.Scanner;

public class SimpleCalculator{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("***Welcome to Simple Calculator***");
        System.out.println("\nChoose an operation [+,-,*,/,%]:");
        char op=sc.next().charAt(0);

        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        double result=0;

        switch(op){
            case '+' : result=num1+num2;
             
            break;
            case '-' : result=num1-num2;
             
            break;
            case '*' : result=num1*num2;
             System.out.println("The Result is: "+ result);
            break;
            case '/' : 
                if(num2==0){
                    System.out.println("Error Division by zero!!");
                }else{
                    result=num1/num2;
                     System.out.println("The Result is: "+ result);
                }
            break;
            case '%' :
                if(num2==0){
                    System.out.println("Error Cannot modulo of zero!!");
                }else{
                    result=num1 % num2;
                     System.out.println("The Result is: "+ result);
                }
            break;
            default : System.out.println("Error Invalid Operation..");
        }
       
        System.out.println("Thank You..");
        sc.close();

    }
}