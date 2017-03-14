package com.bbli.nikki.r2_plusminusmorph;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class MainActivity extends AppCompatActivity {
    boolean isChecked;
    @BindView(R.id.plusminus)
    ImageView plusMinusView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

        @OnClick(R.id.rootview)
        void onClick () {
             isChecked = !isChecked;
            final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
            plusMinusView.setImageState(stateSet, true);

        }
    }

