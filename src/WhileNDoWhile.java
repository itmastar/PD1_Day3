import java.util.Scanner;

public class WhileNDoWhile {
    public static void main(String[] args) {
        //while
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i=i+2;
//        }
//        int i=2;
//        while(i<=10){
//            System.out.println(i);
//            i=i+2;
//        }
        //dowhile
//        int i=1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);
//        int i=2;
//        do{
//            System.out.println(i);
//            i=i+2;
//        }while(i<=10);
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=5;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println(" ");
//        }

//        for(int i=1;i<=5;i++){
//            for(int j=i;j<=5;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println(" ");
//        }

//        for(int i=1;i<=5;i++){
//            for(int j=5-i+1;j<=5;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println(" ");
//        }
//        for(int i=1;i<=5;i++){
//            for(int j=5-i+1;j<=5;j++){
//                System.out.print(i+" ");
//            }
//            System.out.println(" ");
//        }
//        for(int i=1;i<=5;i++){
//            for(int j=5-i+1;j<=5;j++){
//int sum=0;
//
//                System.out.print(sum+1+" ");
//
//            }
//            System.out.println(" ");
//        }

        // % --> modulo--> remainder , / --> division  --> quotient
//        System.out.println(10/2);
//        System.out.println(11/2);
//        System.out.println(11%2);
        System.out.println("Please enter a   number ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
//        System.out.println(number%10);
//        number=number/10;
//        System.out.println(number%10);
//        number=number/10;
//        System.out.println(number%10);
        while(number>0){
            System.out.println(number%10);
            number=number/10;
        }

//input : 123
// output :: 1
//           2
//           3


    }
}
