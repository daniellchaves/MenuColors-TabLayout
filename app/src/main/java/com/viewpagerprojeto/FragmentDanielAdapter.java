package com.viewpagerprojeto;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentDanielAdapter extends FragmentStatePagerAdapter {

    List<Fragment> lista;
    List<String> listFragmentsTitle;

    public FragmentDanielAdapter (FragmentManager fm) {
        super(fm);
        lista = new ArrayList<>();
        listFragmentsTitle = new ArrayList<>();
    }

    public void add(Fragment frag, String title){
        this.lista.add(frag);
        this.listFragmentsTitle.add(title);
    }

    @Override
    public Fragment getItem(int i) {
        return lista.get(i);
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return listFragmentsTitle.get(position);
    }
}
