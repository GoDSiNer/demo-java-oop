class one{
    one(int i) {System.out.println("From class one : "+i);}
}
class two extends one{
    two(int i) { super(i);System.out.println("From class two : "+i);}
}
class three extends two{
    three(int i) {super(i);System.out.println("From class three : "+i);}
}
public class Testconstructor {
    public static void main(String[] args) {
        three x = new three(3);
        two y   = new two(9);
    }
}