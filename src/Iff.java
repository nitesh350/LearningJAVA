import javax.swing.*;

public class Iff {
    public static void main(String[] args){
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age : "));

        if(age<=12){
            System.out.println("your below ten age and your age is " + age );
        } else if (age<=18) {
            System.out.println("your are in teen age and your age is " + age);

        } else {
            System.out.println("your are adult and your age is "+ age);
        }
    }
}