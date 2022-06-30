package com.example.modul_1_zaniatie_4_dom_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car audi = new Car("Audi X5 AMG", 0.07,30);

        audi.startEngine();

        for (int i = 0; i <= 2000; i++){
            audi.driveOneKm();
            if (audi.fuelTank < audi.fuelConsumptionOneKm){
                Log.d("MYLOG", "Not enough fuel. Tank's balance: " + audi.fuelTank +
                        ". Need for 1 km: " + audi.fuelConsumptionOneKm);
                Log.d("MYLOG", "Finished at distance: " + audi.distance + " km.");
                break;
            }
        }

        Car bmw = new Car("BMW 328",0.1,30);

        int refuelNumber = 0;

        bmw.startEngine();

        for (int i = 1; i <= 2000; i++){
            bmw.driveOneKm();
            if (bmw.fuelTank < bmw.fuelConsumptionOneKm){
                bmw.refuel();
                refuelNumber++;
                Log.d("MYLOG", "Refueling is successful. Current tank's balance: " + bmw.fuelTank);
            }
            if (bmw.distance >= 1200){
                Log.d("MYLOG", "You've reached 1200 km. It was wonderful trip!");
                Log.d("MYLOG", "You've used your start fuel + " + refuelNumber +
                        " full refueling. Tank's balance: " + bmw.fuelTank);
                break;
            }
        }

    }
}