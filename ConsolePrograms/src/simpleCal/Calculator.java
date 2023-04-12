package simpleCal;

import util.KeyboardReader;

public class Calculator {
	int num1, num2;
	double sum;
	
	private KeyboardReader reader = new KeyboardReader();
	
	public Calculator() {}
	
	// 계산기 메뉴
	public void menu() {
		System.out.println("---------------------------------------------");
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 0.프로그램 종료");
		System.out.println("---------------------------------------------");
		System.out.println();
		
		System.out.print("### 메뉴 선택 > ");
		int menuNo = reader.readInt();
		System.out.println();
		
		if (menuNo == 1) {
			더하기();
		} else if (menuNo == 2) {
			빼기();
		} else if (menuNo == 3) {
			곱하기();
		} else if (menuNo == 4) {
			나누기();
		} else if (menuNo == 0) {
			종료하기();
		} else {
			System.out.println("보기에 나와있는 값을 입력하세요.");
		}
		System.out.println();
		System.out.println();
		menu();				// 재귀호출
		
	}
	private void 더하기() {
		System.out.println("### 두 수의 더하기");
		System.out.println("----------------------");
		
		// 값 입력
		System.out.print("### 첫번째 정수를 입력하세요 >");
		int num1 = reader.readInt();
		System.out.print("### 두번째 정수를 입력하세요 >");
		int num2 = reader.readInt();
		sum = num1 + num2;
		System.out.print("### 합계 =" + sum);
		System.out.println();
	}
	
	private void 빼기() {
		System.out.println("### 두 수의 빼기");
		System.out.println("----------------------");
		
		// 값 입력
		System.out.print("### 첫번째 정수를 입력하세요 >");
		int num1 = reader.readInt();
		System.out.print("### 두번째 정수를 입력하세요 >");
		int num2 = reader.readInt();
		sum = num1 - num2;
		System.out.print("### 합계 =" + sum);
		System.out.println();
	}
	
	private void 곱하기() {
		System.out.println("### 두 수의 곱하기");
		System.out.println("----------------------");
		
		// 값 입력
		System.out.print("### 첫번째 정수를 입력하세요 >");
		int num1 = reader.readInt();
		System.out.print("### 두번째 정수를 입력하세요 >");
		int num2 = reader.readInt();
		sum = (long)num1*num2;
		System.out.print("### 합계 =" + sum);
		System.out.println();
	}
	
	private void 나누기() {
		System.out.println("### 두 수의 나누기");
		System.out.println("----------------------");
		
		// 값 입력
		System.out.print("### 첫번째 정수를 입력하세요 >");
		int num1 = reader.readInt();
		System.out.print("### 두번째 정수를 입력하세요 >");
		int num2 = reader.readInt();
		sum = (double) num1/num2;
		System.out.print("### 합계 =" + sum);
		System.out.println();
	}
	
	private void 종료하기() {
		System.out.println("### 프로그램 종료");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.menu();
	}
	
	
}
