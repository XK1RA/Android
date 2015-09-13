package com.example.paulaalejandra.androiduan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class CaraDePapa extends AppCompatActivity {

    CheckBox CUERPO, OJOS, CEJAS, NARIZ, BOCA, OREJAS, BRAZOS, SOMBRERO, GAFAS, BIGOTE, ZAPATOS;
    Button btnpcpal, btnJuegoN;
    ImageView ICUERPO, IOJOS, ICEJAS, INARIZ, IBOCA, IOREJAS, IBRAZOS, ISOMBRERO, IGAFAS, IBIGOTE, IZAPATOS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara_de_papa);

        btnpcpal = (Button) findViewById(R.id.btnpcpal);
        btnJuegoN = (Button) findViewById(R.id.btnJuegoN);
        CUERPO = (CheckBox) findViewById(R.id.CUERPO);
        OJOS = (CheckBox) findViewById(R.id.OJOS);
        CEJAS = (CheckBox) findViewById(R.id.CEJAS);
        NARIZ = (CheckBox) findViewById(R.id.NARIZ);
        BOCA = (CheckBox) findViewById(R.id.BOCA);
        OREJAS = (CheckBox) findViewById(R.id.OREJAS);
        BRAZOS = (CheckBox) findViewById(R.id.BRAZOS);
        SOMBRERO = (CheckBox) findViewById(R.id.SOMBRERO);
        GAFAS = (CheckBox) findViewById(R.id.GAFAS);
        BIGOTE = (CheckBox) findViewById(R.id.BIGOTE);
        ZAPATOS = (CheckBox) findViewById(R.id.ZAPATOS);
        ICUERPO = (ImageView) findViewById(R.id.ICUERPO);
        IOJOS = (ImageView) findViewById(R.id.IOJOS);
        ICEJAS = (ImageView) findViewById(R.id.ICEJAS);
        INARIZ = (ImageView) findViewById(R.id.INARIZ);
        IBOCA = (ImageView) findViewById(R.id.IBOCA);
        IOREJAS = (ImageView) findViewById(R.id.IOREJAS);
        IBRAZOS = (ImageView) findViewById(R.id.IBRAZOS);
        ISOMBRERO = (ImageView) findViewById(R.id.ISOMBRERO);
        IGAFAS = (ImageView) findViewById(R.id.IGAFAS);
        IBIGOTE = (ImageView) findViewById(R.id.IBIGOTE);
        IZAPATOS = (ImageView) findViewById(R.id.IZAPATOS);


        btnpcpal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Principal.class);
                startActivity(i);
            }
        });
        btnJuegoN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), CaraDePapa.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cara_de_papa, menu);
        return true;}
    public void ocultarBoton(View v) {
        boolean checked = ((CheckBox) v).isChecked();
            switch(v.getId()) {
                case R.id.CUERPO:
                    if (checked)
                        ICUERPO.setVisibility(View.VISIBLE);
                    else
                        ICUERPO.setVisibility(View.INVISIBLE);
                    break;
                case R.id.OJOS:
                    if (checked)
                        IOJOS.setVisibility(View.VISIBLE);
                    else
                        IOJOS.setVisibility(View.INVISIBLE);
                    break;
                case R.id.CEJAS:
                    if (checked)
                        ICEJAS.setVisibility(View.VISIBLE);
                    else
                        ICEJAS.setVisibility(View.INVISIBLE);
                    break;
                case R.id.NARIZ:
                    if (checked)
                        INARIZ.setVisibility(View.VISIBLE);
                    else
                        INARIZ.setVisibility(View.INVISIBLE);
                    break;
                case R.id.BIGOTE:
                    if (checked)
                        IBIGOTE.setVisibility(View.VISIBLE);
                    else
                        IBIGOTE.setVisibility(View.INVISIBLE);
                    break;
                case R.id.BRAZOS:
                    if (checked)
                        IBRAZOS.setVisibility(View.VISIBLE);
                    else
                        IBRAZOS.setVisibility(View.INVISIBLE);
                    break;
                case R.id.OREJAS:
                    if (checked)
                        IOREJAS.setVisibility(View.VISIBLE);
                    else
                        IOREJAS.setVisibility(View.INVISIBLE);
                    break;
                case R.id.BOCA:
                    if (checked)
                        IBOCA.setVisibility(View.VISIBLE);
                    else
                        IBOCA.setVisibility(View.INVISIBLE);
                    break;
                case R.id.ZAPATOS:
                    if (checked)
                        IZAPATOS.setVisibility(View.VISIBLE);
                    else
                        IZAPATOS.setVisibility(View.INVISIBLE);
                    break;
                case R.id.SOMBRERO:
                    if (checked)
                        ISOMBRERO.setVisibility(View.VISIBLE);
                    else
                        ISOMBRERO.setVisibility(View.INVISIBLE);
                    break;
                case R.id.GAFAS:
                    if (checked)
                        IGAFAS.setVisibility(View.VISIBLE);
                    else
                        IGAFAS.setVisibility(View.INVISIBLE);
                    break;
            }
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
