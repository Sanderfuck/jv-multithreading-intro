package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();

        Runnable runnable = new MyRunnable();
        Thread myRunnable = new Thread(runnable);
        myRunnable.setDaemon(true);
        myRunnable.start();
    }
}
