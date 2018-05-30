package com.example.module4and5hw;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Phone> phones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        init();

        recyclerView.setAdapter(new PhonesAdapter(getApplicationContext(), phones));
    }

    private void init() {
        phones = new ArrayList<>();

        Phone IphoneX = new Phone();
        IphoneX.setTitle("Apple IPhone X");
        IphoneX.setPoster(R.drawable.iphonex);

        Phone Iphone8 = new Phone();
        Iphone8.setTitle("Apple IPhone 8");
        Iphone8.setPoster(R.drawable.iphone8);

        Phone Iphone7 = new Phone();
        Iphone7.setTitle("Apple IPhone 7");
        Iphone7.setPoster(R.drawable.iphone7);

        Phone Iphone6 = new Phone();
        Iphone6.setTitle("Apple IPhone 6");
        Iphone6.setPoster(R.drawable.iphone6);

        phones.add(IphoneX);
        phones.add(Iphone8);
        phones.add(Iphone7);
        phones.add(Iphone6);
    }
}
