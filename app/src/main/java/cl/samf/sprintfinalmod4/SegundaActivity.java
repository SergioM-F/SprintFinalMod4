package cl.samf.sprintfinalmod4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import cl.samf.sprintfinalmod4.databinding.ActivityMainBinding;
import cl.samf.sprintfinalmod4.databinding.ActivitySegundaBinding;

public class SegundaActivity extends AppCompatActivity {

    private ActivitySegundaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySegundaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}