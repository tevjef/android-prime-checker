
package com.deadpixel.primecheck;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText num_input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        num_input = (EditText) findViewById(R.id.num_input);
        num_input.setHint(getString(R.string.text1));

    }

        public void click(View view) {


        if (!num_input.getText().toString().matches("")) {


            Integer num = Integer.parseInt(num_input.getText().toString());

            TextView true_text = (TextView) findViewById (R.id.true_text);
            TextView false_text = (TextView) findViewById (R.id.false_text);

            double i;
            boolean isPrime = true;

            if (num < 2)
                isPrime = false;
            else
                for (i = 2; i <= Math.sqrt((double) num); ++i) {
                    if (num % i == 0.0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                true_text.setVisibility(View.VISIBLE);
                false_text.setVisibility(View.GONE);
            }
            else {
                true_text.setVisibility(View.GONE);
                false_text.setVisibility(View.VISIBLE);
            }
        } else {
            Toast.makeText(this, "You did not enter a number", Toast.LENGTH_SHORT).show();
        }
    }
    }
