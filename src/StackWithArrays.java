/**
 * Created by brprashant on 10/13/15.
 */
public class StackWithArrays<T> {

    public T[] stack;
    public int top;
    public int size;


    @SuppressWarnings("unchecked")
    StackWithArrays(){
        stack = (T[]) new Object[1];
        size=1;
        top =0;
    }

    public void push(T value){
        if (top == size-1) {
            resize(stack,size*2);
        }
        stack[top++] = value;
    }

    @SuppressWarnings("uncheked")
    private void resize(T[] stack, int size){

        T[] newStack = (T[]) new Object[size];
        for(int i=0;i<this.top;i++){
            newStack[i] = stack[i];
        }
        this.stack = newStack;
        this.size= size;
    }

    public T pop(){
        if (top == 0) return null;
        if (top <= size/4) resize(stack,size/2);
     return stack[--top];
    }
}
