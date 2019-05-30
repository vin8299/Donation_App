package com.ngo.prisdon.ngo;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DonateNow extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private static final Object red = "#D81B61";
    private EditText donationAmount;
    private EditText donorName;
    private EditText email;
    private EditText contact;
    private EditText organisationName;
    private EditText panCardNumber;
    private EditText address;
    private Button donate;
    private boolean canDonate;
    private Spinner countryList;
    private String[] countryNames={"India","Afghanistan","Ethiopia","Malawi","Senegal","Haiti","Madagascar","Mauritania","Ivory Coast","Chad","Cameroon","Liberia"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_donate);
        countryList = (Spinner) findViewById(R.id.country_list);
        countryList.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,countryNames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
        countryList.setAdapter(aa);

    }
    protected void onStart() {
        super.onStart();
        donationAmount = (EditText) findViewById(R.id.donation_amount);
        donorName = (EditText) findViewById(R.id.donor_name);
        email = (EditText) findViewById(R.id.email);
        contact = (EditText) findViewById(R.id.contact);
        organisationName = (EditText) findViewById(R.id.organisation_name);
        panCardNumber = (EditText) findViewById(R.id.pan_card_number);
        address = (EditText) findViewById(R.id.address);

        donate = (Button) findViewById(R.id.donateNow);



    }
    public void DonateNow(View view) {
        canDonate=true;

        if ((donationAmount.getText().toString().trim().equals(""))) {
            donationAmount.setHint("Donation Amount Required!");
            donationAmount.setHintTextColor(Color.parseColor("#D81B61"));
            canDonate = false;
        }
        if ((donorName.getText().toString().trim().equals(""))) {
            donorName.setHint("Donor Name Is Required!");
            donorName.setHintTextColor(Color.parseColor("#D81B61"));
            canDonate = false;
        }
        if ((email.getText().toString().trim().equals(""))) {
            email.setHint("Email is Required!");
            email.setHintTextColor(Color.parseColor("#D81B61"));
            canDonate = false;
        }
        if ((contact.getText().toString().trim().equals(""))) {
            contact.setHint("Contact is Required!");
            contact.setHintTextColor(Color.parseColor("#D81B61"));
            canDonate = false;
        }
        if ((panCardNumber.getText().toString().trim().equals(""))) {
            panCardNumber.setHint("PAN Card is Required!");
            panCardNumber.setHintTextColor(Color.parseColor("#D81B61"));
            canDonate = false;
        }
        if ((address.getText().toString().trim().equals(""))) {
            address.setHint("Address is Required!");
            address.setHintTextColor(Color.parseColor("#D81B61"));
            canDonate = false;
        }
        if(canDonate==true){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "DONATED THANK YOU",
                    Toast.LENGTH_SHORT);

            toast.show();
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
