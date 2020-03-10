package com.ggr.leecode.hash;

/**
 * @author : gr
 * @date : 2020/1/13 16:37
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 说明:
 *
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/divide-two-integers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 两数相除 {
	public static void main(String[] args) {

	}

	public int divide(int dividend, int divisor) {
		if(divisor==0){
			return 0;
		}
		if (dividend > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (dividend < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		boolean bo = (dividend ^ divisor) > 0;
		long d = Math.abs((long)dividend);
		long t = Math.abs((long) divisor);
		int result = 0;

		for (int i = 2; i >=0 ; i--) {
			if (d >> i > t) {
				result+= (1<<i);//位移运算
				d -= (d << i);
			}
		}

		return bo?result:-result;
	}


}
