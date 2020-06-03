//给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。 
//
// 
//
// 
//
// 
//
// 示例： 
//
// 输入: ["Hello", "Alaska", "Dad", "Peace"]
//输出: ["Alaska", "Dad"]
// 
//
// 
//
// 注意： 
//
// 
// 你可以重复使用键盘上同一字符。 
// 你可以假设输入的字符串将只包含字母。 
// Related Topics 哈希表


package leetcode.editor.cn;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：键盘行
public class P500键盘行 {
    public static void main(String[] args) {
        Solution solution = new P500键盘行().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String[] findWords(String[] words) {

            String l1 = "qwertyuiopQWERTYUIOP";
            String l2 = "asdfghjklASDFGHJKL";
            String l3 = "zxcvbnmZXCVBNM";
            List<String> list = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                int c1 = 0, c2 = 0, c3 = 0;
                char[] chars = words[i].toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if (l1.contains(String.valueOf(chars[j]))) {
                        c1++;
                    }
                    if (l2.contains(String.valueOf(chars[j]))) {
                        c2++;
                    }
                    if ((l3.contains(String.valueOf(chars[j])))) {
                        c3++;
                    }
                }
                if (c1 == chars.length || c2 == chars.length || c3 == chars.length) {
                    list.add(words[i]);

                }
            }

            String[] result = new String[list.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
            }

            return  result;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}