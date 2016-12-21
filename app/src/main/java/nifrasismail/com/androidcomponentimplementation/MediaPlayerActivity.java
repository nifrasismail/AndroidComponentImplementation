package nifrasismail.com.androidcomponentimplementation;

import android.media.MediaPlayer;
import android.media.tv.TvContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MediaPlayerActivity extends AppCompatActivity implements View.OnClickListener {

    MediaPlayer player;
    Button play,pause,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        play = (Button)findViewById(R.id.btn_play);
        pause = (Button)findViewById(R.id.btn_pause);
        stop = (Button)findViewById(R.id.btn_stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_play:
                player = MediaPlayer.create(this,R.raw.twinkle);
                player.start();
                break;
            case R.id.btn_pause:
                player.pause();
                break;
            case R.id.btn_stop:
                player.stop();
                break;
        }
    }
}
