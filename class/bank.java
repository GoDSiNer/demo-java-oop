import java.util.Scanner;
class SavingsAccount{
    public static double aRate = 0.05;
    public double balance;
    public SavingsAccount(double b){
        this.balance = b;
    }
    public void calMonthlyBal(){
        double bal = balance*aRate/12;
        balance = balance+bal;
    }
    public double getBalance(){
        return balance;
    }
}
public class bank {
    public static void main(String[] args) {
        for(int j = 0;j<2;j++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter balance of :"+(j+1));
            SavingsAccount a = new SavingsAccount(sc.nextDouble());
            for(int i =0;i<3;i++){
            a.calMonthlyBal();
            System.out.printf("%.2f\n",a.getBalance());
        }
        }
    }
}