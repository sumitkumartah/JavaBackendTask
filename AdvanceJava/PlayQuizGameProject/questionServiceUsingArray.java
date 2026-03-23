package PlayQuizGameProject;

import java.util.Scanner;

public class questionServiceUsingArray {
    private Question qs[];
    private int score;

    questionServiceUsingArray(){
        qs=new Question[5];
        generateQuestion();
    }

    public void generateQuestion(){
        qs[0] = new Question(1, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", 2);

        qs[1] = new Question(2, "What is the largest ocean on Earth?", "Atlantic", "Indian", "Arctic", "Pacific", 4);

        qs[2] = new Question(3, "Which element has the chemical symbol 'O'?", "Gold", "Oxygen", "Silver", "Iron", 2);

        qs[3] = new Question(4, "Who painted the Mona Lisa?", "Van Gogh", "Picasso", "Da Vinci", "Michelangelo", 3);

        qs[4] = new Question(5, "Which is the smallest country in the world?", "Monaco", "Malta", "Vatican City", "San Marino", 3);

    }

    public void playQuiz(){
        Scanner sc=new Scanner(System.in);
        System.out.println("-------Quiz is starting----------");
        score=0;  //why it initilized discussed in bottom
        for(Question q: qs){
            System.out.println("Question No-> "+q.getQid()+ ":  "+q.getQuestion());
            System.out.println("1. " + q.getOp1());
            System.out.println("2. " + q.getOp2());
            System.out.println("3. " + q.getOp3());
            System.out.println("4. " + q.getOp4());

            System.out.print("Enter your ans: ");
            int ans=sc.nextInt();

            if(q.getAns()==ans){
                score++;
                System.out.println("✅ Correct!");
            }else{
                System.out.println("❌ Wrong ans! Correct answer is option: " + q.getAns());
            }
        }


    }

    public  void showResult(){
        if(score < 3) {
            System.out.println("😞 Your score is too low! ");
        } else {
            System.out.println("🎉 Congratulations! You passed the quiz 🎯");
        }
        System.out.println("📊 Your total score is : " + score);
    }
}

//Note -- Without score = 0: If you play the quiz multiple times in the same program run, the score will keep accumulating from earlier attempts.

//questionServiceUsingArray quiz = new questionServiceUsingArray();
//quiz.playQuiz();   // Suppose you get 3 correct
//quiz.showResult(); // Shows score = 3
//
//quiz.playQuiz();   // Suppose you get 2 correct
//quiz.showResult(); // Without reset, shows score = 5 (wrong!)