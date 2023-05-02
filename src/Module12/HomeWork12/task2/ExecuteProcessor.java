package Module12.HomeWork12.task2;

import java.util.concurrent.atomic.AtomicBoolean;

public class ExecuteProcessor extends Thread {
    private int number;
    AtomicBoolean isProcessed = new AtomicBoolean(true);

    NumberProcessor processor;

    public AtomicBoolean getIsProcessed() {
        return isProcessed;
    }

    public ExecuteProcessor(NumberProcessor processor) {
        this.processor = processor;
    }

    public void process(int a) {
        this.number = a;
        isProcessed.set(false);


    }

    @Override
    public void run() {

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (isProcessed.get() ) {
                continue;
            }

            processor.process(number);
            isProcessed.set(true);
        }

    }
}
