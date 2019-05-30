package com.ngo.prisdon.ngo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class JoinNow extends AppCompatActivity {
    private EditText firstName;
    private EditText lastName;
    private EditText city;
    private EditText district;
    private EditText state;
    private EditText pinCode;
    private EditText contactNumber;
    private EditText email;
    private EditText age;
    private boolean canSubmit;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join);
    }

    @Override
    protected void onStart() {
        super.onStart();
        firstName=(EditText)findViewById(R.id.first_name);
        lastName=(EditText)findViewById(R.id.last_name);
        city=(EditText)findViewById(R.id.city);
        district=(EditText)findViewById(R.id.district);
        state=(EditText)findViewById(R.id.state);
        pinCode=(EditText)findViewById(R.id.pin_code);
        contactNumber=(EditText)findViewById(R.id.contact);
        email=(EditText)findViewById(R.id.email);
        age=(EditText)findViewById(R.id.age);
    }
    public void OnSubmit(View view){
        canSubmit=true;

        if ((firstName.getText().toString().trim().equals(""))) {
            firstName.setHint("First Name Is Required!");
            firstName.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit = false;
        }
        if ((lastName.getText().toString().trim().equals(""))) {
            lastName.setHint("Last Name Is Required!");
            lastName.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if ((email.getText().toString().trim().equals(""))) {
            email.setHint("Email is Required!");
            email.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if ((city.getText().toString().trim().equals(""))) {
            city.setHint("City is Required!");
            city.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if ((district.getText().toString().trim().equals(""))) {
            district.setHint("District is Required!");
            district.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if ((state.getText().toString().trim().equals(""))) {
            state.setHint("State is Required!");
            state.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if ((pinCode.getText().toString().trim().equals(""))) {
            pinCode.setHint("Pin Code is Required!");
            pinCode.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if ((contactNumber.getText().toString().trim().equals(""))) {
            contactNumber.setHint("Contact Number is Required!");
            contactNumber.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if ((age.getText().toString().trim().equals(""))) {
            age.setHint("Age is Required!");
            age.setHintTextColor(Color.parseColor("#D81B61"));
            canSubmit=false;
        }
        if(canSubmit==true){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "SUBMITTED THANK YOU",
                    Toast.LENGTH_SHORT);

            toast.show();
        }


    }
}
