public class Animal{
	String nom;
    public void crier() {
		System.out.println("l'animal"+this.nom+"crie");// Complète ici : afficher "L'animal [nom] crie"
    }
	public Animal (String nom){
		this.nom = nom;
	}

    public static void main(String[] args) {
        Animal chat = new Animal("Minou");
        chat.crier();
    }
}