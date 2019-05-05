import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){

        IntStream.of(1,2,3,4,5,6,7).filter(value -> value > 3).forEach(System.out::println);

    }
}
