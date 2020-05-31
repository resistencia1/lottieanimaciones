package com.example.lottieanimaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    boolean isSwitchOn =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LottieAnimationView  lottieSwitchButton=findViewById(R.id.lottSwitch);
        //cambiar velocidad
        
        //&dsafds
        lottieSwitchButton.setSpeed(3f);
        lottieSwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isSwitchOn){
                    lottieSwitchButton.setMinAndMaxProgress(0.5f,1.0f);
                    lottieSwitchButton.playAnimation();
                    isSwitchOn=false;
                }else{
                    lottieSwitchButton.setMinAndMaxProgress(0.0f,0.5f);
                    lottieSwitchButton.playAnimation();
                    isSwitchOn=true;
                }
            }
        });

    }
}
