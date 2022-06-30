package com.example.modul_1_zaniatie_4_dom_3_1;

import android.util.Log;

public class Car {
    public String model = "";
    public double fuelConsumptionOneKm = 0;
    public double fuelTank = 0;
    public String engineStatus  = "OFF";
    public int distance = 0;

    public Car(String model, double fuelConsumptionOneKm, double fuelTank){
        this.model = model;
        this.fuelConsumptionOneKm = fuelConsumptionOneKm;
        this.fuelTank = fuelTank;
    }


    //Drive one km
    public void driveOneKm(){
        if (engineStatus.equals("ON")){
            if (fuelTank >= fuelConsumptionOneKm){
                distance++;
                fuelTank = fuelTank - fuelConsumptionOneKm;
                Log.d("MYLOG", "You drove 1 kilometer.");
                Log.d("MYLOG", "Current distance: " + distance + " km.");
                Log.d("MYLOG", "Tank's balance: " + fuelTank);
            } else {
                Log.d("MYLOG", "Not enough fuel. Tank's balance: " + fuelTank +
                        ". Need for 1 km: " + fuelConsumptionOneKm);
            }

        } else {
            Log.d("MYLOG", "Engine is turned off. Please, start it. Hint: .startEngine().");
        }
    }

    //Refueling car's tank
    public double refuel(){
        this.fuelTank = 30;
        return fuelTank;
    }

    //Start engine
    public String startEngine(){
        this.engineStatus = "ON";
        Log.d("MYLOG", "Engine started. You can drive!");
        return engineStatus;
    }
    //Stop engine
    public String stopEngine(){
        this.engineStatus = "OFF";
        Log.d("MYLOG", "Engine stopped. You can't drive.");
        return engineStatus;
    }
}
