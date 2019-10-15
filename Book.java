import java.util.*;

public class Book{
	String titre;
	String auteur;
	String editeur;

	public static void main(String[] args){
		//String input;
		Scanner input = new Scanner(System.in);
		System.out.print("Ajouter un livre ?\n(y/n): ");
		input = in.nextLine();
		ArrayList<Book> myAl = new ArrayList<Book>();
		
		if(input.equals("y")){
			for(int cnt=0;cnt < 2; cnt++){
				Book xx = new Book();
				
				System.out.print("Titre : ");
				xx.titre = in.nextLine();


				System.out.print("Auteur: ");
				xx.auteur = in.nextLine();

				System.out.print("Editeur: ");
				xx.editeur = in.nextLine();

				System.out.println(xx.titre + xx.auteur + xx.editeur);
				myAl.add(xx);
			}
			//System.out.println("__Livre__	Titre_:"+titre+" Auteur_:"+auteur+" Editeur_:"+editeur+".");
			Book disp = new Book();

			for (int i = 0; i < myAl.size(); i++) {
				Book xx = new Book();
				System.out.print(xx.titre);
			//myAl.get(xx.titre);

			}
		}
		else{
			if(input.equals("n")) {
				System.exit(0);	
			}
			System.out.print("Ajouter un livre ?\n(y/n): ");
		}
	}
	
}
