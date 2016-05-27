import java.io.Serializable;

/**
 * Created by brprashant on 9/28/15.
 */
public class LinkedListSamples<T> {


    Node<T> head;

    LinkedListSamples(){
        head = new Node<>();
    }

    T pushLast(){
        Node<T> curr= head;
        Node<T> last = null;
        if (curr.next != null ) last = curr.next;
        if (last == null) {
            T retVal = curr.data;
            head = null;
            return retVal;
        }
        while (last.next != null ) {
            last = last.next;
            curr=curr.next;
        }
        curr.next= null ;
        return last.data;
    }

    boolean delete(Node node){
        if (node.next!= null) {
            node.data = node.next.data == null ? null : node.next.data;
            node.next = node.next.next == null ? null : node.next.next;
            return true;
        }
        return false;
    }

    void addDataAtEnd(T data){
        Node node = head;
        while (node.next !=null ){
            node = node.next;
        }
        Node<T> wrapperNode = new Node<>(data,null);

        node.next=wrapperNode;
    }

    void addDataInFirstChance(T data){
        Node node = head;
        while (node.next !=null ){
            if ( node.data == null ){
                node.data = data;
                return;
            }
            node = node.next;
        }
        Node<T> wrapperNode = new Node<>(data,null);
        node.next=wrapperNode;
    }

    void addNode(Node<T> node){
        Node<T> temp = head;
        while (temp.next !=null )
            temp = temp.next;
        temp.next = node;
    }

    void printLinkedList(){
        System.out.print("Start ->");
        Node node = head;
        while ( node!= null ){
            if (node.data != null)
                System.out.print(" " + node.data + " ->");
            node = node.next == null ? null : node.next;
        }
        System.out.print(". \n");
    }

    public static void main(String[] args){
        LinkedListSamples<Integer> llSample = new LinkedListSamples<>();
        llSample.addDataAtEnd(123);
        llSample.printLinkedList();

        Node<Integer> preMadeNode = new Node<>();
        preMadeNode.data=89326589;
        llSample.addNode(preMadeNode);

        llSample.printLinkedList();

        System.out.println(llSample.delete(preMadeNode));
        llSample.printLinkedList();

        llSample.addDataAtEnd(43656);
        llSample.printLinkedList();
        System.out.println(llSample.delete(preMadeNode));
        llSample.printLinkedList();

        llSample.addNode(new Node<>(12));
        llSample.printLinkedList();

        llSample.addNode(new Node<>(890));
        llSample.printLinkedList();


        llSample.addDataInFirstChance(123456);
        llSample.printLinkedList();

        llSample.addDataInFirstChance(123456);
        llSample.printLinkedList();

        llSample.addDataInFirstChance(123456);
        llSample.printLinkedList();

        llSample.pushLast();
        llSample.printLinkedList();;
    }
}
