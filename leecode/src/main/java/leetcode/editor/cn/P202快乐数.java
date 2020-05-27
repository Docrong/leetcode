//编写一个算法来判断一个数 num 是不是快乐数。 
//
// 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
//如果 可以变为 1，那么这个数就是快乐数。 
//
// 如果 num 是快乐数就返回 True ；不是，则返回 False 。 
//
// 
//
// 示例： 
//
// 输入：19
//输出：true
//解释：
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
// 
// Related Topics 哈希表 数学


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：快乐数
public class P202快乐数 {
    public static void main(String[] args) {
        Solution solution = new P202快乐数().new Solution();
        solution.isHappy(19);
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isHappy(int num) {
            /**超时
             List<String> asList = Arrays.asList(String.valueOf(num).split(""));
             int temp = 0;
             while (num > 3) {
             for (int i = 0; i < asList.size(); i++) {
             temp += Math.pow(Integer.valueOf(asList.get(i)), 2);
             }
             num = temp;
             temp = 0;
             asList = Arrays.asList(String.valueOf(num).split(""));
             }
             if (num == 1) {
             return true;
             }
             return false;
             */

            int slow = squareNum(num);
            int fast = squareNum(squareNum(num));
            while (slow != fast) {
                slow = squareNum(slow);
                fast = squareNum(squareNum(fast));
            }

            return slow == 1;
        }

        public int squareNum(int num) {
            int sum = 0;
            while (num > 0) {
                int t = num % 10;
                sum += Math.pow(t, 2);
                num = num / 10;
            }
            return sum;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}