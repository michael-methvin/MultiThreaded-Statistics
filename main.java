import java.util.Scanner;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		/*int[] test1 = {1,3,4,5,7,1,4,6};
		int[] test2 = {9,4,6,2,8,3,8,11};
		stats(test1);
		stats(test2);*/
		System.out.println("Enter the numbers to put into your list. Enter -1 to stop adding numbers.");
		int number = 0;
		int count = 1;
		while(number >= 0) {
			System.out.println("Enter number " + count);
			number = input.nextInt();
			if(number >= 0) {
			list.add(number);
			count++;
			}
		}
		System.out.println("-------------------------");
		System.out.println("The list you entered is: ");
		int[] newList = new int[list.size()];
		for(int i = 0; i < newList.length; i++) {
			newList[i] = list.get(i);
			System.out.print(newList[i] + " ");		}
		System.out.println("");
		stats(newList);
	}
	public static void stats(int[] list) {
		averageThread a = new averageThread(list);
		Thread t1 = new Thread(a);
		maxThread b = new maxThread(list);
		Thread t2 = new Thread(b);
		minThread c = new minThread(list);
		Thread t3 = new Thread(c);
		t1.run();
		t2.run();
		t3.run();
	}
}
