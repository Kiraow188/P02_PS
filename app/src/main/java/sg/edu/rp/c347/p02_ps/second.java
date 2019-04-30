package sg.edu.rp.c347.p02_ps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class second extends AppCompatActivity {
    ListView lv;
    TextView tvName;
    ArrayAdapter aa;
    ArrayList<Holiday> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvHoliday);
        tvName = (TextView) findViewById(R.id.tvType);

        holiday = new ArrayList<Holiday>();

        Intent i = getIntent();
        String name = i.getStringExtra("name");
        tvName.setText(name);

        if (name.equals("Secular")) {
            holiday.add(new Holiday("New Year's Day", "1 Jan 2017", true, "Secular"));
            holiday.add(new Holiday("Labour Day", "1 May 2017", false, "Secular"));
        } else {
            holiday.add(new Holiday("Chinese New Year", "28-29 Jan 2017", true, "Ethnic"));
            holiday.add(new Holiday("Good Friday", "14 April 2017", false, "Ethnic"));
        }

        aa = new HolidayAdapter(this, R.layout.row, holiday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Holiday selected = holiday.get(position);

                Toast.makeText(second.this, selected.getDay()
                                + " Date: " + selected.getDate(),
                        Toast.LENGTH_LONG).show();

            }
        });




    }
}
