package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int num = 1;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> vet = new ArrayList<Integer>();

		while (num != 0) {
			System.out.println("Digite um numero para acrescentar a Lista, ou Zero para sair");
			num = sc.nextInt();
			if (num > 0)
				vet.add(num);
		}
		System.out.println(listCheck(vet));
	};

	public static boolean listCheck(ArrayList<Integer> vet) {
		for (int i = 0; i < vet.size(); i++)
			for (int j = 0; j < vet.size(); j++) {
				if (i != j) {
					if (vet.get(i) + vet.get(j) == 42) {
						return true;
					}
				}
			}
		return false;

	}
}
