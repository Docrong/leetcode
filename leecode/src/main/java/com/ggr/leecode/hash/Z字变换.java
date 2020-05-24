package com.ggr.leecode.hash;

/**
 * @author : gr
 * @date : 2019/11/26 9:32
 * <p>
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * <p>
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Z字变换 {
	public static void main(String[] args) {
		System.out.println(convert("LEETCODEISHIRING",3));
	}

	public static String convert(String s, int numRows) {
		if (numRows == 1) {
			return s;
		}
		int n = s.length();
		int cyclength = 2 * numRows - 2;
		StringBuffer ret = new StringBuffer();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; i+j<n  ; j+=cyclength) {
				ret.append(s.charAt(i + j));
				//不是第一行,也不是最后一行,
				if (i != 0 && i != numRows - 1 && j + cyclength - i < n) {
					ret.append(s.charAt(j + cyclength - i));
				}
			}
		}
		return ret.toString();
	}
}
