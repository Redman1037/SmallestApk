package in.eightfolds.smallestapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class a extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText("Hello World");
        setContentView(textView);
    }
}
