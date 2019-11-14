package bavarainttest;

import java.util.ArrayList;

/**
 * Created by brprashant on 6/16/19.
 */
public class Sol {
    private ArrayList<Integer> data;

    public Sol(ArrayList<Integer> data) {
        this.data = new ArrayList<>();
        for (Integer integer : data) {
            this.data.add(integer);
        }
    }

    public ArrayList<Integer> restore() {
        return this.data;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Sol snap = new Sol(list);
        list.set(0, 3);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
        list.add(4);
        list = snap.restore();
        System.out.println(list); //It should log "[1,2]"
    }
}
