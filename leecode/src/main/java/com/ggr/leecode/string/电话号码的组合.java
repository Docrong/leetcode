package com.ggr.leecode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date: 2019/11/24 13:10
 * @author: gr
 */
public class 电话号码的组合 {

    public static void main(String[] args) {
        letterCombinations("12345");
    }

    public static List<String> letterCombinations(String digits) {
        List result = new ArrayList();
        char[] chars = digits.replace("1", "").toCharArray();

        System.out.println(chars[1]);
        Map<String, String> map = new HashMap();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        List clist = new ArrayList();
        for (int i = 0; i < chars.length; i++) {
            clist.add(map.get(String.valueOf(chars[i])));
        }
        result.addAll(clist);
        System.out.println(clist);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < clist.size(); j++) {
                String str=String.valueOf(result.get(i)) + String.valueOf(clist.get(j));
                result.add(str);
            }
        }
        System.out.println(result);
        return result;
    }


}
