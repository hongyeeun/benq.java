package org.yen.day04.array.practice;

import java.util.Scanner;

public class Practice_Array {

	public void practice1() {
		// 문제1
				// 길이 10, 1부터 10까지 반복문 이용
				// 배열에 넣은 후 값 출력
				int [] arrs = new int[10];
				
				for(int i = 0; i < 10; i++) {
					arrs[i] = (i+1);
					System.out.print(arrs[i]+ "  ");
				}
//				arrs[0] = 1;
//				arrs[1] = 2;
//				arrs[2] = 3;
//				arrs[3] = 4;
//				arrs[4] = 5;
//				arrs[5] = 6;
//				arrs[6] = 7;
//				arrs[7] = 8;
//				arrs[8] = 9;
//				arrs[9] = 10;
//				for(int i = 0; i < 10; i++) {
//					System.out.print(arrs[i]+ "  ");
//					System.out.print((i+1) + " ");
//				}
	}
	public void practice2() {
		// 문제 2
				// 길이가 10인 배열,
				// 1 ~ 10까지 역순으로 배열에서 출력하기
				int arr[] = new int[10];
				for(int i=0; i<10;i++) {
					arr[i]=10-i;
					System.out.print(arr[i]+" ");
				}
	}
	public void practice3() {
		// 사용자에게 입력받은 양의 정수만큼 배열 크기 할당
				// 1부터 입력받은 값까지 배열에 초기화 후 출력
				Scanner sc = new Scanner(System.in);
				System.out.print("양의 정수 : ");
				int input = sc.nextInt();
				
				if(input > 0) {	// 입력받은 값이 0보다 큰지 체크
					int [] arrs = new int[input];	// 입력받은 값으로 배열 크기 할당
					for(int i = 1; i <= input; i++) {
						arrs[i-1] = i;
						System.out.print(arrs[i-1] + " ");
					}
					System.out.println();
					for(int i = 0; i < input; i++) {
						arrs[i] = i+1;
						System.out.print(arrs[i] + " ");
					}
				}
	}
	public void practice4() {
		// 문제4
				// 길이가 5인 String 배열, 
				// "사과" 귤" "포도" "복숭아" "참외" 로 초기화 한 후 
				// 배열 인덱스를 활용해서 귤을 출력하세요.
				String fruits[] = {"사과", "귤", "포도", "복숭아", "참외"};
				System.out.println(fruits[1]);
				
				for(int i=0;i<fruits.length;i++) {
					if(fruits[i].equals("사과"))
						System.out.println(fruits[i]);
						break;
				}
	}
	public void practice5() {
		// 문제5 (어려움)
		// 문자열 입력받고  문자 하나하나를 배열에 넣고
		// 검색할 문자를 입력받고
		// 해당 문자가 몇개 들어가 있고 어디에 위치하는지를 구해야 됨.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.next();	//문자열 입력
		char inputs[] = new char[input.length()];	//문자 하나하나를 배열로
		for(int i=0;i<input.length();i++) {
			inputs[i]=input.charAt(i);	//charAt로 해서 문자열 하나하나를 배열로 변환...
		}
		System.out.print("문자 : ");
		char search = sc.next().charAt(0);  //sc.next는 string이므로 char을 쓰려면 charAt로 변환해서 써야한다.
											//1번재 문자를 서치. (문자가 하나므로)
		System.out.print(input+"에 "+search+"가 존재하는 위치(인덱스) : ");
		int count=0;
		for(int i=0; i<inputs.length;i++) {
			if(inputs[i]==search) {		//얘는 string이 아니라 char이므로 ==으로 비교해준다.
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.print(search+" 개수 : "+count);
	}
	public void practice6() {
		// 요일 문자배열을 만들어서
		// 0을 입력하면 월요일, 4를 입력하면 금요일이 출력되도록하고
		// 0 ~ 6 이외에 숫자를 입력하면 잘못입력하셨습니다를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		char weeks[] = {'월', '화', '수', '목', '금', '토', '일'};
		if(num>=0&&num<=6) {
			for(int i=0; i<7;i++) {
				if(num==i) {
					System.out.print(weeks[i]+"요일");
				}
			}
		}
		else System.out.println("잘못 입력하셨습니다.");
	}
	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
//		ex.
//		정수 : 5
//		배열 0번째 인덱스에 넣을 값 : 4
//		배열 1번째 인덱스에 넣을 값 : -4
//		배열 2번째 인덱스에 넣을 값 : 3
//		배열 3번째 인덱스에 넣을 값 : -3
//		배열 4번째 인덱스에 넣을 값 : 2
//		4 -4 3 -3 2
//		총 합 : 2

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int arr[] = new int[sc.nextInt()];
		int sum = 0;
		for(int i=0; i<5; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		for (int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.print("총 합 : "+sum);
	}
	public void practice8() {
//		3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
	}
	public void practice9() {
		
	}
	public void practice10() {
		// 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
				// 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
				
				Scanner sc = new Scanner(System.in);
				System.out.print("주민등록번호(-포함) : ");
				String idNum = sc.next();
				char idNums[]=new char[idNum.length()];
				for(int i = 0; i < idNums.length; i++) {
					idNums[i]=idNum.charAt(i);
				}
				char copy[]=new char[idNums.length];
				for(int i = 0; i < idNums.length;i++) {
					if(i<8) {
						copy[i]=idNums[i];
					} else {
						copy[i]='*';
					}
				}
				for (char num : copy) {
					System.out.print(num);
				}
	}
	public void practice11() {
		
	}
	public void practice12() {
		
	}

}
