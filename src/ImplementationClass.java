/**
 * Created by brprashant on 3/15/16.
 */
public class ImplementationClass extends SampleClass {

    ImplementationClass(){
        super(1);
    }

    static int firstVale;
    static int secondValue;

    @Override
    public void operation() {
        addTwoNumbers(firstVale,secondValue);
    }
}
