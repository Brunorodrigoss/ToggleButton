package togglebutton.cursoandroid.com.togglebutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

    private ToggleButton toggleButton;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggleButtonId);
        textoExibicao = findViewById(R.id.textoExibicaoId);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                // b armazena se o item esta ligado ou não
                textoExibicao.setText("");

                if (b){
                    textoExibicao.setText("Mostrar...");
                }
            }
        });
    }
}
