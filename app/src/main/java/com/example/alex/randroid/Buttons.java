package com.example.alex.randroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

/**
 * Created by Eric on 11/01/2015.
 *
 * This class is for getting button clicks, slider data, and progress bar data.
 *
 * This is an unfinished class that does not work yet. It has tons of errors and will not compile
 * at the moment. I am submitting it anyway since more eyes usually means fewer bugs.
 *
 * I would like to split this class into other classes to make Randrdoid more modular.
 *
 * The concept UI is ready. I am going to go upload that to the course forum now.
 */
public class Buttons extends Activity {

    private static String logTag = "Randroid";

    @Override
    public void setContentView(Bundle savedInstanceState) {

        /* Creates settings buttons */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        addListenerOnButton();

        /* Creates settings buttons */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_mode);
        addListenerOnButton();

        /* Creates choose output buttons. */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_output);
        addListenerOnButton();

        /* Creates choose quality buttons. */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_quality);
        addListenerOnButton();

        /* Should create download limit slider, but does not yet. */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.download_limit);
        addListenerOnButton(); /* This needs to listen for a slider, not a button. */

        /* Creates downloading progress bar. */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.downloading);
        addListenerOnButton();

    }

    public void addListenerOnButton() {
/* I may change this to an if else blocks style later on. Switch statements may not work with the
 * Android library. For now, I am going to stick with the style that the developer.android.com
 * site uses on the Buttons page. - Eric 11/01/2015
 *
 * intent has not been created yet.
 *
 * Many methods have not been created yet.
 */
        /* Button declarations and definitions for settings. */
        Button choose_drive = (Button)findViewById(R.id.choose_drive);
        buttonStart.setOnClickListener(startListener);
        choose_drive.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openBrowser =
                new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://drive.google.com/drive/#folders/0ByiYkITUCkieMUEyeVpYQzEtRDA"));
                startActivity(openBrowser);
            }
        });
        Button choose_download_directory = (Button)findViewById(R.id.choose_download_directory);
        buttonStart.setOnClickListener(stopListener);
        choose_download_directory.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse("usr/bin/Downloads"));
                startActivity(openDirectory); /* Method has not been created yet */
            }
        });
        Button choose_download_limit = (Button)findViewById(R.id.choose_download_limit);
        buttonStart.setOnClickListener(stopListener);
        choose_download_limit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                startActivity(setMax);/* Method has not been created yet/ */
            }
        });
        Button start_conversion = (Button)findViewById(R.id.start_conversion);
        buttonStart.setOnClickListener(stopListener);
        start_conversion.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                convertFiles();/* Method has not been created yet. */
            }
        });

        /* Button declarations and definitions for choose mode. */
        Button button_auto = (Button)findViewById(R.id.button_auto);
        buttonStart.setOnClickListener(startListener);
        button_auto.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                convertFiles(); /* Yet to be created method. */
                downloadFiles(); /* Yet to be created method. */

            }
        });
        Button button_manual= (Button)findViewById(R.id.button_manual);
        buttonStart.setOnClickListener(startListener);
        button_manual.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://drive.google.com/drive/#folders/0ByiYkITUCkieMUEyeVpYQzEtRDA"));
                startActivity(openBrowser);
                convertFiles(); /* Yet to be created method. */
                downloadFiles(); /* Yet to be created method. */

            }
        });

        /* Button declaration for choose output format. */
        Button JPG = (Button)findViewById(R.id.JPG);
        buttonStart.setOnClickListener(startListener);
        JPG.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent =
                    new Intent(Intent.ACTION_VIEW,
                            Uri.parse(""));
            convertFiles(); /* Yet to be created method. */
           }
        });
        Button PNG = (Button)findViewById(R.id.PNG);
        buttonStart.setOnClickListener(startListener);
        PNG.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                convertFiles(); /* Yet to be created method. */
            }
        });

        /* Button declarations and definitions to choose quality. */
        Button high_quality = (Button)findViewById(R.id.high_quality);
        buttonStart.setOnClickListener(startListener);
        high_quality.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                useHighQuality(); /* Yet to be created method. */
            }
        });
        Button medium_quality = (Button)findViewById(R.id.medium_quality);
        buttonStart.setOnClickListener(startListener);
        medium_quality.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
               useMediumQuality(); /* Yet to be created method. */
            }
        });
        Button low_quality = (Button)findViewById(R.id.low_quality);
        buttonStart.setOnClickListener(startListener);
        low_quality.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                useLowQuality(); /* Yet to be created method. */
            }
        });

        /* Button and SeekBar declarations and definitions for the download limit. */
        Button unlimited = (Button)findViewById(R.id.unlimited);
        max_slider.setOnClickListener(startListener);
        unlimited.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                max(false); /* Yet to be created method. */
            }
        });

        /* Progress bar declaration for downloading. */
        ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
        ProgressBarStart.setOnClickListener(startListener);
        progressBar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =
                        new Intent(Intent.ACTION_VIEW,
                                Uri.parse(""));
                getProgress(); /* Yet to be created method. */
            }
        });
    }

}
