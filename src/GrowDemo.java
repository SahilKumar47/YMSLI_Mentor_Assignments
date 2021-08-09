
class Grow {
	private int arr[];
	private int size;
	private int capacity;

	public Grow() {
		this.size = 0;
		arr = new int[capacity];
	}

	public void growArray() {
		int newArr[] = new int[2 * capacity];

		for (int i = 0; i < size; size++) {
			newArr[i] = arr[i];
		}
		this.capacity *= 2;
		this.arr = newArr;
	}

}
public class GrowDemo {
	public static void main(String[] args) {
		
	}
}
