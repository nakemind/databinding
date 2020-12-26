package com.example.nestedscrollview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {
    MyRecyclerViewAdapter adapter;
    private ArrayAdapter<String> listAdapter ;
    NestedScrollView scrollView;
    final static String TAG="akui";
    RecyclerView recyclerView;
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recycler_view);
        scrollView = findViewById(R.id.nested_view);

        // data to populate the RecyclerView with
        ArrayList<String> animalNames = new ArrayList<>();
        for(int i=0;i<6;i++) {
            animalNames.add("Horse");
            animalNames.add("Cow");
            animalNames.add("Camel");
            animalNames.add("Sheep");
            animalNames.add("Goat");

        }


        final Rect scrollBounds = new Rect();
        scrollView.getHitRect(scrollBounds);
        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                int positionToScroll;
                LinearLayoutCompat viewss=(LinearLayoutCompat)scrollView.getChildAt(0);
                for (int i = 0; i < viewss.getChildCount(); i++) {
                    View childView = viewss.getChildAt(i);
                    if (childView != null) {
                        if (childView.getLocalVisibleRect(scrollBounds)) {
                            //Here is the position of first visible view
                            positionToScroll = i;
                            Log.d("akui",i+"");

                            LinearLayoutManager mager =(LinearLayoutManager)(recyclerView.getLayoutManager());
                            Log.d("akui",mager.findFirstVisibleItemPosition()+"findFirstVisibleItemPosition");
                            break;
                        }
                    }
                }
            }
        });

       /* scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if (scrollY > oldScrollY) {//向下滚动
                    Log.i(TAG, "Scroll DOWN");
                }
                if (scrollY < oldScrollY) {//向上滚动
                    Log.i(TAG, "Scroll UP");
                }

                if (scrollY == 0) {// 滚动到顶
                    Log.i(TAG, "TOP SCROLL");
                }
                // 滚动到底
                if (scrollY == (v.getChildAt(0).getMeasuredHeight() - v.getMeasuredHeight())) {
                    Log.i(TAG, "BOTTOM SCROLL");
                }

                //判断某个控件是否可见
                Rect scrollBounds = new Rect();
                scrollView.getHitRect(scrollBounds);
                if (scrollView.getLocalVisibleRect(scrollBounds)) {//可见
                    Log.e(TAG, "onScrollChange:  第3个可见" );
                }else {//完全不可见
                    Log.e(TAG, "onScrollChange:  第3个不可见" );
                }

            }
        });*/
        // set up the RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, animalNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

        // Create and populate a List of planet names.
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.addAll( Arrays.asList(planets) );

       /* listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, planetList);
        listAdapter.add( "Ceres" );
        listAdapter.add( "Pluto" );
        listAdapter.add( "Haumea" );
        listAdapter.add( "Makemake" );
        listAdapter.add( "Eris" );

        // Set the ArrayAdapter as the ListView's adapter.
        recyclerView.setAdapter( listAdapter );*/

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                Log.d("akui",""+dx+"   "+dy);
                LinearLayoutManager mager =(LinearLayoutManager)(recyclerView.getLayoutManager());
                Log.d("akui",mager.findFirstVisibleItemPosition()+"findFirstVisibleItemPosition");

                //int pos=mager.findFirstVisibleItemPosition();
            }
        });


    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();

    }
}