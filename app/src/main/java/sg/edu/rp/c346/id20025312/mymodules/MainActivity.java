package sg.edu.rp.c346.id20025312.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvc346;
    TextView tvc228;
    TextView tvc328;
    TextView tvc331;
    TextView tvc203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvc346 = findViewById(R.id.textViewC346);
        tvc228 = findViewById(R.id.textViewC228);
        tvc328 = findViewById(R.id.textViewC328);
        tvc331 = findViewById(R.id.textViewC331);
        tvc203 = findViewById(R.id.textViewC203);

        tvc346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Check", "c346");
                intent.putExtra("Details", "Module Code: ");
                intent.putExtra("Details1", "Module Name: ");
                intent.putExtra("Details2", "Academic Year: ");
                intent.putExtra("Details3", "Semester: ");
                intent.putExtra("Details4", "Module Credit: ");
                intent.putExtra("Details5", "Venue: ");
                startActivity(intent);
            }
        });

        tvc228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Check", "c228");
                intent.putExtra("Details", "Module Code: ");
                intent.putExtra("Details1", "Module Name: ");
                intent.putExtra("Details2", "Academic Year: ");
                intent.putExtra("Details3", "Semester: ");
                intent.putExtra("Details4", "Module Credit: ");
                intent.putExtra("Details5", "Venue: ");
                startActivity(intent);
            }
        });

        tvc328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Check", "c328");
                intent.putExtra("Details", "Module Code: ");
                intent.putExtra("Details1", "Module Name: ");
                intent.putExtra("Details2", "Academic Year: ");
                intent.putExtra("Details3", "Semester: ");
                intent.putExtra("Details4", "Module Credit: ");
                intent.putExtra("Details5", "Venue: ");
                startActivity(intent);
            }
        });

        tvc331.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Check", "c331");
                intent.putExtra("Details", "Module Code: ");
                intent.putExtra("Details1", "Module Name: ");
                intent.putExtra("Details2", "Academic Year: ");
                intent.putExtra("Details3", "Semester: ");
                intent.putExtra("Details4", "Module Credit: ");
                intent.putExtra("Details5", "Venue: ");
                startActivity(intent);
            }
        });

        tvc203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Check", "c203");
                intent.putExtra("Details", "Module Code: ");
                intent.putExtra("Details1", "Module Name: ");
                intent.putExtra("Details2", "Academic Year: ");
                intent.putExtra("Details3", "Semester: ");
                intent.putExtra("Details4", "Module Credit: ");
                intent.putExtra("Details5", "Venue: ");
                startActivity(intent);
            }
        });

    }
}