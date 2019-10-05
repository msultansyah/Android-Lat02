package id.ac.poliban.mi.sultan.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUserName = findViewById(R.id.etUserName);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(v -> {
            //mengosongkan edti text
            etUserName.setText("");
            etPassword.setText("");
            //meletakkan kursor di etUserName
            etUserName.requestFocus();
        });

        btLogin.setOnClickListener(v -> {
            //mengosongkan EditText
            etUserName.setText("");
            etPassword.setText("");
            etPassword.requestFocus();
            Toast.makeText(this, "You Have Logged", Toast.LENGTH_SHORT).show();

        });
    }
}
