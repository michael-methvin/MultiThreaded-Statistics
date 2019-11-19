
public class minThread implements Runnable{
	int[] list;
	public minThread(int[] list) {
		this.list = list;
	}
	public void run() {
		int min = list[0];
		for(int i = 0; i < list.length; i++) {
			if(list[i] < min) {
				min = list[i];
			}
		}
		System.out.println("The minimum value is: " + min);
	}
}
