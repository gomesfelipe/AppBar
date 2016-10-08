package br.com.appbar;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.askerov.dynamicgrid.example.R;

public class CadastroClientes extends Activity implements View.OnClickListener {
    private final static Clientes cliente = new Clientes();
    Button btnCTime;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_clientes);
        btnCTime=(Button)findViewById(R.id.button);
        btnCTime.setOnClickListener(this);
        text = (EditText) findViewById(R.id.editText);
       // text = (TextView) findViewById(R.id.textView2);

    }

    public Clientes referencia(){
        return cliente;
    }
    @Override
    public void onClick(View view) {

        cliente.adicionar(text.getText().toString().trim());

        finish();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
