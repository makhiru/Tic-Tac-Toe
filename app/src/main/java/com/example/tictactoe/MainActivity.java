package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String b1, b2, b3, b4, b5, b6, b7, b8, b9, btnre;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int flag = 0;
    int count;
    TextView txtwin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        init();

    }

    private void init() {

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.byn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        txtwin = findViewById(R.id.txtwin);


    }

    public void check(View view) {
        Button btncurrent = (Button) view;

        if (btncurrent.getText().toString().equals("")) {

            count++;

            if (flag == 0) {
                btncurrent.setText("x");
                flag = 1;
            } else {
                btncurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {

                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    txtwin.setText("Winner is : " + b1);
                    restart();
                    dissble();

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    txtwin.setText("Winner is : " + b4);
                    restart();
                    dissble();

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    txtwin.setText("Winner is : " + b7);
                    restart();
                    dissble();

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    txtwin.setText("Winner is : " + b1);
                    restart();
                    dissble();

                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    txtwin.setText("Winner is : " + b2);
                    restart();
                    dissble();

                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    txtwin.setText("Winner is : " + b3);
                    restart();
                    dissble();

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    txtwin.setText("Winner is : " + b1);
                    restart();
                    dissble();

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    txtwin.setText("Winner is : " + b3);
                    restart();
                    dissble();

                } else if (!b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")) {
                    txtwin.setText("Game is Draw !");
                    restart();

                }

            }


        }
    }

    public void dissble() {
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        btn5.setClickable(false);
        btn6.setClickable(false);
        btn7.setClickable(false);
        btn8.setClickable(false);
        btn9.setClickable(false);
    }


    public void restart() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                btn1.setClickable(true);
                btn2.setClickable(true);
                btn3.setClickable(true);
                btn4.setClickable(true);
                btn5.setClickable(true);
                btn6.setClickable(true);
                btn7.setClickable(true);
                btn8.setClickable(true);
                btn9.setClickable(true);
                count = 0;
                flag = 0;
            }
        }, 2000);

    }

}