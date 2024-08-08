import java.util.Scanner;
import java.util.Arrays;
class ClassRoom {
    String name;
    String students[];
    ClassRoom(String s, String arr[]) {
        name = s;
        students = arr;
    }

    void print() {
        System.out.println("Class name: " + name);
        System.out.println("Students: "+ Arrays.toString(students));
    }
}

public class Constructor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of Students:  ");
        int z = sc.nextInt();
        String abcd[]=new String[z];
        System.out.println("enter syudent names: ");
        for(int i=0;i<z;i++){
            abcd[i]=sc.next();
        }

        ClassRoom c1=new ClassRoom("final_year",abcd);
        c1.print();
    }
}