package com.mshoaibluqman.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView storyTextView;
    Button buttonTop, buttonBottom;
    int storyIndex;
    String userSelection;
    String trackStory;

    StoryData[] storyDatas = new StoryData[]{
            new StoryData(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryData(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryData(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);


        storyTextView.setText(storyDatas[storyIndex].getStory());
        buttonTop.setText(storyDatas[storyIndex].getAns_1());
        buttonBottom.setText(storyDatas[storyIndex].getAns_2());


        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                topButtonChangeStory();

                userSelection = buttonTop.getText().toString();

                trackStory = storyTextView.getText().toString();


            }
        });


        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (storyIndex == 1) {

                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.GONE);
                    buttonBottom.setVisibility(View.GONE);

                } else {


                    userSelection = buttonBottom.getText().toString();

                    bottomButtonChangeStory();
                }

            }
        });


    }


    private void topButtonChangeStory() {


        if (storyIndex == 1) {
            storyIndex = storyIndex + 1;
        } else {
            storyIndex = storyIndex + 1;
        }

        if (storyIndex < storyDatas.length) {

            storyTextView.setText(storyDatas[storyIndex].getStory());
            buttonTop.setText(storyDatas[storyIndex].getAns_1());
            buttonBottom.setText(storyDatas[storyIndex].getAns_2());
        } else {


            checkForStoryEnd();

        }


    }


    private void bottomButtonChangeStory() {


        storyIndex = storyIndex + 1;

        Toast.makeText(this, "Clicked" + storyIndex, Toast.LENGTH_LONG).show();

        if (storyIndex < storyDatas.length) {


            storyTextView.setText(storyDatas[storyIndex].getStory());
            buttonTop.setText(storyDatas[storyIndex].getAns_1());
            buttonBottom.setText(storyDatas[storyIndex].getAns_2());
        } else {

            checkForStoryEnd();
        }

    }


    private void checkForStoryEnd() {


        if (userSelection == buttonTop.getText().toString()) {
            storyTextView.setText(R.string.T6_End);
        } else if (userSelection == buttonBottom.getText().toString()) {
            storyTextView.setText(R.string.T5_End);
        }

        buttonTop.setVisibility(View.GONE);
        buttonBottom.setVisibility(View.GONE);

    }


}
