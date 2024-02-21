package tr.com.ensar.uygulama10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAsker,btnTank;
    TextView txtMesaj;
    public Asker asker;
    public Tank tank;
    String mesaj = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAsker = findViewById(R.id.btnAsker);
        btnTank = findViewById(R.id.btnTank);
        txtMesaj = findViewById(R.id.txtMesaj);
        asker =  new Asker();
        tank = new Tank();
        btnAsker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = asker.atesEt();
                txtMesaj.setText(mesaj);
            }
        });
        btnTank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mesaj = tank.atesEt();
                txtMesaj.setText(mesaj);
            }
        });
    }
}