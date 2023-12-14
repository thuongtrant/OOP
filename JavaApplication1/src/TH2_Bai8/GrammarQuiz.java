/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2_Bai8;

/**
 *
 * @author ttthu
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Question {
    String content;
    List<String> options;
    List<Integer> correctOptions;

    public Question(String content, List<String> options, List<Integer> correctOptions) {
        this.content = content;
        this.options = options;
        this.correctOptions = correctOptions;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(content).append("\n");
        for (String option : options) {
            sb.append(option).append("\n");
        }
        return sb.toString();
    }
}

public class GrammarQuiz {

    private static final String QUESTION_FOLDER = "CauHoi/";

    public static void main(String[] args) {
        // Sample questions
        try (Scanner scanner = new Scanner(System.in)) {
            // Sample questions
            List<Question> questions = new ArrayList<>();
            questions.add(new Question("Take care …, Ann", Arrays.asList("you", "your", "yours", "yourself"), Arrays.asList(3)));
            
            // Training
            train(questions);
            
            // Quiz
            System.out.print("Enter the number of questions you want to practice: ");
            int numberOfQuestions = scanner.nextInt();
            List<Question> selectedQuestions = selectRandomQuestions(questions, numberOfQuestions);
            
            for (Question question : selectedQuestions) {
                System.out.println(question);
                System.out.print("Your answer (A, B, C, D): ");
                String userAnswer = scanner.next().toUpperCase();
                boolean isCorrect = checkAnswer(question, userAnswer);
                if (!isCorrect) {
                    System.out.println("Incorrect! The correct answer is: " + getCorrectAnswer(question));
                    break;
                }
            }
        }
    }

    private static void train(List<Question> questions) {
        // Add new questions to the list and save to files
        for (int i = 0; i < 5; i++) {
            String uuid = UUID.randomUUID().toString();
            List<String> options = Arrays.asList("Option A", "Option B", "Option C", "Option D");
            List<Integer> correctOptions = Arrays.asList(1);

            Question newQuestion = new Question("Sample question " + i, options, correctOptions);
            questions.add(newQuestion);

            saveQuestionToFile(newQuestion, uuid);
        }
    }

    private static List<Question> selectRandomQuestions(List<Question> questions, int numberOfQuestions) {
        List<Question> selectedQuestions = new ArrayList<>();
        Collections.shuffle(questions);

        for (int i = 0; i < numberOfQuestions && i < questions.size(); i++) {
            selectedQuestions.add(questions.get(i));
        }

        return selectedQuestions;
    }

    private static void saveQuestionToFile(Question question, String uuid) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(QUESTION_FOLDER + uuid + ".txt"))) {
            writer.write(question.content);
            writer.newLine();
            for (String option : question.options) {
                writer.write(option);
                writer.newLine();
            }
            writer.write(getCorrectAnswer(question));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkAnswer(Question question, String userAnswer) {
        int userOption = userAnswer.charAt(0) - 'A' + 1;
        return question.correctOptions.contains(userOption);
    }

    private static String getCorrectAnswer(Question question) {
        StringBuilder sb = new StringBuilder();
        for (int correctOption : question.correctOptions) {
            char optionChar = (char) ('A' + correctOption - 1);
            sb.append(optionChar).append(" ");
        }
        return sb.toString().trim();
    }
}

