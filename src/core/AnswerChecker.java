package core;

class AnswerChecker
{
    boolean checkAnswer(Integer userAnswer, Integer rightAnswer)
    {
        boolean userRight = false;
        if (userAnswer.equals(rightAnswer))
        {
            userRight = true;

        }
        return userRight;
    }
}
