package fr.wcs.autoboat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VehicleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        String brand = intent.getStringExtra("brand");
        String model = intent.getStringExtra("model");
        String kilometers = intent.getStringExtra("kilometers");
        String hours = intent.getStringExtra("hours");
        String power = intent.getStringExtra("power");

        TextView textView = (TextView)findViewById(R.id.textView);

        if (position == 1) {
            Car vroum = new Car(brand, model, kilometers);
            textView.setText(vroum.getDescription());
        }
        if (position == 2) {
            Boat vrrrrr = new Boat(brand, model, hours);
            textView.setText(vrrrrr.getDescription());
        }
        if (position == 3) {
            Moto brrrrr = new Moto(brand, model, power);
            textView.setText(brrrrr.getDescription());
        }
    }
}
