package com.ggr.leecode.backTracking;

/**
 * @author : gr
 * @date : 2019/11/18 9:53
 * 斐波那契数组
 * 1,1,2,3,5,8,13,21,34
 */
public class 斐波那契数组 {
    public static void main(String[] args) {
        int result = solution(8);
        System.out.println(result);
    }

    public static int solution(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return solution(i - 1) + solution(i - 2);
    }
}
