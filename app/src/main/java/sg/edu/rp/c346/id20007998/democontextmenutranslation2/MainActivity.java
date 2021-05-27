package sg.edu.rp.c346.id20007998.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvTranslatedText;
    TextView tvTranslatedText2;

    String worldClicked="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTranslatedText=findViewById(R.id.textViewTranslatedText);
        tvTranslatedText2=findViewById(R.id.textViewTranslatedText2);
        registerForContextMenu(tvTranslatedText);
        registerForContextMenu(tvTranslatedText2);
    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        //…
        if (v==tvTranslatedText){
            worldClicked="hello";
        }else if (v==tvTranslatedText2){
            worldClicked="bye";
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(worldClicked.equalsIgnoreCase("hello")){
            if(item.getItemId()==R.id.EnglishSelection) { //check whether the selected menu item ID is 0
                //code for action
                Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("Hello");
                return true; //menu item successfully handled
            }
            else if(item.getItemId()==R.id.italianSelection) { //check if the selected menu item ID is 1
                //code for action
                Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText.setText("Ciao");
                return true;  //menu item successfully handled
            }
        }else if(worldClicked.equalsIgnoreCase("bye")){
            if(item.getItemId()==R.id.EnglishSelection) { //check whether the selected menu item ID is 0
                //code for action
                Toast.makeText(MainActivity.this, "English is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText2.setText("Bye");
                return true; //menu item successfully handled
            }
            else if(item.getItemId()==R.id.italianSelection) { //check if the selected menu item ID is 1
                //code for action
                Toast.makeText(MainActivity.this, "Italian is chosen", Toast.LENGTH_SHORT).show();
                tvTranslatedText2.setText("Addios");
                return true;  //menu item successfully handled
            }
        }

        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }

}