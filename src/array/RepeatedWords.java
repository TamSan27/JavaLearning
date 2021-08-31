package array;

public class RepeatedWords {

	public static void main(String[] args) {
		String a = "Container object that holds the fixed number of values of a same datatype. In Java, array is a datatype. We declare array with below values.";
		
		String arr[] = a.split(" ");
		
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The word is repeated" + arr[i]);
					break;
				}
			}
		}
	}

}
