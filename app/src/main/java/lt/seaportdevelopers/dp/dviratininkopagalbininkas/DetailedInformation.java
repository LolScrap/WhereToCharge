package lt.seaportdevelopers.dp.dviratininkopagalbininkas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailedInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_information);

        TextView storeTitle = (TextView) findViewById(R.id.store_title);
        TextView storeSnippet = (TextView) findViewById(R.id.store_snippet);
        storeTitle.setText(getIntent().getStringExtra("title"));
        storeSnippet.setText(getIntent().getStringExtra("snippet"));
    }
}