package core;

import java.util.ArrayList;

public class GameCore {
    private AnswerGenerator answerGenerator = new AnswerGenerator();
    private AnswerChecker answerChecker = new AnswerChecker();
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public Integer answer1 = 0;
    public Integer answer2 = 0;
    public Integer answer3 = 0;
    public Integer answer4 = 0;

    public String taskAnswer;

    public void startNewGame() {
        answerGenerator.startNewTask();
        System.out.println("answer getTask = " + answerGenerator.getTask());
        System.out.println("answer getAnswersList + " + answerGenerator.getAnswersList());
        System.out.println("answer getRightAnswer + " + answerGenerator.getRightAnswer());
        setAnswers();
        setTaskAnswer();
    }

    private void setAnswers() {
        arrayList.clear();
        arrayList.addAll(answerGenerator.getAnswersList());
        System.out.println("принт коллекции: " + arrayList);
        if (arrayList.size() == 4) {
            answer1 = arrayList.get(0);
            answer2 = arrayList.get(1);
            answer3 = arrayList.get(2);
            answer4 = arrayList.get(3);
        } else {
            System.out.println("Превышено количество ответов");
        }

    }

    private void setTaskAnswer() {
        taskAnswer = answerGenerator.getTask();
    }

    public void checkAnswer(Integer answer) {
        boolean answerOk = answerChecker.checkAnswer(answer, answerGenerator.getRightAnswer());
        if (answerOk) {
            System.out.println("\tответ ПРАВИЛЬНЫЙ");
        } else
            System.out.println("\tответ НЕ ПРАВИЛЬНЫЙ");
    }
}
