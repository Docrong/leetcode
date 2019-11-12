package com.ggr.leecode.hash;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author : gr
 * @date : 2019/11/12 11:01
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 有效的括号 {
    public static void main(String[] args) {
        boolean b=solution("[]{}(()){}{}");
//        boolean b=solution("(())");
        System.out.println(b);
    }


    public static boolean solution(String str) {
        while (str.contains("()")||str.contains("[]")||str.contains("{}")) {
        str=str.replace("()","");
        str=str.replace("[]","");
        str=str.replace("{}","");
        }
        return str.length()==0;
    }
}
