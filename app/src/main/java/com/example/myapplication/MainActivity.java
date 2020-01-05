//package com.example.myapplication;
//
//import android.os.Bundle;
//import android.util.Base64;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.lang.reflect.Array;
//import java.nio.charset.Charset;
//import java.util.Arrays;
//
//
//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        byte[] b = new byte[14];
//        b[0] = 8;
//        b[1] = -6;
//        b[2] = -5;
//        b[3] = -9;
//        b[4] = -124;
//        b[5] = 13;
//        b[6] = 16;
//        b[7] = -50;
//        b[8] = -32;
//        b[9] = -100;
//        b[10] = -108;
//        b[11] = 14;
//        b[12] = 24;
//        b[13] = 1;
//
//        System.out.println("-----");
//        System.out.println(Arrays.toString(b));
//
//        String s= new String(b, Charset.forName("UTF8"));
//        System.out.println("-----");
//        System.out.println(s);
//        System.out.println(Arrays.toString(s.getBytes(Charset.forName("UTF8"))));
//
//        String s2 = Base64.encodeToString(b,  Base64.DEFAULT);
//        System.out.println("-----2");
//        System.out.println(s2);
//        System.out.println(Arrays.toString(Base64.decode(s2, Base64.DEFAULT)));
//    }
////    override fun onCreate(savedInstanceState:Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_main)
////    }
//}
