package com.ggr.leecode.temp;

/**
 * @author : gr
 * @date : 2019/12/4 11:15
 */
public class StringTest {

	private static String postid;

	public static void main(String[] args) {
		postid = "";
		String[] arr = postid.split(",");
		StringBuffer sb = new StringBuffer();
		for (String s : arr) {
			sb.append("'").append(s).append("'").append(",");
		}
		if (sb.length() > 0) {
			postid =sb.substring(0, sb.length() - 1);
		}
		System.out.println(postid);
	}
}
