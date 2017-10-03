package com.mshoaibluqman.destini;

/**
 * Created by muhammadirfan on 30/09/2017.
 */

public class StoryData {

    int Story;
    int ans_1;
    int ans_2;

    public StoryData(int story, int ans_1, int ans_2){

        this.Story = story;
        this.ans_1 = ans_1;
        this.ans_2 = ans_2;
    }

    public int getStory() {
        return Story;
    }

    public void setStory(int story) {
        Story = story;
    }

    public int getAns_1() {
        return ans_1;
    }

    public void setAns_1(int ans_1) {
        this.ans_1 = ans_1;
    }

    public int getAns_2() {
        return ans_2;
    }

    public void setAns_2(int ans_2) {
        this.ans_2 = ans_2;
    }
}
