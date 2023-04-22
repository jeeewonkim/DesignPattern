package TicketMaker;

public class Task implements Runnable {

    @Override
    public void run() {
        int count = 0;
        try {
            TicketMaker ticketMaker = TicketMaker.getInstance();
            System.out.println("ThreadStarted");

            while (true) {
                count++;
                System.out.println(ticketMaker.getNextTicketNumber());
                Thread.sleep(5);

            }

        }catch (InterruptedException e){
            System.out.println("Thread interrupted, " + count );
        }

    }
}
