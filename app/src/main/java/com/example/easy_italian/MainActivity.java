package com.example.easy_italian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] data = {"Niente codardia","Nessun ostacolo potrà fermarti finché la voglia di volare sarà più forte della paura di cadere","Hai presente il vento? Si spostano dove soffia di più. ","  Non bisogna temere le difficoltà della vita. Per milgiorarci. ","Io sono il sole e tu sei il fulmine"," Io illumino, tu abbagli.","Io sono l'ora e tu sei l'attimo."," Per quanto tu possa anticiparmi io ti raggiungerò sempre."," Le persone sono così."," Perché andare controcorrente è privilegio dei più coraggiosi."," Sono fatte per essere superate. Per metterci alla prova."," I fiori più belli nascono dopo gli inverni rigidi.  "};
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.readactivity_main);
        //ListView listView = (ListView) findViewById(R.id.list_view);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(
               // MainActivity.this, android.R.layout.simple_list_item_1, data);
        //listView.setAdapter(adapter);
        }
       //add somethinig
}
