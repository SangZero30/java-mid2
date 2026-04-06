package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        // MyArrayList<Integer> list = new MyArrayList<>(); x001 을 생성
        MyLinkedList<Integer> list = new MyLinkedList<>();
        BatchProcessor processor = new BatchProcessor(list); // x002 를
        processor.logic(1_000_000);
    }
}
