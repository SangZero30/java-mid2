package generic.test;


import java.awt.*;

public class ContainerMain {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        System.out.println("빈값 확인 : " + stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println("저장 데이터 : " + stringContainer.getItem());
        System.out.println("빈값 확인 : " + stringContainer.isEmpty());

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("저장 데이터 : " + integerContainer.getItem());
    }
}
