package nifrasismail.com.androidcomponentimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        getSupportActionBar().setTitle("List View");

        ArrayList<Number> numbers_list = new ArrayList<Number>();
        for (int i = 0; i < 1000; i++) {
            Number tmp = new Number(i,i*10);
            numbers_list.add(tmp);
        }

        NumberAdapter itemsAdapter = new NumberAdapter(this,numbers_list);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(itemsAdapter);
    }
}
