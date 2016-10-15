package id.sch.smktelkom_mlg.tugas01.xiirpl2033.formpendaftaranekstrakulikuler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Button btSb;
    TextView tvHasil;
    Spinner spKelas;
    RadioButton rbLk, rbPr;
    CheckBox cbPr, cbBs, cbSb, cbPs, cbVl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        rbLk = (RadioButton) findViewById(R.id.radioButtonLk);
        rbPr = (RadioButton) findViewById(R.id.radioButtonPr);
        cbPr = (CheckBox) findViewById(R.id.checkBoxPr);
        cbBs = (CheckBox) findViewById(R.id.checkBoxBs);
        cbSb = (CheckBox) findViewById(R.id.checkBoxSb);
        cbPs = (CheckBox) findViewById(R.id.checkBoxPs);
        cbVl = (CheckBox) findViewById(R.id.checkBoxVl);

        btSb = (Button) findViewById(R.id.buttonsb);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        btSb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProcess();
            }
        });

}
