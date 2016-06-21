package com.example.nikeru8.app_simpleadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    private MainActivity context;
    private TextView textView1;
    private TextView textView2;
    private ListView listView;
    private SimpleAdapter adapter;




    //這邊很容易出錯要注意
    private List<Map<String, Object>> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findID();
start();

    }


    public void findID() {

        context = this;
        listView = (ListView) findViewById(R.id.listView1);
        textView1 = (TextView) findViewById(R.id.textView11);
        textView2 = (TextView) findViewById(R.id.textView22);

    }



    public void start() {

        //步驟一 先創建MAP
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name", "大麥克");
        map1.put("price", 80);
        map1.put("imageID", R.drawable.big_mac);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("name", "大薯條");
        map2.put("price", 50);
        map2.put("imageID", R.drawable.french_fries_big);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("name", "可樂");
        map3.put("price", 35);
        map3.put("imageID", R.drawable.coca_cola);

        Map<String, Object> map4 = new HashMap<>();
        map4.put("name", "咖啡");
        map4.put("price", 35);
        map4.put("imageID", R.drawable.iced_coffee);

        Map<String, Object> map5 = new HashMap<>();
        map5.put("name", "雙層牛肉堡");
        map5.put("price", 35);
        map5.put("imageID", R.drawable.pounder_cheese);

        Map<String, Object> map6 = new HashMap<>();
        map6.put("name", "麥香魚");
        map6.put("price", 35);
        map6.put("imageID", R.drawable.fish);

        Map<String, Object> map7 = new HashMap<>();
        map7.put("name", "蘋果派");
        map7.put("price", 35);
        map7.put("imageID", R.drawable.apple_pie);

        //步驟二，list 放入Map
        list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);
        list.add(map5);
        list.add(map6);
        list.add(map7);


        //步驟三 創建一個adapter
        adapter = new SimpleAdapter(
                context, list, R.layout.item
                , new String[]{"name", "price", "imageID"}
                , new int[]{R.id.textView11, R.id.textView22, R.id.imageView}
        );


        //ListView 設定進去
        listView.setAdapter(adapter);
    }



}