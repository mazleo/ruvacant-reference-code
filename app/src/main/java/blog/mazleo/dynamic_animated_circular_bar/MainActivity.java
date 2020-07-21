package blog.mazleo.dynamic_animated_circular_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progress_bar);
        button = findViewById(R.id.button);

        button.setOnClickListener(
                view -> {
                    ObjectAnimator.ofArgb(progressBar, "progress", 0, 75)
                        .setDuration(700)
                        .start();
                }
        );
    }
}
