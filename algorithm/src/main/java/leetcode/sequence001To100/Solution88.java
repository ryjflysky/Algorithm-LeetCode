package leetcode.sequence001To100;

// 88.合并两个有序数组
public class Solution88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] buf = new int[m + n];
		int mindex = 0;
		int nindex = 0;
		int index = 0;
		while (mindex < m && nindex < n) {
			if (nums1[mindex] > nums2[nindex]) {
				buf[index++] = nums2[nindex++];
			} else {
				buf[index++] = nums1[mindex++];
			}
		}
		while (mindex < m) {
			buf[index++] = nums1[mindex++];
		}
		while (nindex < n) {
			buf[index++] = nums2[nindex++];
		}
		
		for (int i = 0; i < index; i++) {
			nums1[i] = buf[i];
		}
    }
	public static void main(String[] args) {
		Solution88 s = new Solution88();
		int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
		int[] nums2 = new int[] {2, 5, 6};
		s.merge(nums1, 3, nums2, 3);
		for (int i = 0; i < 6; i++) {
			System.out.print(nums1[i] + " ");
		}
	}
}
