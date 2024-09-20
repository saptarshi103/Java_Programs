import java.util.Scanner;
public class Excpt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b= sc.nextInt();
        //task1
        try{
            int c= a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Error divide by zero");
        }

        // task2
        int[] arr= new int[5];
        int[] ans= new int[5];
        System.out.println("Enter 5 numbers");
        for(int i =0; i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to divide");
        int d = sc.nextInt();
        try{
            for(int i =0; i<5;i++){
                ans[i]=arr[i]/d;
            }
            System.out.println("Answers are: ");
            for(int i=0;i<5;i++){
                System.out.print(" "+ans[i]);
            }
        }
        catch(Exception z){
            System.out.println("Error! Divide by zero");
        }
     }
}