package efestus.musication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lvl2_notmus_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lvl2_notmus_7);

        final Button but4 = (Button) findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(lvl2_notmus_7.this, lvl2_notmus_8.class);
                startActivity(intent);
            }
        });
    }
}
