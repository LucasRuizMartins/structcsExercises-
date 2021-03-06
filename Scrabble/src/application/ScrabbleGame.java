package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScrabbleGame {

	public static void main(String[] args) {

		String word;
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE UMA PALAVRA");
		word = sc.nextLine();
		wordPoint(word);
		
		sc.close();
		
	}


	public static void wordPoint(String word) {
		
		int points = 0;
		int n = word.length();
		Map<String, Integer> charPoints = new HashMap<>();

		charPoints.put("E", 1);
		charPoints.put("A", 1);
		charPoints.put("O", 1);
		charPoints.put("R", 1);
		charPoints.put("T", 1);
		charPoints.put("L", 1);
		charPoints.put("S", 1);
		charPoints.put("D", 2);
		charPoints.put("G", 2);
		charPoints.put("B", 3);
		charPoints.put("C", 3);
		charPoints.put("M", 3);
		charPoints.put("P", 3);
		charPoints.put("U", 3);
		charPoints.put("F", 4);
		charPoints.put("H", 4);
		charPoints.put("V", 4);
		charPoints.put("W", 4);
		charPoints.put("Y", 4);
		charPoints.put("I", 5);
		charPoints.put("K", 5);
		charPoints.put("N", 5);
		charPoints.put("J", 8);
		charPoints.put("X", 8);
		charPoints.put("Q", 10);
		charPoints.put("Z", 10);

		for (int i = 0; i < n; i++) {
			String c1 = Character.toString(word.charAt(i));
			Integer value = charPoints.get(c1.toUpperCase());
			
			if( value > 1) { 
			System.out.println(c1 + " valendo " + value + " Pontos ");
			points += value;
			}
			else { 
				System.out.println(c1 + " valendo " + value + " Ponto ");
				points += value;
				}
		}

		System.out.println("Total de pontos: " + points);
	}

}