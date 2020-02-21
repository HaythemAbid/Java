package occurance;
import java.util.Scanner;


public class Occurance {
	static final int max = 256 ; 
	
	public static void CharCount (String str) {
		int count [] = new int[max] ;
		
		int len = str.length() ;
		
		//Initialisation de count array 
		for (int i=0 ; i< len ; i++) 
			count[str.charAt(i)]++ ;
		
		// create an array of the givin string
		
		char ch[] = new char[str.length()] ;
		for (int i=0; i < len ; i++) {
			ch[i] = str.charAt(i) ;
			int recherche = 0 ;
			for (int j = 0 ; j <= i ; j++ ) {
				if (str.charAt(i) == ch[j])
					recherche ++ ;
			}
			if ( recherche == 1) 
				System.out.println(" nombre d'occurance de :" + str.charAt(i) + " est" + count[str.charAt(i)]) ;
			
			}
	}
	public static void main(String[] args) 
	{
		System.out.println("Donner une chaine : ");
		Scanner sc = new Scanner(System.in) ;
		String chaine = sc.nextLine() ;
		CharCount(chaine) ;
	}
}
