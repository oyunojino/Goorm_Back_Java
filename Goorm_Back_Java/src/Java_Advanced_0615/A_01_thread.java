package Java_Advanced_0615;

class Task implements Runnable {
    @Override
    public void run() {
        // 스레드가 실행할 코드;
    }
}
public class A_01_thread {
    public static void main() {
        // 방법 1
//    Runnable task = new Task();
//    Thread thread = new Thread(task);

        // 방법 2
//    Thread thread = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            // 스레드가 실행할 코드;
//        }
//    });

        // 방법 3
        Thread thread = new Thread(() -> {
            // 스레드가 실행할 코드;
            System.out.println("HELLO");
        });

        thread.start();
    }
}
