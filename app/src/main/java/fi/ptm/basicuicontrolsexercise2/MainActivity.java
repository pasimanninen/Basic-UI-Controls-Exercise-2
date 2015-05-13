package fi.ptm.basicuicontrolsexercise2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Toast;

/**
 *
 * @author PTM
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.login);
        // add stings to control
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,
                new String[] {"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }

    // button handler
    public void loginButtonPressed(View view) {
        // login name
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.login);
        String loginname = actv.getText().toString();
        // password
        EditText et = (EditText) findViewById(R.id.password);
        String password = et.getText().toString();
        // get context
        Context context = getApplicationContext();
        // toast message to screen
        Toast.makeText(context, loginname+" "+password, Toast.LENGTH_SHORT).show();
    }
}
