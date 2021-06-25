package heapmemory;

import java.util.Arrays;

public class ArrayComparsion {

	public static void main(String[] args) {
		// 문자열과 다르게 배열은 일부부분만 변경 가능하다.
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5};
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		// 주소값이 아닌 전체 배열 데이터를 보고싶다면
		// Arrays.toString(배열); 문법을 사용합니다.
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

}
