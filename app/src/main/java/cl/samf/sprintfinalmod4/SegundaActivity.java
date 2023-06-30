package cl.samf.sprintfinalmod4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cl.samf.sprintfinalmod4.databinding.ActivityMainBinding;
import cl.samf.sprintfinalmod4.databinding.ActivitySegundaBinding;

public class SegundaActivity extends AppCompatActivity {

    private ActivitySegundaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySegundaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonLinkedIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String linkedInUrl = "https://www.linkedin.com/in/andy-rubin/";
                Uri uri = Uri.parse(linkedInUrl);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        binding.buttonWSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numeroTelefono = "+56133";

                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + numeroTelefono));
                startActivity(intent);

            }
        });

        binding.buttonMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail = "andy@andy.com"; // Correo electrónico del destinatario
                String mensaje = binding.EditTextMsje.getText().toString(); // Contenido del correo electrónico

                if (!mensaje.isEmpty()) {
                    Intent intentMail = new Intent(Intent.ACTION_SEND);
                    intentMail.setType("text/plain");
                    intentMail.putExtra(Intent.EXTRA_EMAIL, new String[]{mail});
                    intentMail.putExtra(Intent.EXTRA_SUBJECT, mensaje);
                    if (intentMail.resolveActivity(getPackageManager()) != null) {
                        startActivity(intentMail);
                    }else {
                        Toast.makeText(SegundaActivity.this, "No hay una aplicación de correo electrónico disponible", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(SegundaActivity.this, "Favor completar el mensaje para enviar", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }

}