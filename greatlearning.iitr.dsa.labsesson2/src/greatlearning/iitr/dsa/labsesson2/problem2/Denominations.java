package greatlearning.iitr.dsa.labsesson2.problem2;

import java.util.Scanner;

public class Denominations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ener the size of currency denominations");
		int value = sc.nextInt();
		int size[] = new int[value];

		System.out.println("ener the currency denominations value");
		for (int i = 0; i < value; i++) {
			size[i] = sc.nextInt();
		}

		for (int i = 0; i < value; i++) {
			int unsorted = size[i];
			int sorted = i - 1;
			while (sorted >= 0 && size[sorted] > unsorted) {
				size[sorted + 1] = size[sorted];
				sorted--;
			}

			size[sorted + 1] = unsorted;

		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		int value1 = 0;
		for (int i1 = value - 1; amount > 0; i1--) {
			if (amount >= size[i1]) {
				value1 = amount / size[i1];
				amount = amount % size[i1];
				System.out.println("Your payment approach in order to give min no of notes will be");
				System.out.println(size[i1] + ":" + value1);
			}

		}

	}
}
