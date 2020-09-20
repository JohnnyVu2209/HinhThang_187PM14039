package com.example.hinhthang_187pm14039;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText dn,dl,c,cb1,cb2;
    TextView ketqua;
    Button tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dn = (EditText)findViewById(R.id.etDN);
        dl = (EditText)findViewById(R.id.etDL);
        c = (EditText)findViewById(R.id.etC);
        cb1 = (EditText)findViewById(R.id.etCB1);
        cb2 = (EditText)findViewById(R.id.etCB2);
        ketqua = (TextView)findViewById(R.id.tvKetQua);
        tinh = (Button)findViewById(R.id.btnTinh);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    double dLon, dBe, Cao, Cben1, Cben2, S, P;
                    dLon = Double.parseDouble(dl.getText().toString());
                    dBe = Double.parseDouble(dn.getText().toString());
                    Cao = Double.parseDouble(c.getText().toString());
                    Cben1 = Double.parseDouble(cb1.getText().toString());
                    Cben2 = Double.parseDouble(cb2.getText().toString());

                    S = Cao * ((dLon + dBe) / 2);
                    P = dLon + dBe + Cben1 + Cben2;
                    ketqua.setText("Chu vi hình thang là :" + P + "\nDiện tích hình thang là :" + S);


            }
        });
    }

}
