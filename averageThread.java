
public class averageThread implements Runnable {
	int[] list;
	public averageThread(int[] list) {
		this.list = list;
	}
	public void run() {
		double sum = 0;
		for(int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		sum /= list.length;
		System.out.println("The average value is: " + sum);
	}
}
