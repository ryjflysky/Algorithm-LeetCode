package leetcode.sequence001To100;

// 43.字符串相乘
public class Solution43 {
	public String multiply(String num1, String num2) {
		if (num1.startsWith("0") || num2.startsWith("0")) {
			return "0";
		}
		char[] arr1 = num1.toCharArray();
		char[] arr2 = num2.toCharArray();
		reverse(arr1);
		reverse(arr2);
		int[] res = new int[arr1.length + arr2.length];
		
		int index = 0;
		int flag = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				index = i + j;
				flag = 0;
				int mul = (arr1[i] - '0') * (arr2[j] - '0');
				if (mul >= 10) {
					flag = mul / 10;
					mul = mul % 10;
				}
				int sum = res[index] + mul;
				if (sum >= 10) {
					flag += (sum / 10);
				}
				res[index++] = sum % 10;
				do {
					sum = res[index] + flag;
					if (sum >= 10) {
						flag = sum / 10;
					} else {
						flag = 0;
					}
					res[index++] = sum % 10;
				} while (flag != 0);
			}
		}
		index = res.length - 1;
		while (res[index] == 0) {
			index--;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = index; i >= 0; i--) {
			sb.append(res[i]);
		}
        return sb.toString();
    }
	
	public void reverse(char[] arr) {
		if (arr.length <= 1) {
			return;
		}
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void main(String[] args) {
		Solution43 s = new Solution43();
		System.out.println(s.multiply("10000000000", "1000000000000000"));
	}
}
