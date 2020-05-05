package com.example.gpssy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Animation topAnim,bottomAnim;
    ImageView image;
    TextView logo;
    Button simpleButton1,simpleButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        simpleButton1 = (Button) findViewById(R.id.simpleButton1);//get id of button 1
        simpleButton2 = (Button) findViewById(R.id.simpleButton2);//get id of button 2

        simpleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Simple Button 1", Toast.LENGTH_LONG).show();//display the text of button1
            }
        });
        simpleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Simple Button 2", Toast.LENGTH_LONG).show();//display the text of button2
            }
        });

        //Animation
        topAnim= AnimationUtils.loadAnimation( this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation( this,R.anim.bottom_animation);
        simpleButton1=findViewById(R.id.simpleButton1);
       simpleButton2=findViewById(R.id.simpleButton2);

        //Hooks
        image=findViewById(R.id.imageView);
        logo=findViewById(R.id.textView);

        image.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        simpleButton1.setAnimation(bottomAnim);
       simpleButton2.setAnimation(bottomAnim);

    }
}
