/**
 * Created by brprashant on 7/24/15.
 */
public class One {

    enum JavaQuestions{

        QUESTION_1("Ask some question here",2),
        QUESTION_2("Ask another question here",3),
        QUESTION_3("Ask third question here",3),
        QUESTION_4("Ask last here",1);

        private String questionText;
        private int answer;

        JavaQuestions(String question, int answer){
            this.questionText = question;
            this.answer = answer;
        }

        public String getQuestionText(){return questionText;}
        public int getAnswer(){return answer;}

    }

    public static void main(String[] args){
        System.out.println(JavaQuestions.QUESTION_1);
        System.out.println(JavaQuestions.QUESTION_1.getQuestionText());
        System.out.println(JavaQuestions.QUESTION_1.getAnswer());
    }

}
