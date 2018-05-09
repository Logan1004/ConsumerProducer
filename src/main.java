import java.io.IOException;

public class main {
    public static void main(String[] args) {
        Storage person = new Storage();
        while(true) {
            new Thread(new Consumer(person,"Consumer1")).start();
            new Thread(new Consumer(person,"Consumer2")).start();
            //new Thread(new Consumer(person,"Consumer3")).start();

            //new Thread(new Producer(person,"Producer1")).start();
            new Thread(new Producer(person,"Producer2")).start();
            new Thread(new Producer(person,"Producer3")).start();

        }

    }
}
