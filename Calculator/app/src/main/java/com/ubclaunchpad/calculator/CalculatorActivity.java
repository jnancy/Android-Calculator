package com.ubclaunchpad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener{
    private final static String TAG = CalculatorActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    /**
     * This implementation of the click listener is for the view found in res/layout/activity_calculator
     * The functions in general should grab the appropriate inputs, and if they are valid, computes the answer.
     * The answer should be displayed in a second activity labelled "AnswerActivity"
     * @param v
     */
    @Override
    public void onClick(View v) {
        Double ans;
        Integer entry1 = R.id.firstInput;
        Integer entry2 = R.id.secondInput;
        TextView result = (TextView) findViewById(R.id.Result);

        switch (v.getId())
        {
            case R.id.operation_add:
            {
                ans = Double.valueOf(entry1 + entry2);
                result.setText(String.valueOf(ans));
                break;
            }
            case R.id.operation_sub:
            {
                ans = Double.valueOf(entry1 - entry2);
                result.setText(String.valueOf(ans));
                break;
            }
            case R.id.operation_multi:
            {
                ans = Double.valueOf(entry1)*entry2;
                result.setText(String.valueOf(ans));
                break;
            }
            case R.id.operation_div:
            {
                ans = Double.valueOf(entry1)/entry2;
                result.setText(String.valueOf(ans));
                break;
            }
                //did not have time to complete the extra operations
            //sine
            case R.id.operation_extra1:{
                break;
            }
            //cosine
            case R.id.operation_extra2:{
                break;

            }
            //tangent
            case R.id.operation_extra3:{
                break;

            }
            default:
            {
                Toast.makeText(this, "Click not implemented yet", Toast.LENGTH_LONG).show();
                Log.e(TAG, "View id: " + v.getId() + " click not implemented yet");
                break;
            }
        }
    }
}
