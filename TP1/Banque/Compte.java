public class Compte{
	int solde ;
	String tit ;
	int num ;
	public Compte(int solde, String tit, int num) {
		this.solde = solde;
		this.tit = tit;
 //6.	
		this.num = num; 
	}
	void deposer(int montant){
		solde += montant; 
	}
 //Modification faite 5.
	void retirer(int montant){
		if(montant <= 0)
			System.out.println("Retrait non effectué : Entrez un montant valide (> 0).");
		else{
			if(montant > solde){
				System.out.println("Retrait non effectué : Solde insuffisant.");
			}
			solde -= montant;
		} 
	}
	void afficher(){
		System.out.println("Titulaire: " + tit + " Compte n°"+num+", Solde: " + solde +"€"); 
	}
	void virerVers(int montant, Compte b){
		if(montant <= 0)
			System.out.println("Virement non effectué : Entrez un montant valide (> 0).");
		else{
			if(montant > solde){
				System.out.println("Virement non effectué : Solde insuffisant.");
			}
			solde -= montant;
			b.solde += montant;
			System.out.println("Virement: " + tit + " à " + b.tit +", Montant: " + montant + "€\nNouveau solde: "+ tit + " " + solde + "€, " + b.tit + " " + b.solde + "€");
		}
	} 
} 