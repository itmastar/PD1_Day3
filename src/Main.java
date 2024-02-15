import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Conditional statements
        //if , if -else , else -if , nested if-else
        //loops --> for , while , do-while
        //switch case

//        System.out.println("Please enter age");
//        Scanner sc=new Scanner(System.in);
//        int age =sc.nextInt();
//        if(age>=18){
//            System.out.println("You are a Major !!");
//        }else{
//            System.out.println("You are a Minor !!");
//        }

       /* System.out.println("Please enter marks ");
        Scanner scan=new Scanner(System.in);
        int marks= scan.nextInt();
        if(marks >=70){
            System.out.println("Distinction");
        }else if(marks >=60 && marks <70){
            System.out.println("First class");
        }else if(marks >=50 && marks <60){
            System.out.println("Pass");
        }else{
            System.out.println("fail ");
        }*/
        //NESTED IF_ELSE
        System.out.println("Please enter age");
        Scanner scanner=new Scanner(System.in);
        int customerAge=scanner.nextInt();
        char hasCoupon;
        System.out.println("Do you have a coupon . Reply 'S' or 'N' ");
        hasCoupon=scanner.next().charAt(0);
        double discount;
        double extraDiscount;
        int ticketPrice=100;
        if(customerAge<=15){
            discount=0.5;
            if(hasCoupon=='S' || hasCoupon=='s'){
                extraDiscount=0.1;
            }else{
                extraDiscount=0;
            }
        }else{
            discount=0;
            if(hasCoupon=='S' || hasCoupon=='s'){
                extraDiscount=0.1;
            }
            else{
                extraDiscount=0;
            }
        }
        double discountedPrice=ticketPrice*(discount+extraDiscount);
        System.out.println("Final ticket price :: "+(ticketPrice-discountedPrice));

    }
}