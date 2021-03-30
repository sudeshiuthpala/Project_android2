package com.example.smartvanproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class PaidSalaryReport extends AppCompatActivity {
    String q,r,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paid_salary_report);
        Intent i2 = getIntent();
        Bundle b2 = i2.getExtras();
        if (b2 != null) {
            q=(String)b2.get("year");
            r =(String)b2.get("month");
            s=(String) b2.get("name");// text.setText(r);
        }
        SalaryPaidPaymentBackgroundWorker bg=new SalaryPaidPaymentBackgroundWorker(this);
        bg.execute(q,r,s);
    }
}