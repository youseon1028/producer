package com.example.producer;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    MainActivity mainActivity;

    private TextView tv_id, tv_pass, tv_name, tv_age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        tv_id = findViewById(R.id.tv_id);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");

        tv_id.setText(userID);

        //프래그먼트 생성
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        //bottomnavigationview의 아이콘을 선택 했을때 원하는 프래그먼트가 띄워질 수 있도록 리스너를 추가.
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    //menu_bottom.xml에서 지정해줬던 아이디 값을 받아와서 각 아이디값마다 다른 이벤트를 발생시킵니다.
                    case R.id.tab1:{
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout,fragment1).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.tab2:{
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout,fragment2).commitAllowingStateLoss();
                        return true;
                    }

                    case R.id.tab3:{
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.main_layout,fragment3).commitAllowingStateLoss();
                        return true;
                    }

                    default: return false;
                }
            }
        });
    }
}


