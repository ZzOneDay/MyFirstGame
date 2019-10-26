import core.GameCore;
import javax.swing.*;
public class MainForm {
    JPanel getRootPanel() {
        return rootPanel;
    }

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel taskAnswer;
    private JButton update;

    private GameCore gameCore = new GameCore();

    MainForm() {
        newTask();
        update.addActionListener(e -> newTask());
    }

    private void newTask ()
    {
        gameCore.startNewGame();
        setButtonByAnswers();
        setTaskAnswer();
        setButtonsToCommand();
    }


    private void setButtonByAnswers ()
    {
        button1.setText(gameCore.answer1.toString());
        button2.setText(gameCore.answer2.toString());
        button3.setText(gameCore.answer3.toString());
        button4.setText(gameCore.answer4.toString());
    }

    private void setTaskAnswer ()
    {
        taskAnswer.setText(gameCore.taskAnswer);
    }


    private void setButtonsToCommand ()
    {
        setCheckAnswerToButton(button1);
        setCheckAnswerToButton(button2);
        setCheckAnswerToButton(button3);
        setCheckAnswerToButton(button4);
    }

    private void setCheckAnswerToButton (JButton button) {
        button.addActionListener(e -> {
            System.out.println("Нажали: " + Integer.parseInt(button.getText()));
            gameCore.checkAnswer(Integer.parseInt(button.getText()));
            newTask();
        });
    }
}
