package doge.udlap.myapplication.model;

import doge.udlap.myapplication.R;

/**
 * Created by gerardo on 12/07/15.
 */
public class Story {
    private Page [] mPages;

    public Story() {
        mPages = new Page[7];

        mPages[0] = new Page(
                R.drawable.page0,
                "Heyyyy %1$s",
                new Choice("Stop and investigate", 1),
                new Choice("Continue home to Earth", 2)
        );
        mPages[1] = new Page(
                R.drawable.page1,
                "Heyyyy %1$s",
                new Choice("Stop and investigate", 3),
                new Choice("Continue home to Earth", 4)
        );
        mPages[2] = new Page(
                R.drawable.page2,
                "Heyyyy %1$s",
                new Choice("Stop and investigate", 4),
                new Choice("Continue home to Earth", 6)
        );
        mPages[3] = new Page(
                R.drawable.page3,
                "Heyyyy %1$s",
                new Choice("Stop and investigate", 4),
                new Choice("Continue home to Earth", 5)
        );
        mPages[4] = new Page(
                R.drawable.page4,
                "Heyyyy",
                new Choice("Stop and investigate", 5),
                new Choice("Continue home to Earth", 6)
        );
        mPages[5] = new Page(
                R.drawable.page5,
                "Heyyyy"

        );
        mPages[6] = new Page(
                R.drawable.page6,
                "Heyyyy"

        );
    }
    public Page getPage(int pageNumber) {
        return mPages[pageNumber];
    }
}
