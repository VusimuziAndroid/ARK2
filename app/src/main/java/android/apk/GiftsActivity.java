package android.apk;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class GiftsActivity extends AppCompatActivity {
  //  Spinner spinners;
    private String[] arraySpinner;
   // ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gifts);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /*  spinners = (Spinner) findViewById(R.id.gifts);

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,arraySpinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.Items,android.R.layout.simple_dropdown_item_1line);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinners.setAdapter(adapter);*/

    }

    public void onClickPopUp(View view){

        AlertDialog.Builder builder7 = new AlertDialog.Builder(GiftsActivity.this,R.style.AlertDialogStyle);
        builder7.setCancelable(false);
        final View  inflater =getLayoutInflater().inflate(R.layout.list_dialogstyle, null);
        builder7.setView(inflater)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                              //  EditText etMessage = (EditText) inflater.findViewById(R.id.tvDialogPopUp);

                                String line="This item USB was purchased at Take a lot will be delivered to the address of 34 Hill Street Pretoria";
                             //   etMessage.setText(line);
                                Toast.makeText(GiftsActivity.this,"This item USB was purchased at Take a lot will be delivered to the address of 34 Hill Street Pretoria",Toast.LENGTH_SHORT).show();
                            }
                        }
                );
                /*.setNegativeButton("PICTURE", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent galleryIntent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                                startActivityForResult(galleryIntent, RESULT_LOAD_IMAGE);
                            }
                        }
                );*/
        builder7.create();
        builder7.show();
    }

}
