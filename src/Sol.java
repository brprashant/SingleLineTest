import com.google.common.base.Preconditions;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by brprashant on 5/31/16.
 */
public class Sol implements Cloneable, Serializable{

    public static void main(String[] args){

        try {
            Human h1 = new Human("sam");
            Human h2= h1.clone();

            System.out.println(h1.name);
            System.out.println(h2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        HashMap<Integer,Integer> symtab=new HashMap<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        LinkedList<Integer> ll= new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        TreeSet<Integer> ts=new TreeSet<>(); // sorted
        HashSet<Integer> hs = new HashSet<>(); //

        Stack<Integer> st=new Stack<>();
        PriorityQueue integerPQueue = new PriorityQueue();
        System.out.println("integer pq size " + integerPQueue.size());
        integerPQueue.add(245);
        System.out.println("integer pq size " + integerPQueue.size());

        int n=10;
        int[] somearr=new int[n];
        System.out.println(somearr.length);
        String text="sgsft";
        System.out.println(text.length());
        System.out.println(text.toCharArray());
        char[] characters=text.toCharArray();
        System.out.println(characters.length);


        PriorityQueue<String> pqst = new PriorityQueue<>(10,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }

        });

//        throw new IllegalStateException();


        pqst.add("abcd");
        pqst.add("efgh");
        pqst.add("abcd");
        pqst.add("efgh");
        System.out.println(pqst.size());
        System.out.println(pqst.poll());
        System.out.println(pqst.poll());
        System.out.println(pqst.size());
        pqst.add("abcdefgh");
        System.out.println(pqst.size());
        System.out.println(pqst.poll());



        //BigInteger bigInteger = BigInteger.valueOf(234L);
        //System.out.print(bigInteger);



    }

    public static class LinkedListNode{
        int val;
        LinkedListNode next;

        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    };

    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val){
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        }
        else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }



    static LinkedListNode removeNodes(LinkedListNode list, int x) {
        LinkedListNode head = list;
        while (head.val > x) {
            if (head.next == null) return null;
            else head=head.next;
        }
        LinkedListNode node = head;
        LinkedListNode nextNode = head.next;
        if (nextNode == null) return head;
        while(nextNode!=null){
            if (nextNode.val > x) {
                node.next = nextNode.next;
            }
            node=node.next;
            nextNode=node.next;
        }
        if (node.val>x){
            removeLast(node);
        }
        return head;
    }

    private static HashMap<Character,Set<String>> keypad = new HashMap<>();
    private static SortedSet<String> dictionary = new TreeSet<>();

    public Sol(){
        keypad.put('a',new HashSet<String>());
    }


    static void removeLast(LinkedListNode list){}

    public List<String> getWords(int[] input) {
        Preconditions.checkNotNull(input);
        int len=input.length;
        List<String> words = null;
        for (int anInput : input) {
            Set<String> charsToAdd = keypad.get(anInput);
            if (charsToAdd == null) {
                continue;
            }
            if (charsToAdd.size() < 1) {
                continue;
            }
            List<String> newWords = new ArrayList<String>();
            for (String word : words) {
                for (String add : charsToAdd) {
                    String newWord = word + add;
                    if (dictionary.contains(newWord)) {
                        newWords.add(newWord);
                    }
                }
            }
            words = newWords;
        }
        return words;
    }


    public void function(){
        int[] a=new int[3];
        System.out.println(a[3]);

    }



}
