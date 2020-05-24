package com.ggr.leecode.temp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : gr
 * @date : 2019/11/22 8:46
 */
public class 正则表达式 {
	public static void main(String[] args) {
		String line = "若为'工程类',选项:设备入网,设备替换,设备退网,设备搬迁,链路扩容,其他;\n" +
				"若为'维护类',选项:版本升级,补丁升级,倒换演练,单板更换,网络优化,其他";
		String pattern = ".*若为'.*\\n?.*'.*选项:.*";//形如：若为'XXX',选项:A,B,C;

		// 创建 Pattern 对象
//		Pattern r = Pattern.compile(pattern);

		// 现在创建 matcher 对象
//        Matcher m = r.matcher(line);
//        if (m.find( )) {
//            System.out.println("Found value: " + m.group(0) );
//            System.out.println("Found value: " + m.group(1) );
//            System.out.println("Found value: " + m.group(2) );
//
//        } else {
//            System.out.println("NO MATCH");
//        }

		System.out.println("-----------------");
		line = "用英文逗号分割";
		pattern = "用(.*)分割";
		System.out.println(line.matches(pattern));

		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		boolean b = m.find();
		System.out.println(b);
		System.out.println(123);
		if (b) {
			System.out.println("0" + m.group(0));
			System.out.println("1" + m.group(1));

		}
		if (m.find()) {
			System.out.println("0" + m.group(0));
			System.out.println("1" + m.group(1));

		}

		line = "请输入1500";
		pattern = "\\D*(\\d*)\\D*";
		Pattern r2 = Pattern.compile(pattern);
		Matcher m2 = r2.matcher(line);
		if (m2.find()) {
			System.out.println(m2.group(1));
		}
	}
}
