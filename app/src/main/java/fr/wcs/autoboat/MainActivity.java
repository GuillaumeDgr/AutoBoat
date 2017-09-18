package fr.wcs.autoboat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.autoboat, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final TextView marque = (TextView) findViewById(R.id.marque);
        final TextView modele = (TextView) findViewById(R.id.modele);
        final TextView kilometres = (TextView) findViewById(R.id.kilometres);
        final TextView nombreHeures = (TextView) findViewById(R.id.nombreHeures);
        final TextView puissance = (TextView) findViewById(R.id.power);
        final Button button = (Button) findViewById(R.id.button);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    marque.setVisibility(View.VISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    kilometres.setVisibility(View.GONE);
                    nombreHeures.setVisibility(View.GONE);
                    puissance.setVisibility(View.GONE);
                    button.setEnabled(false);
                }
                if (position == 1) {
                    marque.setVisibility(View.VISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    kilometres.setVisibility(View.VISIBLE);
                    nombreHeures.setVisibility(View.GONE);
                    puissance.setVisibility(View.GONE);
                    button.setEnabled(true);
                }
                if (position == 2) {
                    marque.setVisibility(View.VISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    kilometres.setVisibility(View.GONE);
                    nombreHeures.setVisibility(View.VISIBLE);
                    puissance.setVisibility(View.GONE);
                    button.setEnabled(true);
                }
                if (position == 3) {
                    marque.setVisibility(View.VISIBLE);
                    modele.setVisibility(View.VISIBLE);
                    kilometres.setVisibility(View.GONE);
                    nombreHeures.setVisibility(View.GONE);
                    puissance.setVisibility(View.VISIBLE);
                    button.setEnabled(true);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int position = spinner.getSelectedItemPosition();
                String brand = marque.getText().toString();
                String model = modele.getText().toString();
                String kilometers = kilometres.getText().toString();
                String hours = nombreHeures.getText().toString();
                String power = puissance.getText().toString();

                Intent intent = new Intent(MainActivity.this, VehicleActivity.class);
                intent.putExtra("position", position);
                intent.putExtra("brand", brand);
                intent.putExtra("model", model);
                intent.putExtra("kilometers", kilometers);
                intent.putExtra("hours", hours);
                intent.putExtra("power", power);
                startActivity(intent);
            }
        });
    }
}
