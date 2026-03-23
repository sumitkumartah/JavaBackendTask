package PlayQuizGameProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class questionServiceUsingList {
   private List<Question> qs;
   private int score;

    public questionServiceUsingList() {
       qs=new ArrayList<>();
        LoadQuestions();
    }
    public void LoadQuestions(){
        qs.add(new Question(1, "What is the capital of India?", "Delhi", "Mumbai", "Kolkata", "Chennai", 1));
        qs.add(new Question(2, "Which language runs in a web browser?", "Java", "C", "Python", "JavaScript", 4));
        qs.add(new Question(3, "Who developed Java?", "Microsoft", "Sun Microsystems", "Google", "Oracle", 2));
        qs.add(new Question(4, "Which keyword is used to create an object in Java?", "class", "new", "this", "static", 2));
        qs.add(new Question(5, "What is the default value of an int variable in Java?", "0", "null", "1", "undefined", 1));
    }

    public void playQuiz(){
        Scanner sc=new Scanner(System.in);
        System.out.println("-------Quiz is starting----------");
        for(Question q:qs){
            System.out.println("Question No-> "+q.getQid()+ ":  "+q.getQuestion());
            System.out.println("1. " + q.getOp1());
            System.out.println("2. " + q.getOp2());
            System.out.println("3. " + q.getOp3());
            System.out.println("4. " + q.getOp4());

            System.out.print("Enter your ans: ");
            int userAns=sc.nextInt();
            if(userAns==q.getAns()){
                System.out.println("✅ Correct!");
                score++;
            }else{
                System.out.println("❌ Wrong! Correct answer is option: " + q.getAns());
            }
        }
    }

    public void showAns() {
        if(score < 3) {
            System.out.println("😞 Your score is too low! ");
        } else {
            System.out.println("🎉 Congratulations! You passed the quiz 🎯");
        }
        System.out.println("📊 Your total score is : " + score);
    }

}






