package javaStudy;

public class ArrayWithFor {

	public static void main(String[] args) {
		int [] iarray = new int[100];
		iarray[0] = 1;
		iarray[1] = 2;
		
		for(int i = 0; i < iarray.length; i++) {
			iarray[i] = i + 1;
		}
		
		int total = 0;
		for(int i = 0; i < iarray.length; i ++) {
			total += iarray[i];
		}
		
		System.out.println(total);
	}

}
