package com.example.fragmentsdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction fragmentTransaction;
    MessagesFragment messagesFragment;
    ContactsFragment contactsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messagesFragment = new MessagesFragment();
        contactsFragment = new ContactsFragment();

        //When Activity created first time
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout, messagesFragment, "Some tag").commit();
        }


    }

    /**
     * Go To Messages Fragment
     * <p>
     * When fragmentMessages button clicked
     *
     * @param view
     */
    public void goToMessages(View view) {

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, messagesFragment).commit();

    }

    /**
     * Go To Contacts Fragment
     * <p>
     * When fragmentContacts button clicked
     *
     * @param view
     */
    public void goToContacts(View view) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, contactsFragment).commit();
    }
}