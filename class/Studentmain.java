import java.util.Scanner;
public class Studentmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id : ");
        String id =sc.next();
        System.out.print("Enter name : ");
        String name =sc.next();
        System.out.print("Enter score : ");
        double score =sc.nextDouble();
        Student ann = new Student(id, name, score);
        System.out.print("Enter id : ");
        id =sc.next();
        System.out.print("Enter name : ");
        name =sc.next();
        System.out.print("Enter score : ");
        score =sc.nextDouble();
        Student mike = new Student(id, name, score);
        System.out.print("Add score mike : ");
        mike.addScoreBefore(sc.nextDouble());
        System.out.println("id = "+ann.getId()+"\t"+"Name = "+ann.getName()+"\t"+"Score = "+ann.getScore());
        System.out.println("id = "+mike.getId()+"\t"+"Name = "+mike.getName()+"\t"+"Score = "+mike.getScore());
    }
}//class method
class Student{
    private String id;
    private String name;
    private double scoreBefore;

    public Student(String id , String name , double scoreBefore) {
        setId(id);
        setName(name);
        setScore(scoreBefore);
    }

    public void setId(String i) {
        this.id = i;
    }
     
    public void setName(String n) {
        this.name = n;
    }
    
    public void setScore(double b) {
        this.scoreBefore = b;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return scoreBefore;
    }

    public void addScoreBefore(double s) {
        this.scoreBefore = scoreBefore+s;
    }

}//object method