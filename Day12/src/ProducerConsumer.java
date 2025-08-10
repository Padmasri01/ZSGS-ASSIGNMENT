/*5. Implement a basic producer-consumer problem using wait() and notify().
        --->Producer thread should add items to a shared buffer.
        --->Consumer thread should remove items.
        Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM, where you create threads to check the
        PIN, another thread to perform the cash withdrawal, another one to check the balance amount and print the receipt.*/
class Buffer {
    private final int[] buffer = new int[5];
    private int count = 0;

    public synchronized void produce(int item) throws InterruptedException {
        while (count == buffer.length) {
            wait();
        }

        buffer[count] = item;
        count++;
        System.out.println("Produced: " + item);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (count == 0) {
            wait();
        }

        int item = buffer[0];
        for (int i = 1; i < count; i++) {
            buffer[i - 1] = buffer[i];
        }
        count--;
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify producer
    }
}

public class ProducerConsumer{
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            int value = 1;
            while (true) {
                try {
                    buffer.produce(value++);
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    buffer.consume();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
