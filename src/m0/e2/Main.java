package m0.e2;

public class Main {

    public static void main(String[] args) {
        Tuple2<Long, String> stringTuple2 = new Tuple2<>(12L, "Slava");
        System.out.println(stringTuple2.getLeft() + 21L);
    }
}
