import javax.swing.*;
import java.util.Random;

public class Main {
    public static void  main(String[] args){
        Random random = new Random();
        double X = Double.parseDouble(JOptionPane.showInputDialog("enter the value of x"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("enter the value of y"));
        double a = random.nextDouble();

        double z = Math.sqrt(X+y)+ a;
        System.out.println("hypotenuse of the given numbers is "+ z);
        System.out.println("random number is "+ a);
    }
}