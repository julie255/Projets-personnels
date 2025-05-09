public class Pluspetit{

    // Calcule le PPCM de deux nombres
    public static int pluspetit(int a, int b) {
        return (a * b) / pgcd(a, b);
    }

    // Calcule le PGCD de deux nombres (algorithme d'Euclide)
    public static int pgcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Calcule le PPCM de tous les nombres de 1 à n
    public static int pluspetit(int n) {
        int resultat = 1;
        for (int i = 2; i <= n; i++) {
            resultat = pluspetit(resultat, i);
        }
        return resultat;
    }

    // Exemple d'utilisation
    public static void main(String[] args) {
        System.out.println("PPCM de 1 à 20 : " + pluspetit(20));
    }
}
