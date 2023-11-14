package base_java.miniproject_calculator;
/*
 * project : 사칙연산 계산기 만들기
 * 구현 내용
 * 메뉴 만들기
 * 메뉴 출력
 * 사용자 입력(선택) 메뉴 실행
 * 연산 기능
 * 유효성 검사(숫자가 아닌값 입력시 처리)
 */

/*
 * 출력
 * 메뉴를 선택하세요.
 * 1. 더하기
 * 2. 빼기
 * 3. 곱하기
 * 4. 나누기
 * 0. 끝내기
 * 첫번째 숫자, 두번째 숫자 입력
 */

import java.util.Scanner;

public class MyCalculator {
    private static void showMenu() {
        System.out.println("메뉴를 선택하세요.");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        System.out.println("0. 종료");
    }

    private static void add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    private static void sub(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    private static void mul(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    private static void div(int num1, int num2) {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) + "..." + (num1 % num2));
    }

    private static boolean checkMenu(String inputMenu) {
        if (inputMenu.length() > 1) {
            return false;
        } else {
            char menu = inputMenu.charAt(0);
            if ('0' <= menu && menu <= '9') {
                return true;
            } else {
                return false;
            }
        }
    }

    private static boolean valueCheck(String input) {
        boolean value = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ('0' < c && c < '9') {
                value = true;
            } else {
                value = false;
                break;
            }
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();

            System.out.print("메뉴 : ");
            String inputMenu = sc.nextLine();

            if (!checkMenu(inputMenu)) {
                System.out.println("입력값이 잘못되었습니다.\n메뉴룰 다시 선택해주세요");
                continue;
            }

            int selectMenu = inputMenu.charAt(0) - '0';

            if (selectMenu == 0) {
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
            } else if (selectMenu > 4) {
                System.out.println("입력값이 잘못되었습니다.\n메뉴룰 다시 선택해주세요");
            }

            while (true) {
                boolean isValue = false;
                System.out.print("첫 번째 숫자: ");
                String input1 = sc.nextLine();

                System.out.print("두 번째 숫자: ");
                String input2 = sc.nextLine();

                if (valueCheck(input1) && valueCheck(input2)) {
                    isValue = true;
                }

                if (isValue) {
                    int num1 = Integer.parseInt(input1);
                    int num2 = Integer.parseInt(input2);

                    if (selectMenu == 1) {
                        add(num1, num2);
                    } else if (selectMenu == 2) {
                        sub(num1, num2);
                    } else if (selectMenu == 3) {
                        mul(num1, num2);
                    } else if (selectMenu == 4) {
                        div(num1, num2);
                    }
                    break;
                } else {
                    System.out.println("입력값이 잘못되었습니다.\n다시 입력해주세요.");
                }
            }
        }
    }
}
