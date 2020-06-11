package ch.hslu.ad.sw07.n1.addition;

public class AdditionTaskDemo {
     public static void main(String[] args) {
        AdditionTask task1 = new AdditionTask(1, 1000000000);
        AdditionTask task2 = new AdditionTask(6, 1000000000);
        AdditionTask task3 = new AdditionTask(50, 1000000000);
        AdditionTask task4 = new AdditionTask(10, 1000000000);
        final Thread[] threads = new Thread[4];
        threads[0] = new Thread(task1, "Thread 1");
        threads[1] = new Thread(task2, "Thread 2");
        threads[2] = new Thread(task3, "Thread 3");
        threads[3] = new Thread(task4, "Thread 4");

        for(Thread thread: threads){
            thread.start();
        }
         try{
             Thread.sleep(500);
         }catch (Exception e){}

         task1.stopRequest();
         task2.stopRequest();
         task3.stopRequest();
         task4.stopRequest();

    }
}
