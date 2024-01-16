import java.awt.*;
import java.util.Scanner;

public class logical {
    public static void main(String[] args){
        // logical operator is used to merge two or more conditions
            // and = two conditions must be equal (&&)
            // or = either one must be equall (||)
            // not = reverse boolean value of condtions !!
            Scanner newobj= new Scanner(System.in);
            System.out.println("enter the number :");

            double number = newobj.nextDouble();

            System.out.println("the entered number "+ number + (number>0 ? " and is postive" :(number<0 ? " and is negative" : " and is zero") ));

//            if(number>0){
//                System.out.println("postive");
//            } else if (number<0) {
//                System.out.print("negative");
//            }else{
//                System.out.print("zero");
//            }
            System.out.println("the enter number "+ number + (number%2==0 ? "and number is even" : " and number is odd"));
            System.out.println("the enter number "+ number + (number%1==0 ? "and number is integer": " decimal"));


    }
}
