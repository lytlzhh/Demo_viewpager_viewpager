package com.example.llw.demo_viewpager_viewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout linearlayoutOneId;
    private Button btnAddUser;
    private ViewPager viewpagerId;
    private LinearLayout linearlayoutId;
    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;

    private Fg1 fg1;
    private Fg2 fg2;
    private Fg3 fg3;
    private Fg4 fg4;


    private Myviewpagerapdater myviewpagerapdater;

    private ArrayList<Fragment> list;

    private void assignViews() {
        linearlayoutOneId = (LinearLayout) findViewById(R.id.linearlayout_one_id);
        btnAddUser = (Button) findViewById(R.id.btn_add_user);
        viewpagerId = (ViewPager) findViewById(R.id.viewpager_id);
        linearlayoutId = (LinearLayout) findViewById(R.id.linearlayout_id);
        btnOne = (Button) findViewById(R.id.btn_one);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnThree = (Button) findViewById(R.id.btn_three);
        btnFour = (Button) findViewById(R.id.btn_four);

        btnAddUser.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        initviewpager();
    }


    public void initviewpager() {
        list = new ArrayList<>();
        fg1 = new Fg1(this);
        fg2 = new Fg2(this);
        fg3 = new Fg3(this);
        fg4 = new Fg4(this);

        list.add(fg1);
        list.add(fg2);
        list.add(fg3);
        list.add(fg4);
        Myviewpagerapdater myviewpagerapdater = new Myviewpagerapdater(getSupportFragmentManager(), list);
        viewpagerId.setAdapter(myviewpagerapdater);

    }


    public static class Myviewpagerapdater extends FragmentPagerAdapter {

        private ArrayList<Fragment> list;

        public Myviewpagerapdater(FragmentManager fm, ArrayList<Fragment> list) {
            super(fm);
            this.list = list;
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return 4;
        }

     /*   @Override
        public Object instantiateItem(ViewGroup container, int position) {
            return super.instantiateItem(container, position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            super.destroyItem(container, position, object);
        }*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add_user:

                break;
            case R.id.btn_one:
                viewpagerId.setCurrentItem(0);
                break;
            case R.id.btn_two:
                viewpagerId.setCurrentItem(1);
                break;
            case R.id.btn_three:
                viewpagerId.setCurrentItem(2);
                break;
            case R.id.btn_four:
                viewpagerId.setCurrentItem(3);
                break;
        }
    }


}
