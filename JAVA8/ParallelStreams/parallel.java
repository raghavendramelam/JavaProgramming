package JAVA8.ParallelStreams;

import java.util.Arrays;

public class parallel {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Sequential Stream
        long sequentialSum = Arrays.stream(numbers)
                .sum();

        System.out.println("Sequential Sum: " + sequentialSum + " Thread name" + Thread.currentThread());

        // Parallel Stream
        long parallelSum = Arrays.stream(numbers)
                .parallel() // Convert the stream to a parallel stream
                .sum();

        System.out.println("Parallel Sum: " + parallelSum + "Thred name" + Thread.currentThread());
    }
}
