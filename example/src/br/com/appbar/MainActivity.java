package br.com.appbar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import org.askerov.dynamicgrid.DynamicGridView;
import org.askerov.dynamicgrid.example.R;

public class MainActivity extends Activity {

    private DynamicGridView gridView;
    private CadastroClientes cd = new CadastroClientes();
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        gridView = (DynamicGridView) findViewById(R.id.dynamic_grid);
        gridView.setAdapter(new DynamicAdapter(this, cd.referencia().getArray(), getResources().getInteger(R.integer.column_count)));

     gridView.setOnDropListener(new DynamicGridView.OnDropListener()
      {
            @Override
            public void onActionDrop()
            {
                gridView.stopEditMode();
            }
                  });

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                if (parent.getAdapter().getItem(position).toString() == " ") {
//                    cliente.adicionar("Cliente 2");
//
//                    Intent intent = getIntent();
//                    finish();
//                    startActivity(getIntent());
//                }
//                else{
//                    startSecondActivity();
//                }

                if (parent.getAdapter().getItem(position).toString() == " ") {

                    startSecondActivity();
                 //  startActivity(getIntent());

                }
                else{
                       // startSecondActivity();
                    }
                }
        });
    }
    public void startSecondActivity(){
        Intent intent = new Intent(this, CadastroClientes.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
            super.onBackPressed();
    }
}
