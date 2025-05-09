public class Fibonacci {
    public static void main(String[] args) {
    int max = 4000000;
    int a = 1;
    int b = 2;
    int somme = 0;
    while (b <= max) {
        if (b % 2 == 0) {
            somme = somme+b;
        }
        int temp = a + b;
        a = b;
        b = temp;
    }

    System.out.println("Somme des termes pairs : " + somme);
}
}