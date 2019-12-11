package RetailMeNot;
/*

	find the length of the array
	
	ex: int[] arr = { 1, 4, -1, 3, 2 }
	arr[0] is 1, so jump to index 1;
	arr[1] is 4, so jump to index 4;
	arr[4] is 2, so jump to index 2;
	arr[2] is -1, end the jump and return the counter which is 4 jumps.
 */
public class Question3 {

	public static void main(String[] args) {
		int[] arr = { 1, 4, -1, 3, 2 };
		boolean flag = true;
		int counter = 0;
		int i = 0;
		while (flag) {
			int value = arr[i];
			if (value == -1) {
				flag = false;
			}

			i = value;
			counter++;
		}
		System.out.println(counter);
	}
}
