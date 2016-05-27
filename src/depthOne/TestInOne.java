package depthOne;

/**
 * Created by brprashant on 4/3/16.
 */
public class TestInOne implements  FunctionMagic {

    static int staticNovalue =2;
    protected static int protectedStaticValue =24;
    private static int privateStaticValue =24;

    private int privateValue=24;
    protected int protectedValue=24;
    int novalue = 20;
    public int publicvalue=0;

    @Override
    public void doSomething() {
        System.out.println("Sheep");
    }
}
