import java.util.Scanner;
class AA{
    public int a,b;
    AA(){a =5; b = 3;}
    AA(int s){a = s+3; b = s+1;}
    public void print(){System.out.println(a+"\t"+b);}
}
class BB extends AA{
    private int b,c;
    BB(int x, int y){super(y);b =x; c= y;}
    public void add(int k){c = c+k;}
    public void print(){System.out.println(a+"\t"+b+"\t"+c); super.print();}
}
public class Exam1260Fin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s =sc.nextInt();
        System.out.println("id => "+s);
        AA t = new AA();
        AA r = new AA(s);
        BB p = new BB(s,s+2);
        t.print();
        r.print();
        p.add(s);
        p.print();
    }
}