package nifrasismail.com.androidcomponentimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerComponentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_component);

        getSupportActionBar().setTitle("Spinner View");

        ArrayList numbers_list = new ArrayList();
        for (int i = 0; i < 1000; i++) {
            numbers_list.add(i);
        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,numbers_list);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(itemsAdapter);

    }
}
