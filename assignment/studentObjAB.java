import java.util.Scanner;
class studentObjAB{
    public static void main(String[] args) {
        studentA x[] = new studentA[10];
        studentB y[] = new studentB[10];
            int id = 1;
            int countx = 1;
            int county = 1;
            while(id>0){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter ID(id= -1 for exit) => ");
                int ID              = input.nextInt();
                if (ID ==-1) {
                    id =-1;
                }
                else {
                    System.out.print("Enter group => ");
                    String group              = input.next();
                    if(group.equals("a")){
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
                    System.out.print("Enter Gat => ");
                    double gat  = input.nextDouble();
                    System.out.print("Enter pat1 => ");
                    double pat1  = input.nextDouble();
                    System.out.print("Enter pat2 => ");
                    double pat2  = input.nextDouble();
                    x[countx] = new studentA(ID,Name,Gpa,OnetEng,OnetMath,OnetScience,gat,pat1,pat2);
                    countx++;
                    }
                    else{
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
                    System.out.print("Enter s19 => ");
                    double s19  = input.nextDouble();
                    System.out.print("Enter s29 => ");
                    double s29  = input.nextDouble();
                    System.out.print("Enter s39 => ");
                    double s39  = input.nextDouble();
                    System.out.print("Enter s49 => ");
                    double s49  = input.nextDouble();
                    y[county] = new studentB(ID,Name,Gpa,OnetEng,OnetMath,OnetScience,s19,s29,s39,s49);
                    county++;
                    }         
                }
            }
                for(int i=1 ;i<countx;i++){
                    System.out.printf("Id = %d\t Name = %s\nGPA = %.2f\t OnetEnglish = %.2f\nOnetMath = %.2f OnetScience = %.2f\n%s\npoint = %.2f\n",
                    x[i].getId(),x[i].getName(),x[i].getGpa(),x[i].getEng(),x[i].getMath(),x[i].getScience(),x[i].printAB(),x[i].calPointAB());
                        System.out.println("----------------------------");break;

                }
                for(int j =1;j<county;j++){
                    System.out.printf("Id = %d\t Name = %s\nGPA = %.2f\t OnetEnglish = %.2f\nOnetMath = %.2f OnetScience = %.2f\n%s\npoint = %.2f\n",
                    y[j].getId(),y[j].getName(),y[j].getGpa(),y[j].getEng(),y[j].getMath(),y[j].getScience(),y[j].printAB(),y[j].calPointAB());
                        System.out.println("----------------------------");break;
                }
                System.out.print("---end---");
    }
}
abstract class studentAB {
    private int id;
    private String name;
    private double gpa;
    private double onetEng;
    private double onetMath;
    private double onetScience;
    public void student(int ID, String Name, double Gpa, double OnetEng, double OnetMath, double OnetScience){
        this.id = ID;
        this.name = Name;
        this.gpa = Gpa;
        this.onetEng = OnetEng;
        this.onetMath = OnetMath;
        this.onetScience = OnetScience;
    }
    public double calPoint(){
        double point = ((gpa/4*0.1)+(onetEng/100*0.2)+(onetMath/100*0.4)+(onetScience/100*0.3))*100;
        return point;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
    public double getEng(){
        return onetEng;
    }
    public double getMath(){
        return onetMath;
    }
    public double getScience(){
        return onetScience;
    }
    public abstract String printAB();
    public abstract double calPointAB();
}
class studentA extends studentAB{
    private double gat;
    private double pat1;
    private double pat2;
    studentA(int ID, String Name, double Gpa, double OnetEng, double OnetMath, double OnetScience, double gat, double pat1, double pat2){
        student(ID, Name, Gpa, OnetEng, OnetMath, OnetScience);
        this.gat =gat;
        this.pat1 = pat1;
        this.pat2 = pat2;
    }
    public String printAB(){
        return String.format("gat = %.2f\t pat1 = %.2f\t pat2 = %.2f",getGat(),getPat1(),getPat2());
    }
    public double calPointAB(){
        double pointA = (calPoint()+((gat/100*20)+(pat1/100*40)+(pat2/100*40)))/2;
        return pointA;
    }
    public double getGat(){
        return gat;
    }
    public double getPat1(){
        return pat1;
    }
    public double getPat2(){
        return pat2;
    }
}      
class studentB extends studentAB{
    private double s19;
    private double s29;
    private double s39;
    private double s49;
    studentB(int ID, String Name, double Gpa, double OnetEng, double OnetMath, double OnetScience, double s19, double s29, double s39, double s49){
        student(ID, Name, Gpa, OnetEng, OnetMath, OnetScience);
        this.s19 = s19;
        this.s29 = s29;
        this.s39 = s39;
        this.s49 = s49;
    }
    public String printAB(){
        return String.format("s19 = %s\t s29 = %s\t s39 = %s\t s49 = %s",getS19(),getS29(),getS39(),getS49());
    }
    public double calPointAB(){
        double pointB = (calPoint()+((s19/100*10)+(s29/100*20)+(s39/100*40)+(s49/100*30)))/2;
        return pointB;
    }
    public double getS19(){
        return s19;
    }
    public double getS29(){
        return s29;
    }
    public double getS39(){
        return s39;
    }
    public double getS49(){
        return s49;
    }
}