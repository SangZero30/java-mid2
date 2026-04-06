package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>();
        // 생성 시점에 T의 타입의 결정
        integerBox.set(10);
        //integerBox.set("문자1000") // Integer 타입만 허용 , 컴파일 오류
        Integer integer = integerBox.get();
        System.out.println("Integer = " + integer);
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("String = " + str);
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("Double = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();





    }
}

