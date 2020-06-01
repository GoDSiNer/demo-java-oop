public class a1 {
    static int i;
    public static void main(String[] args) {
        seti();
        printNumber(i);
        println();
    }
    static void seti(){i = 1;}
    static void printNumber(int j){System.out.println("Number = "+j);}
    static void println(){System.out.println("==========");}
}