
public class maxThread implements Runnable {
	int[] list;
	public maxThread(int[] list) {
		this.list = list;
	}
	public void run() {
		int max = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i] > max) {
				max = list[i];
			}
		}
		System.out.println("The maximum value is: " + max);
	}
}

