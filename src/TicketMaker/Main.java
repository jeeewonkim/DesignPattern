package TicketMaker;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        try{
            Thread.sleep(50);

            thread1.interrupt();
            thread2.interrupt();
            thread3.interrupt();


        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
