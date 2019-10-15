import java.util.*;

public class Banque{
	public static void main(String [] args){
		Compte c1 = new Compte(1500, "Marie", 294);
		Compte c2 = new Compte(1800, "Paul", 350);
		Compte c3 = new Compte(25000, "Jack", 1420);
		Compte c4 = new Compte(14250, "Claire", 26);
 	//1.
		//dépôt de 500 euros sur le premier compte.
		c1.deposer(500);
 		//dépôt de 1000 euros sur le second compte.
 		c2.deposer(1000);
 		//retrait de 10 euros sur le second compte.
 		c2.retirer(10);
		//affichage des soldes des deux comptes.
		c1.afficher(); c2.afficher();
		//virement de Marie(c1) à Paul(c2).
	
	//2.	
		c1.virerVers(75, c2);
		
		System.out.println("\n\n");


	//5. Test retrait impossible (montant > solde)
		c3.retirer(28599);

	//3.
		//tableau avec les 4 comptes
		ArrayList<Compte> tableau = new ArrayList<Compte>();
		tableau.add(c1); tableau.add(c2); tableau.add(c3); tableau.add(c4); //ajout des comptes dans le tableau
		
		Iterator i = tableau.iterator();
		Iterator j = tableau.iterator();
		int counter = 1; 
		while(i.hasNext()){ //tant qu'il y a un élément suivant dans le tableau
			Compte cpte = (Compte)i.next(); //initialise l'objet cpte au compte 
			 
			cpte.deposer(200);
			cpte.afficher();
			cpte.solde += counter*100;
			//Fix this (fonctionne mais plante à la fin du tableau)
			//seconde boucle avec 2eme iterator j
			/* 
			for(int counter2=1; counter2<=tableau.size(); counter2++){
				Compte cpte1 = (Compte)j.next();
				cpte.virerVers(20,cpte1);
				System.out.println();
			}	
			*/
			counter++;
			System.out.println();
			//cpte.afficher();
		}

	}
}