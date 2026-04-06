package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요. (종료 0)" );
        List<Integer> integerList = new ArrayList<>();
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            integerList.add(input);
        }
        System.out.println("출력");
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i));
            if (i < integerList.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
