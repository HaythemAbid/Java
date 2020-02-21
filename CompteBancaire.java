package Bancaire;

public class CompteBancaire {
	public int solde; int numero; String nom ;
	public CompteBancaire(int solde, int numero, String nom)
	{
		this.solde = solde ;
		this.numero = numero ;
		this.nom = nom ;
	}
	public void crediter(float montant)
	{
		this.solde += montant ;
	}
	public void debiter(float montant)
	{
		this.solde -= montant ;
	}
	public int getSolde()
	{
		System.out.print("Le solde :  ") ;
		return (this.solde) ;
	}
	public void afficher()
	{
		System.out.println("Le solde :  " + this.solde + "$") ;
		System.out.println("Le numero :  " + this.numero) ;
		System.out.println("Le nom :  " + this.nom) ;
	}
	public void categorie()
	{
		if (this.solde < 1000)
			System.out.println("Votre catégorie est C4" );
		else if ((this.solde < 30000) && (this.solde >= 1000))
			System.out.println("Votre catégorie est C3" );
		else if ((this.solde >= 30000) && (this.solde < 70000))
			System.out.println("Votre catégorie est C2" );
		else if (this.solde >= 70000)
			System.out.println("Votre catégorie est C1" );
	}
	public static void main(String[] args)
	{
		CompteBancaire A = new CompteBancaire(90000, 65662 , "Haythem Abid") ;
		A.afficher();
		A.categorie();
		A.crediter(5000);
		System.out.println(" ");
		System.out.println(A.getSolde() );
	}
}
