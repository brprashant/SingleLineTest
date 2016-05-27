package packageOne;

import depthOne.TestInOne;

/**
 * Created by brprashant on 4/3/16.
 */
public class TestInPackageOne {

    public static void main(String[] args){
        TestInOne obj = new TestInOne();
        System.out.println(obj.publicvalue);
    }

}
