import java.util.Scanner;
public class studentObj3{
    public static void main(String[] args) {
        student x[] = new student[10];
            int id = 1;
            int count = 1;
            while(id>0){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter ID(id= -1 for exit) => ");
                int ID              = input.nextInt();
                if (ID ==-1) {
                    id =-1;
                }
                else {
                    System.out.print("Enter Name => ");
                    String Name         = input.next();
                    System.out.print("Enter GPA => ");
                    double Gpa          = input.nextDouble();
                    System.out.print("Enter OnetEngish => ");
                    double OnetEng      = input.nextDouble();
                    System.out.print("Enter OnetMath => ");
                    double OnetMath     = input.nextDouble();
                    System.out.print("Enter OnetScience => ");
                    double OnetScience  = input.nextDouble();
                    x[count] = new student(ID,Name,Gpa,OnetEng,OnetMath,OnetScience);
                    count++;
                }
            }
        for(int i=1 ;i<count;i++){
            System.out.printf("Id = %d\t Name = %s\nGPA = %.2f\t OnetEnglish = %.2f\nOnetMath = %.2f OnetScience = %.2f\nPoint = %.2f\n"
            ,x[i].getId(),x[i].getName(),x[i].getGpa(),x[i].getEng(),x[i].getMath(),x[i].getScience(),x[i].calPoint());
                System.out.println("----------------------------");
        }
        System.out.print("---end---");
        
    }   
}