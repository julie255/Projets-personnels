public class Difference {

    // Calcule la somme des carrés des n premiers nombres naturels
    public static int sommeDesCarres(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme=somme +(i * i) ;
        }
        return somme;
    }

    // Calcule le carré de la somme des n premiers nombres naturels
    public static int carreDeLaSomme(int n) {
        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme= somme + i;
        }
        return somme * somme;
    }

    // Calcule la différence demandée
    public static int difference(int n) {
        return carreDeLaSomme(n) - sommeDesCarres(n);
    }
        public static void main(String[] args) {
            System.out.println(Difference.difference(100));
        }
    }
