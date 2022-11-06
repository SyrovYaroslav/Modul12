package task2withExicutor;

import java.util.concurrent.BlockingQueue;

public interface MyProducer extends Runnable{
    void setN(int n, BlockingQueue<String> queue);
    boolean isUpdated();
}
