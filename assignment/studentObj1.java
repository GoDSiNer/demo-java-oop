import java.util.Scanner;
public class studentObj1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of student =>");
        int Num             = sc.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID => ");
        int ID              = input.nextInt();
        System.out.print("Enter Name => ");
        String Name         = input.next();
        System.out.print("Enter GPA => ");
        double Gpa          = input.nextDouble();
        System.out.print("Enter OnetEngish => ");
        double OnetEng      = input.nextDouble();
        System.out.print("Enter OnetMath => ");
        double OnetMath     = input.nextDouble();
        System.out.print("Enter OnetScience => ");
        double OnetScience = input.nextDouble();
        student a = new student(ID,Name,Gpa,OnetEng,OnetMath,OnetScience);
        System.out.printf("Id = %d\t Name = %s\nGPA = %.2f\t OnetEnglish = %.2f\nOnetMath = %.2f OnetScience = %.2f\nPoint = %.2f",
        a.getId(),a.getName(),a.getGpa(),a.getEng(),a.getMath(),a.getScience(),a.calPoint());
    }
}