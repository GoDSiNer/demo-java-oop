import java.util.Scanner;
class person{
    private int id;
    private double scoreBefore;
    private String name;
    person(int i, String n, double s){
        this.id = i;
        this.name = n;
        this.scoreBefore = s;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getScoreBefore(){
        return scoreBefore;
    }
}
class Nursary_student extends person{
    double p1;
    double p2;
    double p3;
    Nursary_student(int i,String n, double s, double p1, double p2){
        super(i,n,s);
        this.p1 = p1;
        this.p2 = p2;
    }
    public double calAndGetp3(){
        p3 = (p1+p2)/2-getScoreBefore();
        return p3;
    }
    public double getP1(){
        return p1;
    }
    public double getP2(){
        return p2;
    }
}
public class Nursary1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter id : ");
        int id =input.nextInt();
        System.out.print("Enter name : ");
        String name =input.next();
        System.out.print("Enter scoreBefore : ");
        double scoreBefore =input.nextDouble();
        System.out.print("Enter term1 : ");
        double p1 =input.nextDouble();
        System.out.print("Enter term2 : ");
        double p2 =input.nextDouble();
        Nursary_student a = new Nursary_student(id, name, scoreBefore, p1, p2);
        System.out.println("Name : "+a.getName()+"\n"+"ScoreBefore : "+a.getScoreBefore()+"\n"+"Compare : "+a.calAndGetp3());
    }
}
