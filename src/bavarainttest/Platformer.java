package bavarainttest;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by brprashant on 6/16/19.
 */
public class Platformer {
    private int[] board;
    private int position;
    private boolean intialised = false;
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();



    public Platformer(int n, int position) {
        if (position >= n) {
            throw new IllegalArgumentException("position should be less than n");
        }
        board = new int[n];
        for(int i = 0 ; i< n ;i++){
            board[i] = i;
        }

        this.position = position;
        intialised = true;

    }

    public void jumpLeft() {
        readWriteLock.readLock().lock();
        for (int currPosition = position-1; currPosition > 0 ;currPosition--){
            if (board[currPosition] == currPosition) {
                for (int finalPosition = currPosition-1; finalPosition >=0; finalPosition--){
                    if (board[finalPosition] == finalPosition) {
                        board[position] = 0;
                        position = finalPosition;
                        return;
                    }
                }
            }
        }
        readWriteLock.readLock().unlock();
    }

    public void jumpRight() {
        readWriteLock.readLock().lock();

        for (int currPosition = position+1; currPosition < board.length-2 ;currPosition++){
            if (board [currPosition] == currPosition) {
                for (int finalPosition = currPosition+1; finalPosition < board.length-1; finalPosition++){
                    if (board[finalPosition] == finalPosition) {
                        board[position] = 0;
                        position = finalPosition;
                        return;
                    }
                }
            }
        }
        readWriteLock.readLock().unlock();
    }

    public int position() {
        if (intialised) {
            return position;
        } else {
            throw new IllegalStateException("intialisation not valid");
        }
    }

    public static void main(String[] args) {
        Platformer platformer = new Platformer(6, 3);
        System.out.println(platformer.position());

        platformer.jumpLeft();
        System.out.println(platformer.position());

        platformer.jumpRight();
        System.out.println(platformer.position());
    }
}
