package com.example.siddhant.bvportal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class ScanBarcode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_barcode);
    }

    public void scanNow(View view)
    {
        IntentIntegrator integrator = new IntentIntegrator(this);
        Log.d("test", "Scan button works!");
        integrator.setDesiredBarcodeFormats(IntentIntegrator.ONE_D_CODE_TYPES);
        integrator.setPrompt("Scan a barcode");
        integrator.setResultDisplayDuration(0);
        integrator.setWide();
        integrator.setCameraId(0);
        integrator.initiateScan();
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent)
    {
        //TextView format = (TextView)findViewById(R.id.scanContent);
        //TextView content = (TextView)findViewById(R.id.scanFormat);
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode,resultCode,intent);

        if(scanningResult != null)
        {
            String scanContent = scanningResult.getContents();
            //String scanFormat = scanningResult.getFormatName();
            //format.setText("FORMAT: " + scanFormat);
            Intent i = new Intent(this,NewAccount.class);
            i.putExtra("enrollment",scanContent);
            startActivity(i);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"No scan data received!", Toast.LENGTH_LONG).show();

        }
    }
}