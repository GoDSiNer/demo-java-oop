import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private String  tel;
    private String type;
    public Employee(int id, String name, String tel, String type){
        this.id =id;
        this.name =name;
        this.tel = tel;
        this.type = type;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getTel(){
        return tel;
    }
    public String getType(){
        return type;
    }
}
class Fulltime extends Employee{
    private double salary;
    private double socialFee;
    public Fulltime(int id, String name, String tel, String type, double salary, double socialFee){
        super(id, name, tel, type);
        this.salary = salary;
        this.socialFee = socialFee;
    }
    public double calSocialFee(){
        return salary*socialFee/100;
    }
    public double getSalary(){
        return salary;
    }
    public double getSocialFee(){
        return socialFee;
    }
}
class Daily extends Employee{
    private double wagePerDay;
    private int workDay;
    private int OverTime;
    public Daily(int id, String name, String tel, String type, double wagePerDay, int OverTime, int workDay){
        super(id,name,tel,type);
        this.wagePerDay = wagePerDay;
        this.OverTime = OverTime;
        this.workDay = workDay;
    }
    public double calWage(){
        return wagePerDay*workDay;
    }
    public double calOverTime(){
        if (OverTime>=31) return OverTime = OverTime*100;
        else if (OverTime>20) return OverTime = OverTime*90;
        else return OverTime = OverTime*80;
    }
    public double getWagePerDay(){
        return wagePerDay;
    }
    public int getWorkDay(){
        return workDay;
    }
    public int getOverTime(){
        return OverTime;
    }
}
public class Exam2 {
    public static void main(String[] args) {
        Fulltime x[] = new Fulltime[10];
        Daily y[] = new Daily[10];
            int id = 1;
            int countx = 1;
            int county = 1;
            while(id>0){
                Scanner input = new Scanner(System.in);
                System.out.print("id\t ");
                int ID              = input.nextInt();
                if (ID==-1) {
                    id =-1;
                }
                else {
                    System.out.print("Name ");
                    String Name         = input.next();
                    System.out.print("Tell ");
                    String tel         = input.next();
                    System.out.print("Type ");
                    String type          = input.next();
                    if(type.equals("a")){
                    System.out.print("Salary ");
                    double salary     = input.nextDouble();
                    System.out.print("SocialFee ");
                    double socialFee     = input.nextDouble();
                    x[countx] = new Fulltime(ID,Name,tel,type,salary,socialFee);
                    countx++;
                    }
                    else{
                    System.out.print("WagePerDay ");
                    double wagePerDay         = input.nextDouble();
                    System.out.print("WorkDay ");
                    int workDay      = input.nextInt();
                    System.out.print("OverTime ");
                    int OverTime         = input.nextInt();
                    y[county] = new Daily(ID,Name,tel,type,wagePerDay,OverTime,workDay);
                    county++;
                    }         
                }
            }
                for(int i=1 ;i<countx;i++){
                    System.out.print("id\t name \t salary\t socialFee\t TrueSalary\n");
                    System.out.println(x[i].getId()+"\t"+x[i].getName()+"\t"+x[i].getSalary()+"\t"+x[i].calSocialFee()+"\t"+(x[i].getSalary()-x[i].calSocialFee()));
                        System.out.println("----------------------------");break;

                }
                for(int j =1;j<county;j++){
                    double k = y[j].calOverTime();
                    double g = y[j].calWage();
                    System.out.print("id\t name \t wage\t overtime\t Truewage\n");
                    System.out.println(y[j].getId()+"\t"+y[j].getName()+"\t"+y[j].calWage()+"\t"+k+"\t"+(k+g));
                        System.out.println("----------------------------");break;
                }
                System.out.print("---end---");
    }
}