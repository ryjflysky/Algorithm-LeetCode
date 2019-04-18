package leetcode.sequence001To100;

// 59.螺旋矩阵II

/*
	 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
	
	示例:
	
	输入: 3
	输出:
	[
	 [ 1, 2, 3 ],    1, 2, 3, 4
	 [ 8, 9, 4 ],   12,13,14, 5
	 [ 7, 6, 5 ]	11,16,15, 6	
	]               10, 9, 8, 7
 */
public class Solution59 {
	public int[][] generateMatrix(int n) {
		int[][] res = new int[n][n]; // 矩阵数组
		int sequence = 1; // 序号
		int x = 1, y = 1; // x标识，y标识行
		int Len = n / 2; // 循环次数
		for (int i = 1; i <= Len; i++) {
			x = y = i; // 采用分治法，把矩阵进行拆分，每次给一个矩阵排序，由外到内
			for (; x <= n - i; x++) { 
				res[y - 1][x - 1] = sequence++; 
			}
			for (; y <= n - i; y++) {
				res[y - 1][x - 1] = sequence++;
			}
			for (; x > i; x--) {
				res[y - 1][x - 1] = sequence++;
			}
			for (; y > i; y--) {
				res[y - 1][x - 1] = sequence++;
			}
		}
		if (n % 2 == 1) {
			res[Len][Len] = n * n; // 如果是奇数的话还有最里面一个矩阵没有给序号
		}
		return res;
    }
	public static void main(String[] args) {
		Solution59 s = new Solution59();
		s.generateMatrix(4);
	}
}
