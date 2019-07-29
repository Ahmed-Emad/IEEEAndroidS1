package ahmed.barakat.ieeeandroids1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText birthYearET;
    TextView ageTV;
    Button calculateBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        initCalculateClick();
    }

    void initViews() {
        birthYearET = findViewById(R.id.et_birthyear);
        ageTV = findViewById(R.id.tv_age);
        calculateBTN = findViewById(R.id.btn_calculate);
    }

    private void initCalculateClick() {
        calculateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCalculateClick();
            }
        });
    }

    private void onCalculateClick() {
        String birthYearString = birthYearET.getText().toString();

        Integer birthYearValue = Integer.valueOf(birthYearString);
        Integer age = 2019 - birthYearValue;

        ageTV.setText("Your age is " + age.toString() + " years");
    }

}
