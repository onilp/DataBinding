package com.example.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.databinding.databinding.ActivityMainBinding;
import com.example.databinding.model.User;

public class MainActivity extends AppCompatActivity {

    //private EditText etFistName, etLastName;
    private Button btnSave;
    private User mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //set layout in databinding way
        //in dagger component name is MyComponent - DaggerMilkComponent
        //activity_main becomes -> ActivityMainBinding

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //add data to model class
        mUser = new User("Onil","Pravasi");



        //init
       // etFistName = findViewById(R.id.et_firstName);
       // etLastName = findViewById(R.id.et_lastName);
        btnSave = findViewById(R.id.btn_Save);

        //add data to model class
        //final User mUser = new User("Onil","Pravasi");

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*etFistName.setText(mUser.getFirstName());
                etLastName.setText(mUser.getLastName());*/
                binding.setMUser(mUser);

            }
        });
    }
}
