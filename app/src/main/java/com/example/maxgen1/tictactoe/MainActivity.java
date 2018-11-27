package com.example.maxgen1.tictactoe;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Define all UI components
    Button btn1,btn2,btn3;
    Button btn4,btn5,btn6;
    Button btn7,btn8,btn9;

    //turn=0 i.e player 1's turn
    //turn=1 i.e player 2's turn
    int turn=0;


    String msg="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewByIds();

        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        btn6.setOnClickListener(MainActivity.this);
        btn7.setOnClickListener(MainActivity.this);
        btn8.setOnClickListener(MainActivity.this);
        btn9.setOnClickListener(MainActivity.this);

        gameReset();

    }

    private void findViewByIds() {

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.btn1)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn1.setText("X");
            else
                btn1.setText("0");

            //to prevent button from reclicking
            btn1.setEnabled(false);

            //if btn at 1-2-3 is having text "X"
            if(btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-2-3 is having text "0"
            if(btn1.getText().toString().equals("0") && btn2.getText().toString().equals("0") && btn3.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 1-4-7 is having text "X"
            if(btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-4-7 is having text "0"
            if(btn1.getText().toString().equals("0") && btn4.getText().toString().equals("0") && btn7.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 1-5-9 is having text "X"
            if(btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-5-9 is having text "0"
            if(btn1.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
        }

        if(v.getId()==R.id.btn2)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn2.setText("X");
            else
                btn2.setText("0");

            //to prevent button from reclicking
            btn2.setEnabled(false);

            //if btn at 1-2-3 is having text "X"
            if(btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-2-3 is having text "0"
            if(btn1.getText().toString().equals("0") && btn2.getText().toString().equals("0") && btn3.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 2-5-8 is having text "X"
            if(btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 2-5-8 is having text "0"
            if(btn2.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn8.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
        }

        if(v.getId()==R.id.btn3)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn3.setText("X");
            else
                btn3.setText("0");

            //to prevent button from reclicking
            btn3.setEnabled(false);

            //if btn at 1-2-3 is having text "X"
            if(btn1.getText().toString().equals("X") && btn2.getText().toString().equals("X") && btn3.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-2-3 is having text "0"
            if(btn1.getText().toString().equals("0") && btn2.getText().toString().equals("0") && btn3.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 3-6-9 is having text "X"
            if(btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 3-6-9 is having text "0"
            if(btn3.getText().toString().equals("0") && btn6.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 3-5-7 is having text "X"
            if(btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 3-5-7 is having text "0"
            if(btn3.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn7.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
        }


        if(v.getId()==R.id.btn4)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn4.setText("X");
            else
                btn4.setText("0");

            //to prevent button from reclicking
            btn4.setEnabled(false);

            //if btn at 4-5-6 is having text "X"
            if(btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 4-5-6 is having text "0"
            if(btn4.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn6.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 1-4-7 is having text "X"
            if(btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-4-7 is having text "0"
            if(btn1.getText().toString().equals("0") && btn4.getText().toString().equals("0") && btn7.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
        }

        if(v.getId()==R.id.btn5)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn5.setText("X");
            else
                btn5.setText("0");

            //to prevent button from reclicking
            btn5.setEnabled(false);

            //if btn at 2-5-8 is having text "X"
            if(btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 2-5-8 is having text "0"
            if(btn2.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn8.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 4-5-6 is having text "X"
            if(btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 4-5-6 is having text "0"
            if(btn4.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn6.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 1-5-9 is having text "X"
            if(btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-5-9 is having text "0"
            if(btn1.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 3-5-7 is having text "X"
            if(btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 3-5-7 is having text "0"
            if(btn3.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn7.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 4-5-6 is having text "X"
            if(btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 4-5-6 is having text "0"
            if(btn4.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn6.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }

        }

        if(v.getId()==R.id.btn6)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn6.setText("X");
            else
                btn6.setText("0");

            //to prevent button from reclicking
            btn6.setEnabled(false);

            //if btn at 4-5-6 is having text "X"
            if(btn4.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn6.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 4-5-6 is having text "0"
            if(btn4.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn6.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 3-6-9 is having text "X"
            if(btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 3-6-9 is having text "0"
            if(btn3.getText().toString().equals("0") && btn6.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }

        }

        if(v.getId()==R.id.btn7)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn7.setText("X");
            else
                btn7.setText("0");

            //to prevent button from reclicking
            btn7.setEnabled(false);

            //if btn at 1-4-7 is having text "X"
            if(btn1.getText().toString().equals("X") && btn4.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-4-7 is having text "0"
            if(btn1.getText().toString().equals("0") && btn4.getText().toString().equals("0") && btn7.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 7-8-9 is having text "X"
            if(btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 7-8-9 is having text "0"
            if(btn7.getText().toString().equals("0") && btn8.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 3-5-7 is having text "X"
            if(btn3.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn7.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 3-5-7 is having text "0"
            if(btn3.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn7.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
        }

        if(v.getId()==R.id.btn8)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn8.setText("X");
            else
                btn8.setText("0");

            //to prevent button from reclicking
            btn8.setEnabled(false);

            //if btn at 2-5-8 is having text "X"
            if(btn2.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn8.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 2-5-8 is having text "0"
            if(btn2.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn8.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 7-8-9 is having text "X"
            if(btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 7-8-9 is having text "0"
            if(btn7.getText().toString().equals("0") && btn8.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
        }

        if(v.getId()==R.id.btn9)
        {
            //Set text on button based on turn wheteher it is pressed by player 1 or 2
            if(turn%2==0)
                btn9.setText("X");
            else
                btn9.setText("0");

            //to prevent button from reclicking
            btn9.setEnabled(false);

            //if btn at 1-5-9 is having text "X"
            if(btn1.getText().toString().equals("X") && btn5.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 1-5-9 is having text "0"
            if(btn1.getText().toString().equals("0") && btn5.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 7-8-9 is having text "X"
            if(btn7.getText().toString().equals("X") && btn8.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 7-8-9 is having text "0"
            if(btn7.getText().toString().equals("0") && btn8.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
            //if btn at 3-6-9 is having text "X"
            if(btn3.getText().toString().equals("X") && btn6.getText().toString().equals("X") && btn9.getText().toString().equals("X"))
            {
                msg="Player 1 won";
                showDialog(msg);
            }
            //if btn at 3-6-9 is having text "0"
            if(btn3.getText().toString().equals("0") && btn6.getText().toString().equals("0") && btn9.getText().toString().equals("0"))
            {
                msg="Player 2 won";
                showDialog(msg);
            }
        }

        //Increase number of turn by 1
        turn++;
    }

    private void showDialog(String msg) {

        final Dialog dialog=new Dialog(MainActivity.this,R.style.ThemeOverlay_AppCompat);

        LayoutInflater layoutInflater=getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.dialog_box,null);

        dialog.setContentView(view);
        dialog.setCancelable(true);

        Button btnYes=view.findViewById(R.id.btn_ok);
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameReset();
                dialog.dismiss();
            }
        });

        Button btnNo=view.findViewById(R.id.btn_cancel);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                finish();
            }
        });

        TextView tv_msg=view.findViewById(R.id.tv_msg);
        tv_msg.setText(msg);
        dialog.show();
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
    }

    private void gameReset() {

        //enabled all button
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");


        //reset turns
        turn=0;

    }

}
