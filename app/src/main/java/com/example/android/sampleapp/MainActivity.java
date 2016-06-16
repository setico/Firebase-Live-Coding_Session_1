package com.example.android.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;

//Utilisation basique de FirebaseAnalytics

public class MainActivity extends AppCompatActivity {
    // objet FirebaseAnalytics qui nous servira d'envoyer des evenements sur notre serveur Firebase
    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        setContentView(R.layout.activity_main);
    }

    public void bouton_click(View view){
        //Nous creons un evenement que nous envoyons au serveur à chaque clique sur le bouton
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID,0+"");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME,"bouton 1");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT,bundle);
    }
}
