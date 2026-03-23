# Console Quiz Application

A streamlined Java application using Object-Oriented Programming (OOP) to deliver a multiple-choice quiz experience.

## 🏗️ Class Responsibilities

| Class | Role | Responsibility |
| :--- | :--- | :--- |
| **Main** | **The Driver** | Creates an instance of `QuestionService` and calls the start method. |
| **QuestionService** | **The Engine** | Contains the hardcoded question data, manages the quiz loop, handles user input, and tracks the score. |
| **Question** | **The Model** | A blueprint that defines what a "Question" is (ID, text, options, and the correct answer index). |

## 🚀 Execution Flow
1. **Initialize:** `Main` starts the app.
2. **Setup:** `QuestionService` constructor initializes the hardcoded questions into an array.
3. **Loop:** The `playQuiz()` method iterates through each question object.
4. **Input:** The system captures user choice and compares it with the `correct Answer`.
5. **Result:** Once the loop ends, the total score is revealed.