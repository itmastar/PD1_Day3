import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("Enter traffic signal colour ");
        Scanner sc=new Scanner(System.in);
        String color=sc.next();
        color=color.toUpperCase();
        System.out.println(color);
        switch(color) {
            case "RED":
                System.out.println("STOP !!");
                break;
            case "YELLOW":
                System.out.println("READY !!");
                break;
            case "GREEN":
                System.out.println("GO !!");
                break;
            default:
                System.out.println("Please enter valid color !!");
                break;
        }

        }
    }

