package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Scorer implements Runnable {

    private final Lock runLock = new ReentrantLock();
    private final Lock ballsLock = new ReentrantLock();

    public void IncrementBallAfterRun() {
        boolean runLockFlag = runLock.tryLock();
        if (runLockFlag) {
            boolean ballsLockFlag = ballsLock.tryLock();
            if (ballsLockFlag) {
                Runs.runs++;
                Balls.balls++;
                System.out.println(" Runs =" +Runs.runs +"Balls = " +Balls.balls);
            } else {
                runLock.unlock();
            }
        }

    }

    public void IncrementRunAfterBall() {
        boolean ballsLockFlag = ballsLock.tryLock();
        if (ballsLockFlag) {
            boolean runLockFlag = ballsLock.tryLock();
            if (runLockFlag) {
                Balls.balls++;
                Runs.runs++;
            } else {
                ballsLock.unlock();
            }
        }
    }

    public void run() {
        while (true) {
            IncrementBallAfterRun();
            IncrementRunAfterBall();
        }

    }

}
