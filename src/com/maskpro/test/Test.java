package com.maskpro.test;

import java.util.Scanner;

import com.maskpro.actor.Actor;


/**
 * 
 * @author Mask
 * @version 1.0
 *
 */
public class Test {

	public static void welcome() {
		// TODO
		System.out.println("**********    ��ӭ������Ϸ��    **********");
		System.out.println("**********    ��ѡ�������       **********");
		System.out.println("**********    1-����                **********");
		System.out.println("**********    2-ʨ��                **********");
		System.out.println("**********    3-����                **********");
		System.out.println("**********    4-����                **********");
		System.out.println("**********    5-С��                **********");
	}

	public void choice(Actor temp) {
//		temp.info();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte num1, num2;
		out: 
			while (true) {
				welcome();
					inner: 
						switch (num1 = sc.nextByte()) {
							case 1:
								// TODO
								System.out.println("1");
								while (true) {
									System.out.println("**********    �Ƿ�����ۿ�1/0   **********");
									switch (num2 = sc.nextByte()) {
										case 0:
											// TODO
											System.out.print("**********    ��ӭ�´ι���       **********");
											break out;
										case 1:
											// TODO
											break inner;
										default:
											// TODO
											System.out.println("Error");
											break;
									}
								}
							case 2:
								// TODO
								System.out.println("2");
								while (true) {
									System.out.println("**********    �Ƿ�����ۿ�1/0   **********");
									switch (num2 = sc.nextByte()) {
										case 0:
											// TODO
											System.out.print("**********    ��ӭ�´ι���       **********");
											break out;
										case 1:
											// TODO
											break inner;
										default:
											// TODO
											System.out.println("Error");
											break;
									}
								}
							case 3:
								// TODO
								System.out.println("3");
								while (true) {
									System.out.println("**********    �Ƿ�����ۿ�1/0   **********");
									switch (num2 = sc.nextByte()) {
										case 0:
											// TODO
											System.out.print("**********    ��ӭ�´ι���       **********");
											break out;
										case 1:
											// TODO
											break inner;
										default:
											// TODO
											System.out.println("Error");
											break;
									}
								} 
							case 4:
								// TODO
								System.out.println("4");
								while (true) {
									System.out.println("**********    �Ƿ�����ۿ�1/0   **********");
									switch (num2 = sc.nextByte()) {
										case 0:
											// TODO
											System.out.print("**********    ��ӭ�´ι���       **********");
											break out;
										case 1:
											// TODO
											break inner;
										default:
											// TODO
											System.out.println("Error");
											break;
									}
								}
							case 5:
								// TODO
								System.out.println("5");
								while (true) {
									System.out.println("**********    �Ƿ�����ۿ�1/0   **********");
									switch (num2 = sc.nextByte()) {
										case 0:
											// TODO
											System.out.print("**********    ��ӭ�´ι���       **********");
											break out;
										case 1:
											// TODO
											break inner;
										default:
											// TODO
											System.out.println("Error");
											break;
									}
								}
							default:
								System.out.println("Error");
						}
			}
	}
}
