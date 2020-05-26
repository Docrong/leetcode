//实现 int sqrt(int x) 函数。 
//
// 计算并返回 x 的平方根，其中 x 是非负整数。 
//
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。 
//
// 示例 1: 
//
// 输入: 4
//输出: 2
// 
//
// 示例 2: 
//
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842..., 
//     由于返回类型是整数，小数部分将被舍去。
// 
// Related Topics 数学 二分查找


package leetcode.editor.cn;

//Java：x 的平方根
class P69x的平方根 {
    public static void main(String[] args) {
        Solution solution = new P69x的平方根().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int mySqrt(int x) {
            if (x == 1) {
                return 1;
            }

            int max = x;
            int min = 0;
            while (min+1 < max) {
                int m = (max + min) / 2;
                if (m  > (x/m)) {
                    max = m;
                } else {
                    min = m;
                }
            }
            return min;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}