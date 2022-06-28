package sp.santech.s21021.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClick = findViewById(R.id.btClick);
        HelloListener listener = new HelloListener();
        btClick.setOnClickListener(listener);

        Button btNameClear = findViewById(R.id.btNameClear);
        btNameClear.setOnClickListener(listener);
        Button btDwellingClear = findViewById(R.id.btDwellingClear);
        btDwellingClear.setOnClickListener(listener);
    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            EditText Nameinput = findViewById(R.id.etName);
            EditText Dwellinginput = findViewById(R.id.etDwelling);
            TextView output = findViewById(R.id.tvOutput);

            int id = view.getId();
            switch (id){
                case R.id.btClick:
                    String inputStrName = Nameinput.getText().toString();
                    String inputStrDwelling = Dwellinginput.getText().toString();
                    output.setText(inputStrDwelling + "にお住まいの" + inputStrName + "さん、こんにちは！");
                    break;
                case R.id.btNameClear:
                    String inputStrName2 = Nameinput.getText().toString();
                    Nameinput.setText("");
                    String inputStrDwelling2 = Dwellinginput.getText().toString();
                    output.setText(inputStrDwelling2 + "にお住まいの" + inputStrName2 + "さん、こんにちは！");
                    break;
                case R.id.btDwellingClear:
                    String inputStrName3 = Nameinput.getText().toString();
                    String inputStrDwelling3 = Dwellinginput.getText().toString();
                    Dwellinginput.setText("");
                    output.setText(inputStrDwelling3 + "にお住まいの" + inputStrName3 + "さん、こんにちは！");
                    break;
            }
        }
    }
}