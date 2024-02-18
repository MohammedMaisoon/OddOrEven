import java.util.Scanner;
public class OddOrEven {
public static void main(String[] args) {
            int num;
            System.out.println("Enter a Number: ");
            Scanner input=new Scanner(System.in);
            num =input.nextInt();
            if (num%2==0){
                System.out.println("This is an Even Number");
            }
            else {
                System.out.println("This is an Odd Number");
            }
        }
    }




