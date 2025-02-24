public class PracticeProblem {

	public static void main(String args[]) {
	
	}

	public static int[] createIntArray(){
		int arr[] = new int[5];
			for (int i = 0; i < arr.length; i++){
				arr[i] = i + 1;
		}
		return arr;
	}
	public static String[] createArray(String a, String b, String c, String d) {
		String stringArr[] = {a, b, c, d};
		return stringArr;
	}
	
	public static int findValue(int num1, int[] arr2){
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == num1){
				return i;
			}
		}
		return -1;
	}

	public static int findThirdValue(String word, String[] wordArr){
		int occurance = 0;
		for (int i = 0; i < wordArr.length; i++){
			if (wordArr[i] == word){
				occurance++;
				if (occurance == 3){
					return i;
				}
			}
		}
		return -1;
	}
}
