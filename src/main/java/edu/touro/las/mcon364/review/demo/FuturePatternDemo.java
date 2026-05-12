package edu.touro.las.mcon364.review.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FuturePatternDemo {
    /**
     * Demonstrates the Future pattern by submitting tasks to an ExecutorService and retrieving results asynchronously.
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args)
            throws ExecutionException, InterruptedException {
        /**
         * choose a thread pool size that allows some concurrency but not too much — more threads than tasks is wasteful
         */
        ExecutorService pool = Executors.newFixedThreadPool(4);
        /**
         * submit several tasks that compute the squares of numbers, but do not call get() immediately — collect all futures first
         * This your collection
         */
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        /**
         * Now we will build a list of Future<Integer> objects by submitting tasks
         * to the pool.
         * Each task will compute the square of a number after sleeping for 1 second to simulate work.
         * We will collect all futures first before calling get() on any of them, to keep the work concurrent.
         */
        List<Future<Integer>> futures = numbers.stream()
                .map(n -> pool.submit(() -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.printf("[%s] computing square of %d…%n", threadName, n);
                    Thread.sleep(1000);
                    return n * n;
                }))
                .toList();

        System.out.println("All tasks submitted.");
        /**
         * Now we will call get() on each Future to retrieve the results.
         * This will block until each result is ready,
         * but since all tasks were submitted before we started calling get(), they will run concurrently.
         */
        List<Integer> results = new ArrayList<>();
        System.out.println("Getting results.");
        for(Future<Integer> future : futures) {
            Integer square = future.get();
            System.out.println("Retrieved " + square);// blocks until the result is ready
            results.add(square);
        }

        System.out.println(results);
        /**
         * Finally, we will shut down the pool to release resources.
         */
        pool.shutdown();
    }
}