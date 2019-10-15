public class Theatre{
	String nomPiece;
	int tailleSalle;
	int ticketNormal;
	int ticketReduit;
	double prix;

	
	public Theatre(String nomPiece, int tailleSalle, int ticketNormal, int ticketReduit, float prix){
		this.nomPiece = nomPiece;
		this.tailleSalle = tailleSalle;
		this.ticketNormal = ticketNormal;
		this.ticketReduit = ticketReduit;
		this.prix = prix;
	}

	public int nbPlacesDispo(String nomPiece){
		int placesDispo = tailleSalle - (ticketNormal + ticketReduit); 
		return placesDispo;
	}
	//Pour utiliser la fonction mettre true ou false comme 2è arg
	public void vendrePlaces(int nbre, boolean tarifReduit){
		if(nbre <= tailleSalle){
			if(tarifReduit == true){
				ticketReduit += nbre;
			}
			else if(tarifReduit == false){
				ticketNormal += nbre;
			}
		}
		else{
			System.out.println("Erreur: pas assez de places disponibles.");
		}

		
	}
	public void remiseAZero(){
		ticketReduit = 0;
		ticketNormal = 0;
		System.out.println("Remise à zero des places pour " + nomPiece); 
		nbPlacesDispo(nomPiece);		//Vérif que la RAZ est faite
	}	
	public double chiffreAffaires(){
		double total = ticketReduit * (prix*0.2) + ticketNormal * prix;
		//tarif réduit = tarif normal -20%, permet de choisir n'importe quel prix normal auquel sera appliquée la réduction
		return total;
	}
	public double tauxRemplissage(){
		// on stocke total tickets dans un double pour éviter les problèmes de types
		double tickets = ticketReduit + ticketNormal;
		double taux = (tickets/tailleSalle) * 100;
		return Math.round(taux); //fonction qui arrondit le double à l'entier supérieur pour éviter trop de décimales (choix personnel)
	}
	public void afficher(){
		//choix d'afficher toutes les infos traitées par les autres fonctions pour avoir un affichage complet
		System.out.println("Pièce jouée: "+nomPiece+", Nombre de places: "+tailleSalle+", Prix d'une place : "+prix+"€, "+ticketNormal+" places vendues au tarif normal, "+ticketReduit+" places vendues au tarif réduit.");
		System.out.println("Places disponibles: " +nbPlacesDispo(nomPiece)+" (taux de remplissage: "+ tauxRemplissage()+"%).");
	}

	public static void main(String[] args){
		Theatre piece1 = new Theatre("EUREKA", 60, 20, 14, 7.5f);
		Theatre piece2 = new Theatre("Hamlet", 85, 0, 0, 9);
		

		//Tests piece1
		piece1.vendrePlaces(4, true);
		piece1.afficher();
		piece1.remiseAZero();
		piece1.vendrePlaces(27, false);
		piece1.vendrePlaces(8, true);
		piece1.afficher();

		System.out.println("\n\n");

		//Tests piece2
		piece2.afficher();
		piece2.vendrePlaces(27, false);
		piece2.vendrePlaces(8, true);
		piece2.afficher();
		piece2.remiseAZero();
	}
}
