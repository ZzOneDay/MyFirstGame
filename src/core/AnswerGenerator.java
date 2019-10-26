package core;

import java.util.HashSet;

class AnswerGenerator {
    private int taskNumber1;
    private int taskNumber2;

    private HashSet<Integer> answersList;

    private int rightAnswer;

    AnswerGenerator() {
        answersList = new HashSet<>();
    }


    void startNewTask() {
        createNewRightAnswer();
        createAnswersList();
    }

    String getTask() {
        return taskNumber1 + " x " + taskNumber2;
    }

    HashSet<Integer> getAnswersList() {
        return answersList;
    }


    Integer getRightAnswer() {
        return rightAnswer;
    }

    private void createAnswersList() {
        clearAnswersSet();
        answersList.add(rightAnswer);
        while (!(answersList.size() == 4)) {
            answersList.add(getNewAnswer());
        }
    }

    private Integer getNewAnswer() {
        int number1 = getRandomNumber();
        int number2 = getRandomNumber();
        return number1 * number2;
    }

    private void createNewRightAnswer() {
        taskNumber1 = getRandomNumber();
        taskNumber2 = getRandomNumber();
        rightAnswer = taskNumber1 * taskNumber2;
    }

    private void clearAnswersSet() {
        answersList.clear();
    }

    private Integer getRandomNumber() {
        int numberToCreateAnswer = 0;
        boolean numberHaveOneAndZero = true;
        while (numberHaveOneAndZero) {
            numberToCreateAnswer = (int) Math.ceil(10 * Math.random());
            if (numberToCreateAnswer != 1 && numberToCreateAnswer != 0) {
                numberHaveOneAndZero = false;
            }
        }
        return numberToCreateAnswer;
    }


}
