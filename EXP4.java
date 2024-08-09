import java.util.Scanner;
public class EXP4 {
    static float yearly_interest_rate;
    float acc_balance;
    float interest;
    EXP4(float balance){
        this.acc_balance= balance;
    }
    void calculate_interest_rate(){
        this.interest= (acc_balance*yearly_interest_rate/100)/12;
    }
    void printdata(){
        System.out.printf("Interest Rate: %.2f\n",yearly_interest_rate,"%");
        System.out.printf("Interest per month:%.2f\n ",interest);
        System.out.printf("Total balance: %.2f\n",(acc_balance+interest));
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter account balance: ");
        float xyz= sc.nextInt();
        EXP4 customer_1=new EXP4(xyz);
        EXP4.yearly_interest_rate=4;
        customer_1.calculate_interest_rate();
        customer_1.printdata();
    }
}
