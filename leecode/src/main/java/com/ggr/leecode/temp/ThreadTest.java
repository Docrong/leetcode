package com.ggr.leecode.temp;

/**
 * @author : gr
 * @date : 2019/11/27 14:14
 */
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(1);
		Thread.sleep(5000);


		System.out.println(3);
	}

	static class MyThread implements Runnable {
		@Override
		public void run() {
			System.out.println(213);
		}
	}
}
