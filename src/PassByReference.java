/**
 * Created by brprashant on 12/22/16.
 */
public class PassByReference {
    public static void main(String[] args){
        PassByReference obj= new PassByReference();
        obj.function();

    }


    public void function(){
        long agent=0;
        Task task = new Task();
        task.setOperation('+');
        task.setOperator1(12345);
        task.setOpertaor2(67890);
        System.out.println("Task Before modifying attempt : " + task.getOperation() + " : " + task.getOperator1() + " : " + task.getOpertaor2());
        System.out.println("Agent value before modifying attempt :" + agent);
        modifyAget(agent);
        modifyTask(task);
        System.out.println("Agent value after modifying attempt : " + agent);
        System.out.println("Task After modifying attempt : " + task.getOperation() + " : " + task.getOperator1() + " : " + task.getOpertaor2());

    }

    public void modifyAget(long agent){
        agent++;
        System.out.println("Agent value in new function " + agent);
    }
    public void modifyTask(final Task task){
        task.setOperation('-');
        task.setOperator1(2345);
        task.setOpertaor2(7890);
    }
}
