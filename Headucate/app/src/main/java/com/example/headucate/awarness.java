package com.example.headucate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.viewpagerindicator.CirclePageIndicator;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class awarness extends AppCompatActivity {
    private static ViewPager mPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;
    private ArrayList<ImageModel> imageModelArrayList;

    private int[] myImageList = new int[]{R.drawable.one, R.drawable.two,
            R.drawable.three, R.drawable.four
            , R.drawable.five, R.drawable.six};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awarness);
        setTitle("الوقاية");
        imageModelArrayList = new ArrayList<>();
        imageModelArrayList = populateList();
        init();
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()) {
            case R.id.item1:
                goToUrl("https://mawdoo3.com/%D9%81%D9%88%D8%A7%D8%A6%D8%AF_%D8%A7%D9%84%D8%B1%D9%8A%D8%A7%D8%B6%D8%A9_%D9%84%D9%84%D8%AC%D8%B3%D9%85_%D9%88%D8%A7%D9%84%D8%B9%D9%82%D9%84");
                return true;
            case R.id.item2:
                goToUrl("https://mawdoo3.com/%D9%86%D8%B5%D8%A7%D8%A6%D8%AD_%D9%81%D9%8A_%D8%A7%D9%84%D8%AA%D8%BA%D8%B0%D9%8A%D8%A9");
                return true;
            case R.id.item3:
                goToUrl("https://mawdoo3.com/%D9%85%D8%A7_%D9%87%D9%8A_%D9%81%D9%88%D8%A7%D8%A6%D8%AF_%D8%A7%D9%84%D9%86%D9%88%D9%85");
                return true;
            case R.id.item4:
                goToUrl("https://mawdoo3.com/%D9%85%D8%A7_%D8%A3%D9%87%D9%85%D9%8A%D8%A9_%D8%A7%D9%84%D9%86%D8%B8%D8%A7%D9%81%D8%A9");
                return true;
            case R.id.item5:
                goToUrl("https://mawdoo3.com/%D8%A7%D9%84%D8%B9%D9%86%D8%A7%D9%8A%D8%A9_%D8%A8%D8%A7%D9%84%D8%B7%D9%81%D9%84_%D8%AD%D8%AF%D9%8A%D8%AB_%D8%A7%D9%84%D9%88%D9%84%D8%A7%D8%AF%D8%A9");
                return true;
            case R.id.item6:
                goToUrl("https://mawdoo3.com/%D8%A7%D9%84%D9%88%D9%82%D8%A7%D9%8A%D8%A9_%D9%85%D9%86_%D8%A7%D9%84%D8%A3%D9%85%D8%B1%D8%A7%D8%B6");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    private ArrayList<ImageModel> populateList() {

        ArrayList<ImageModel> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            ImageModel imageModel = new ImageModel();
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;
    }

    private void init() {

        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(awarness.this, imageModelArrayList));

        CirclePageIndicator indicator = (CirclePageIndicator)
                findViewById(R.id.indicator);

        indicator.setViewPager(mPager);

        final float density = getResources().getDisplayMetrics().density;

//Set circle indicator radius
        indicator.setRadius(5 * density);

        NUM_PAGES = imageModelArrayList.size();

        // Auto start of viewpager
        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == NUM_PAGES) {
                    currentPage = 0;
                }
                mPager.setCurrentItem(currentPage++, true);
            }
        };
        Timer swipeTimer = new Timer();
        swipeTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(Update);
            }
        }, 3000, 3000);

        // Pager listener over indicator
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int position) {
                currentPage = position;

            }

            @Override
            public void onPageScrolled(int pos, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int pos) {

            }
        });

    }

}