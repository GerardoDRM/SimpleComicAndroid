package doge.udlap.myapplication.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import doge.udlap.myapplication.R;
import doge.udlap.myapplication.model.Page;
import doge.udlap.myapplication.model.Story;


public class StoryActivity extends Activity {

    private Story mStory = new Story();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoice1;
    private Button mChoice2;
    private String name;
    private Page currentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        Intent i = getIntent();
        name = i.getStringExtra(getString(R.string.key_name));
        if(name == null) {
            name = "Hey mate";
        }

        mImageView = (ImageView) findViewById(R.id.storyImage);
        mTextView = (TextView) findViewById(R.id.story);
        mChoice1 = (Button) findViewById(R.id.choice1);
        mChoice2 = (Button) findViewById(R.id.choice2);

        loadPage(0);

    }

    private void loadPage(int index) {
        currentPage = mStory.getPage(index);
        Drawable drawable = getResources().getDrawable(currentPage.getmImageId());
        mImageView.setImageDrawable(drawable);

        String pageText = currentPage.getmText();
        pageText = String.format(pageText, name);
        mTextView.setText(pageText);

        if( currentPage.isFinal() ) {
            mChoice1.setVisibility(View.INVISIBLE);
            mChoice2.setText("PLAY AGAIN");
            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }else{
            mChoice1.setText(currentPage.getmChoice1().getmText());
            mChoice2.setText(currentPage.getmChoice1().getmText());

            mChoice1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = currentPage.getmChoice1().getmNextPage();
                    loadPage(nextPage);
                }
            });

            mChoice2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = currentPage.getmChoice2().getmNextPage();
                    loadPage(nextPage);
                }
            });
        }


    }

}
