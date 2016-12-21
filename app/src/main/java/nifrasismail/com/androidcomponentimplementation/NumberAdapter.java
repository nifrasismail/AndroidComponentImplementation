package nifrasismail.com.androidcomponentimplementation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by techorin on 12/20/16.
 */

public class NumberAdapter extends ArrayAdapter<Number> {

    public NumberAdapter(Context context, ArrayList<Number> arrayList) {
        super(context, 0, arrayList);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Number currentNumber = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.single_item, parent, false);
        }

        TextView numberTextView = (TextView)listItemView.findViewById(R.id.number);
        numberTextView.setText(currentNumber.getNumber() + "");

        TextView multiplicationTextView = (TextView)listItemView.findViewById(R.id.multiplication);
        multiplicationTextView.setText(currentNumber.getMultiplication() + "");


        return listItemView;

    }
}
