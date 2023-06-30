package cl.samf.sprintfinalmod4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import cl.samf.sprintfinalmod4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

        private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.buttonContacto.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SegundaActivity.class );
            startActivity(intent);
        }
    });

    }

}