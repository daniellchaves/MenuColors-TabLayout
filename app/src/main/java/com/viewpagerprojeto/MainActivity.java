package com.viewpagerprojeto;

import android.content.res.Resources;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentDanielAdapter adapter = new FragmentDanielAdapter(getSupportFragmentManager());

        Resources resources = getResources();


        Fragment_blue fb = new Fragment_blue();
        String Stitch = resources.getString(R.string.frag_one);
        adapter.add(fb, Stitch);

        Fragment_red fr = new Fragment_red();
        String Zezé = resources.getString(R.string.frag_two);
        adapter.add(fr, Zezé);

        Fragment_green fg = new Fragment_green();
        String Mike = resources.getString(R.string.frag_three);
        adapter.add(fg, Mike);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setClipToPadding(false);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
