package com.ggr.leecode.hash;

/**
 * @author : gr
 * @date : 2019/11/8 11:16
 */
public class N型矩阵 {
    public static void main(String[] args) {
        int[][] arr = solution(3);
        System.out.println(arr);
    }

    /**
     * @param x
     * @return
     */
    public static int[][] solution(int x) {
        int[][] arr = new int[x][x];
        int i = 0, j = 0, num=0;
        while (num < x * x) {
            //向右走
            while (i < x) {
                num++;
                arr[i][j]=num;
                System.out.println("行:["+i+","+j+"]=>"+arr[i][j]+"\t num=>"+num);
                i++;
            }
            //向下走

            while (j < x) {
                if (i == x) {
                    i--;num--;
                }
                num++;
                arr[i][j]=num;
                System.out.println("列:["+i+","+j+"]=>"+arr[i][j]+"\t num=>"+num);
                j++;
            }
            //向左走
            while (i>0){
                if (j == x) {
                    j--;num--;
                }
                num++;
                arr[i][j]=num;
                System.out.println("列:["+i+","+j+"]=>"+arr[i][j]+"\t num=>"+num);
                i--;
            }

            //向上走
        }

        return arr;
    }
}
