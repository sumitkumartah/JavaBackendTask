package PlayQuizGameProject;

public class Main {
    public static void main(String[] args) {

        //QuestionServiceUsingList here use list to generate object of question class
        questionServiceUsingList qs=new questionServiceUsingList();
        qs.playQuiz();
        System.out.println();
        System.out.println("🎉 Your Feedback 📝");
        qs.showAns();

    }
}
