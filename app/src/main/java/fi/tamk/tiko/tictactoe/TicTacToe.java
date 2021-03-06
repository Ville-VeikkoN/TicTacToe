package fi.tamk.tiko.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class TicTacToe extends AppCompatActivity {
    Button button01;
    Button button02;
    Button button03;
    Button button04;
    Button button05;
    Button button06;
    Button button07;
    Button button08;
    Button button09;
    ArrayList<Button> buttons;
    int[][] gameBoard;
    boolean xTurn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
        Debug.loadDebug(this);
        button01 = findViewById(R.id.button01);
        button02 = findViewById(R.id.button02);
        button03 = findViewById(R.id.button03);
        button04 = findViewById(R.id.button04);
        button05 = findViewById(R.id.button05);
        button06 = findViewById(R.id.button06);
        button07 = findViewById(R.id.button07);
        button08 = findViewById(R.id.button08);
        button09 = findViewById(R.id.button09);
        buttons = new ArrayList<>();
        buttons.add(button01);
        buttons.add(button02);
        buttons.add(button03);
        buttons.add(button04);
        buttons.add(button05);
        buttons.add(button06);
        buttons.add(button07);
        buttons.add(button08);
        buttons.add(button09);
        gameBoard = new int[3][3];
        xTurn = true;

    }

    public void clicked(View view) {
        Debug.print("MyTag", "Button clicked", 1);
        for(Button button : buttons) {
            if(button.getId() == view.getId()) {
                button.setEnabled(false);
                if(xTurn) {
                    button.setBackgroundColor(view.getResources().getColor(R.color.colorAccent));
                } else {
                    button.setBackgroundColor(view.getResources().getColor(R.color.colorPrimaryDark));
                }
                String rowCol = (String) button.getText();
                String row = ""+rowCol.charAt(0);
                String col = ""+rowCol.charAt(1);
                Debug.print("MyTag", "row "+Integer.parseInt(row)+"col"+Integer.parseInt(col),1);
                gameBoard[Integer.parseInt(row)][Integer.parseInt(col)] = 1;
                xTurn = !xTurn;
            }
        }
    }
}
