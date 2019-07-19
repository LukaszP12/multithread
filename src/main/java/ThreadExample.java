import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {

    public static void main(String args[]){

      /*  Thread t1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 999; i++){
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 999; i++){
                    System.out.println(Thread.currentThread().getName()+ " " + i);
                }
            }
        });

        t1.setPriority(1);
        t2.setPriority(10);
        t1.setName("t1");
        t2.setName("t2");
        t1.run();
        t2.run();

        //t1.run(); // run uruchamia zadanie w wątku głównym
        //t1.start(); // uruchamia run() w osobnymm wątku   */

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(()-> numberns());
        executorService.submit(()-> numberns());
        numberns();

    }

    private static void numberns() {
        for (int i = 0; i < 999; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
