package com.github.liaohuijun.concurrency.demo1.sync005;
/**
 * synchronized的重入
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年3月5日
 */
public class SyncDubbo1 {

	public synchronized void method1(){
		System.out.println("method1..");
		method2();
	}
	public synchronized void method2(){
		System.out.println("method2..");
		method3();
	}
	public synchronized void method3(){
		System.out.println("method3..");
	}
	
	public static void main(String[] args) {
		final SyncDubbo1 sd = new SyncDubbo1();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				sd.method1();
			}
		});
		t1.start();
	}
}
