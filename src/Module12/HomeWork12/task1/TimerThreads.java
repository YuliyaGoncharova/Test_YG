package Module12.HomeWork12.task1;

public class TimerThreads {

    public static void main(String[] args) {
        Thread threadWhole = new Thread(new TimeFromStart());
        Thread threadFive = new Thread(new FiveSecondsThread());
        threadWhole.start();
        threadFive.start();
    }


}

  class TimeFromStart implements Runnable{

    @Override
    public void run() {

        long startTime = System.currentTimeMillis();
        long passedTime;
        int counter = 1;
        while (true) {
            passedTime = System.currentTimeMillis() - startTime;
            System.out.println("Від старту програми минуло (c): " + passedTime/1000);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class FiveSecondsThread implements Runnable {

    @Override
    public void run() {

        while (true) {try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            System.out.println("Минуло 5 секунд");}

    }
}
