package it.linux.vicenza.mikinacucchi.demo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        /*      Demo code       */
        //Evento da associare alla pressione del pulsante
        View.OnClickListener event = new View.OnClickListener() { //tipo di oggetto da usare per eventi nei componenti della UI
            @Override
            public void onClick(View v) { //Metodo che verrà richiamato alla presione del pulsante
                faiqualcosa1();
                //faiqualcosa2();
            }
        };

        //Selezione l'elento della UI e attribuisco l'evento creato
        findViewById(R.id.button).setOnClickListener(event);
        /*      =========       */
    }

    /*      Demo code       */
    private void faiqualcosa1() {
        //Recupero l'indirizzo da aprire
        String msg = getString(R.string.str_buttonpressed);

        //Visualizzazione di un Toast con un messaggio
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
    private void faiqualcosa2() {
        //Recupero l'indirizzo da aprire
        String url = getString(R.string.url_lugvi_events);

        //Browser intent
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
    /*      =========       */






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

