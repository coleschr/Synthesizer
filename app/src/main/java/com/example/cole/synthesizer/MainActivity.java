package com.example.cole.synthesizer;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int WHOLE_NOTE = 1000;
    private Button twinkleButton, playButton, eScaleButton, otjButton, aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsButton;
    private MediaPlayer[] note;
    private NumberPicker numberOfTimesNumberPicker, noteNumberPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        createMediaPlayers();
        colorButtons();


    }

    private void wireWidgets() {

        //wire and set up number pickers
        numberOfTimesNumberPicker = (NumberPicker) findViewById(R.id.numberPicker_number);
        numberOfTimesNumberPicker.setMinValue(1);
        numberOfTimesNumberPicker.setMaxValue(10);

        noteNumberPicker = (NumberPicker) findViewById(R.id.numberPicker_note);
        noteNumberPicker.setMinValue(0);
        noteNumberPicker.setMaxValue(11);
        noteNumberPicker.setDisplayedValues(new String[]{"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"});

        //wire buttons
        twinkleButton = (Button) findViewById(R.id.button_twinkle);
        playButton = (Button) findViewById(R.id.button_play);
        eScaleButton = (Button) findViewById(R.id.button_e_scale);
        otjButton = (Button) findViewById(R.id.button_otj);
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsButton = (Button) findViewById(R.id.button_gs);
    }

    private void setListeners() {
        twinkleButton.setOnClickListener(this);
        playButton.setOnClickListener(this);
        eScaleButton.setOnClickListener(this);
        otjButton.setOnClickListener(this);
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsButton.setOnClickListener(this);
    }

    private void createMediaPlayers() {
        //store media players in an array
        this.note = new MediaPlayer[24];
        note[0] = MediaPlayer.create(this, R.raw.scalea);
        note[1] = MediaPlayer.create(this, R.raw.scalebb);
        note[2] = MediaPlayer.create(this, R.raw.scaleb);
        note[3] = MediaPlayer.create(this, R.raw.scalec);
        note[4] = MediaPlayer.create(this, R.raw.scalecs);
        note[5] = MediaPlayer.create(this, R.raw.scaled);
        note[6] = MediaPlayer.create(this, R.raw.scaleds);
        note[7] = MediaPlayer.create(this, R.raw.scalee);
        note[8] = MediaPlayer.create(this, R.raw.scalef);
        note[9] = MediaPlayer.create(this, R.raw.scalefs);
        note[10] = MediaPlayer.create(this, R.raw.scaleg);
        note[11] = MediaPlayer.create(this, R.raw.scalegs);
        note[12] = MediaPlayer.create(this, R.raw.scalehigha);
        note[13] = MediaPlayer.create(this, R.raw.scalehighbb);
        note[14] = MediaPlayer.create(this, R.raw.scalehighb);
        note[15] = MediaPlayer.create(this, R.raw.scalehighc);
        note[16] = MediaPlayer.create(this, R.raw.scalehighcs);
        note[17] = MediaPlayer.create(this, R.raw.scalehighd);
        note[18] = MediaPlayer.create(this, R.raw.scalehighds);
        note[19] = MediaPlayer.create(this, R.raw.scalehighe);
        note[20] = MediaPlayer.create(this, R.raw.scalehighf);
        note[21] = MediaPlayer.create(this, R.raw.scalehighfs);
        note[22] = MediaPlayer.create(this, R.raw.scalehighg);
        note[23] = MediaPlayer.create(this, R.raw.scalehighgs);
    }


    private void colorButtons() {
        //colors sharps black and normal notes white
        asButton.setBackgroundColor(Color.BLACK);
        asButton.setTextColor(Color.WHITE);
        csButton.setBackgroundColor(Color.BLACK);
        csButton.setTextColor(Color.WHITE);
        dsButton.setBackgroundColor(Color.BLACK);
        dsButton.setTextColor(Color.WHITE);
        fsButton.setBackgroundColor(Color.BLACK);
        fsButton.setTextColor(Color.WHITE);
        gsButton.setBackgroundColor(Color.BLACK);
        gsButton.setTextColor(Color.WHITE);
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_a:
                note[12].seekTo(0); //restarts note to beginning
                note[12].start();
                break;
            case R.id.button_as:
                note[13].seekTo(0);
                note[13].start();
                break;
            case R.id.button_b:
                note[14].seekTo(0);
                note[14].start();
                break;
            case R.id.button_c:
                note[3].seekTo(0);
                note[3].start();
                break;
            case R.id.button_cs:
                note[4].seekTo(0);
                note[4].start();
                break;
            case R.id.button_d:
                note[5].seekTo(0);
                note[5].start();
                break;
            case R.id.button_ds:
                note[6].seekTo(0);
                note[6].start();
                break;
            case R.id.button_e:
                note[7].seekTo(0);
                note[7].start();
                break;
            case R.id.button_f:
                note[8].seekTo(0);
                note[8].start();
                break;
            case R.id.button_fs:
                note[9].seekTo(0);
                note[9].start();
                break;
            case R.id.button_g:
                note[10].seekTo(0);
                note[10].start();
                break;
            case R.id.button_gs:
                note[11].seekTo(0);
                note[11].start();
                break;
            case R.id.button_e_scale:
                try {
                    //play E, F#, G, A, B, C#, D, E
                    note[7].seekTo(0);
                    note[7].start();
                    delayPlaying(WHOLE_NOTE / 4);
                    note[9].seekTo(0);
                    note[9].start();
                    delayPlaying(WHOLE_NOTE / 4);
                    note[10].seekTo(0);
                    note[10].start();
                    delayPlaying(WHOLE_NOTE / 4);
                    note[12].seekTo(0);
                    note[12].start();
                    delayPlaying(WHOLE_NOTE / 4);
                    note[14].seekTo(0);
                    note[14].start();
                    delayPlaying(WHOLE_NOTE / 4);
                    note[16].seekTo(0);
                    note[16].start();
                    delayPlaying(WHOLE_NOTE / 4);
                    note[17].seekTo(0);
                    note[17].start();
                    delayPlaying(WHOLE_NOTE / 4);
                    note[19].seekTo(0);
                    note[19].start();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.button_play: //plays selected note, selected number of times
                try {
                    int noteIndex = noteNumberPicker.getValue();
                    for (int i = 0; i < numberOfTimesNumberPicker.getValue(); i++) {
                        note[noteIndex + 3].seekTo(0);
                        note[noteIndex + 3].start();
                        delayPlaying(WHOLE_NOTE / 2);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.button_twinkle: //plays twinkle twinkle little star
                playFirstLine();
                playSecondLine();
                playSecondLine();
                playFirstLine();
                break;
            case R.id.button_otj: //plays ode to joy
                try {
                    //E, E, F, G, G, F, E, D, C, C, D, E, E, D, D
                    int[] otj = {7, 7, 8, 10, 10, 8, 7, 5, 3, 3, 5, 7, 7, 5, 5};
                    int[] delay = {250, 500, 250, 250, 500, 500, 500, 250, 250, 500, 500, 250, 500, 250, 500};
                    for (int i = 0; i < 15; i++) {
                        note[otj[i]].seekTo(0);
                        note[otj[i]].start();
                        delayPlaying(delay[i]);
                    }

                    //E, E, F, G, G, F, E, D, C, C, D, E, D, C, C
                    int[] otj2 = {7, 7, 8, 10, 10, 8, 7, 5, 3, 3, 5, 7, 5, 3, 3};
                    int[] delay2 = {250, 500, 250, 250, 500, 500, 500, 250, 250, 500, 500, 500, 500, 250, 500};
                    for (int i = 0; i < 15; i++) {
                        note[otj2[i]].seekTo(0);
                        note[otj2[i]].start();
                        delayPlaying(delay2[i]);
                    }

                    //D, D, E, C, D, E-F, E, C, D, E-F, E, D, C, D
                    int[] otj3 = {5, 5, 7, 3, 7, 8, 7, 3, 5, 7, 8, 7, 5, 3, 5};
                    int[] delay3 = {250, 500, 250, 250, 500, 250, 250, 500, 500, 500, 250, 500, 500, 250, 500};
                    for (int i = 0; i < 15; i++) {
                        note[otj3[i]].seekTo(0);
                        note[otj3[i]].start();
                        delayPlaying(delay3[i]);
                    }

                    //E, E, F, G, G, F, E, D, C, C, D, E, D, C, C
                    int[] otj4 = {7, 7, 8, 10, 10, 8, 7, 5, 3, 3, 5, 7, 5, 3, 3};
                    int[] delay4 = {250, 500, 250, 250, 500, 500, 500, 250, 250, 500, 500, 500, 500, 250, 500};
                    for (int i = 0; i < 15; i++) {
                        note[otj4[i]].seekTo(0);
                        note[otj4[i]].start();
                        delayPlaying(delay4[i]);
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
            default:
                //the else statement
        }

    }

    private void playFirstLine() { //first line of twinkle twinkle
        try {
            //A, A, High E, High E, High F Sharp, High F Sharp, High E, D, D, C Sharp, C Sharp, B, B, A
            int[] twinkle = {0, 0, 19, 19, 21, 21, 19, 5, 5, 4, 4, 2, 2, 0};
            int[] delay = {250, 500, 250, 500, 250, 500, 1000, 250, 500, 250, 500, 250, 500, 250};
            for (int i = 0; i < 14; i++) {
                note[twinkle[i]].seekTo(0);
                note[twinkle[i]].start();
                delayPlaying(delay[i]);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void playSecondLine() { //second line of twinkle twinkle
        try {
            //High E, High E, D, D, C Sharp, C Sharp, B
            int[] twinkle = {19, 19, 5, 5, 4, 4, 2};
            int[] delay = {250, 500, 250, 500, 250, 500, 250};
            for (int i = 0; i < 7; i++) {
                note[twinkle[i]].seekTo(0);
                note[twinkle[i]].start();
                delayPlaying(delay[i]);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
