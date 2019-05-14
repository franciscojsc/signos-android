package br.com.franciscochaves.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView mListaSignos;
    private String[] mSignos = {
            "Áries",
            "Touro",
            "Gêmeos",
            "Câncer",
            "Leão",
            "Virgem",
            "Libra",
            "Escorpião",
            "Sagitário",
            "Capricórnio",
            "Aquário",
            "Peixes"
    };

    private String[] mPerfil = {
            "Arianos são animados, independentes, individualistas, dinâmicos, corajosos e aventureiros",
            "Taurinos são positivos, pacientes, determinados, noturnos, leais e românticos",
            "Geminianos são positivos, mutáveis, racionais e bastante voláteis",
            "...", "...", "...", "...", "...", "...", "...", "...", "..."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListaSignos = findViewById(R.id.list_signos);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                getApplication(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                mSignos
        );

        mListaSignos.setAdapter(adaptador);

        mListaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int codigoPosicao = i;
                Toast.makeText(getApplicationContext(), mPerfil[i], Toast.LENGTH_LONG).show();
            }
        });
    }
}
