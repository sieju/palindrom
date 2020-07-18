import java.util.Scanner;
import static java.lang.System.*;

public class Palindrom {
	
	public static void main(String[] args) {
		
		/*
			ZMIENNE
		 */
		String getFirst, getReverse = "";
		
		
		out.println("Program sprawdza czy dane słowo jest palindromem");
		
		/*
			WCZYTYWANIE SŁOWA , LICZBY
		 */
		
		out.print("Podaj słowo , liczbe: ");
		out.print("\n");
		Scanner getWord = new Scanner(in);
		getFirst = getWord.nextLine();
		
		int lenght = getFirst.length(); // sprawdzanie liczby znaków wczytanego słowa , liczby
		
		for (int i = lenght - 1; i >= 0; i--) // odwracanie słowa , liczby
		{
			getReverse = getReverse + getFirst.charAt(i);
		}
		
		if (getFirst.equals(getReverse)) // sprawdzanie czy słowo , liczba sa takie same
		{
			out.println("Wprowadzone słowo , liczba jest  palindromem");
		}else{
			out.println("Wprowadzone słowo , liczba nie jest palindromem");
		}
	}
}