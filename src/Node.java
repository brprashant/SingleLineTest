/**
 * Created by brprashant on 9/28/15.
 */
public class Node<T> {
    Node next;
    T data;

    Node(){

    }

    Node(T data){
        this.data=data;
        this.next=null;
    }

    Node(T data, Node node){
        this.data=data;
        this.next=node;
    }


    public T getData(){
        if (data== null ) return null;
        return data;
    }

    public void setData(T value){
        data=value;
    }

    public void setNode(Node n){
        next = n;
    }

    public Node getNext(){
        if ( next == null ) return null;
        return next;
    }
}
