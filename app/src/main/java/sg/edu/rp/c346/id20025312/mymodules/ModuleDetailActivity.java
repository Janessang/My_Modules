package sg.edu.rp.c346.id20025312.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvAnswer;
    TextView tvAnswer1;
    TextView tvAnswer2;
    TextView tvAnswer3;
    TextView tvAnswer4;
    TextView tvAnswer5;
    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvAnswer = findViewById(R.id.tvModuleCode);
        tvAnswer1 = findViewById(R.id.tvModuleName);
        tvAnswer2 = findViewById(R.id.tvAcademicYear);
        tvAnswer3 = findViewById(R.id.tvSemester);
        tvAnswer4 = findViewById(R.id.tvModuleCredit);
        tvAnswer5 = findViewById(R.id.tvVenue);
        btnReturn = findViewById(R.id.buttonReturn);

        Intent intentReceived = getIntent();
        String value = intentReceived.getStringExtra("Details");
        String value1 = intentReceived.getStringExtra("Details1");
        String value2 = intentReceived.getStringExtra("Details2");
        String value3 = intentReceived.getStringExtra("Details3");
        String value4 = intentReceived.getStringExtra("Details4");
        String value5 = intentReceived.getStringExtra("Details5");
        String checkFor = intentReceived.getStringExtra("Check");

        if (checkFor.equalsIgnoreCase("c346")) {
            tvAnswer.setText(value + "C346");
            tvAnswer1.setText(value1 + "Mobile App Development");
            tvAnswer2.setText(value2 + "2020");
            tvAnswer3.setText(value3 + "1");
            tvAnswer4.setText(value4 + "4");
            tvAnswer5.setText(value5 + "E62E");

        } else if (checkFor.equalsIgnoreCase("c228")) {
            tvAnswer.setText(value + "C228");
            tvAnswer1.setText(value1 + "Operating System Security");
            tvAnswer2.setText(value2 + "2020");
            tvAnswer3.setText(value3 + "1");
            tvAnswer4.setText(value4 + "4");
            tvAnswer5.setText(value5 + "E62L");

        } else if (checkFor.equalsIgnoreCase("c328")) {
            tvAnswer.setText(value + "C328");
            tvAnswer1.setText(value1 + "Intelligent Network");
            tvAnswer2.setText(value2 + "2020");
            tvAnswer3.setText(value3 + "1");
            tvAnswer4.setText(value4 + "4");
            tvAnswer5.setText(value5 + "E62C");

        } else if (checkFor.equalsIgnoreCase("c331")) {
            tvAnswer.setText(value + "C331");
            tvAnswer1.setText(value1 + "Digital Security and Forensics");
            tvAnswer2.setText(value2 + "2020");
            tvAnswer3.setText(value3 + "1");
            tvAnswer4.setText(value4 + "4");
            tvAnswer5.setText(value5 + "E61J");

        } else if (checkFor.equalsIgnoreCase("c203")) {
            tvAnswer.setText(value + "C203");
            tvAnswer1.setText(value1 + "Web AppIn Development in php");
            tvAnswer2.setText(value2 + "2020");
            tvAnswer3.setText(value3 + "1");
            tvAnswer4.setText(value4 + "4");
            tvAnswer5.setText(value5 + "W67L");
        }

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });


    }
}