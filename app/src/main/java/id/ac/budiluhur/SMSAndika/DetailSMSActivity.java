package id.ac.budiluhur.SMSAndika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailSMSActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtPhone, txtMessage, txtDate;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(id.ac.budiluhur.SMSAndika.R.layout.activity_detail_sms);

        txtPhone = (TextView) findViewById(id.ac.budiluhur.SMSAndika.R.id.txtPhone);
        txtMessage = (TextView) findViewById(id.ac.budiluhur.SMSAndika.R.id.txtMessage);
        txtDate = (TextView) findViewById(id.ac.budiluhur.SMSAndika.R.id.txtDate);

        btnBack = (Button) findViewById(id.ac.budiluhur.SMSAndika.R.id.btnBack);
        btnBack.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            txtPhone.setText(extras.getString("txtPhone"));
            txtMessage.setText(extras.getString("txtMessage"));
            txtDate.setText(extras.getString("txtDate"));
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case id.ac.budiluhur.SMSAndika.R.id.btnBack:
                finish();
                break;
        }
    }
}
