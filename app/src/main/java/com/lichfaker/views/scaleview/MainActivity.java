package com.lichfaker.views.scaleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.lichfaker.scaleview.HorizontalScaleScrollView;
import com.lichfaker.scaleview.VerticalScaleScrollView;

public class MainActivity extends AppCompatActivity {

    TextView mTvHorizontalScale;
    TextView mTvVerticalScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTvHorizontalScale = (TextView) findViewById(R.id.horizontalScaleValue);

        HorizontalScaleScrollView scaleScrollView = (HorizontalScaleScrollView) findViewById(R.id.horizontalScale);
        scaleScrollView.setOnScrollListener(new HorizontalScaleScrollView.OnScrollListener() {
            @Override
            public void onScaleScroll(int scale) {
                mTvHorizontalScale.setText("" + scale);
            }
        });

        mTvVerticalScale = (TextView) findViewById(R.id.verticalScaleValue);

        VerticalScaleScrollView vScaleScrollView = (VerticalScaleScrollView) findViewById(R.id.verticalScale);
        vScaleScrollView.setOnScrollListener(new HorizontalScaleScrollView.OnScrollListener() {
            @Override
            public void onScaleScroll(int scale) {
                mTvVerticalScale.setText("" + scale);
            }
        });
    }
}
