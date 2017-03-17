/**
 * Created by brprashant on 5/31/16.
 */
public class Human implements Cloneable{
    String name;
    Human(String name){
        this.name=name;
    }


    protected Human clone() throws CloneNotSupportedException {
        return (Human) super.clone();
    }

}
