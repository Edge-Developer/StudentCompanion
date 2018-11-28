package edgedev.studentcompanion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void finances(View view) {
        startActivity(new Intent(this, Finances.class));
    }
    public void timetable(View view) {
        startActivity(new Intent(this, Timetable.class));
    }
    public void goals(View view) {
        startActivity(new Intent(this, Goals.class));
    }

    public void food(View view) {
        startActivity(new Intent(this, Food.class));
    }
}
