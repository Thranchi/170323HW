package kr.blogspot.httpcarelesssandbox.a170323hw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TabHost;

public class taphostprac extends AppCompatActivity {

    TabHost tabHost;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taphostprac);
        setTitle("TabHostPractice");
        tab();
    }

    void tab(){
        tabHost=(TabHost)findViewById(R.id.th1);
        tabHost.setup();

        tabHost.addTab(tabHost.newTabSpec("A").setContent(R.id.tab1).setIndicator("BMI"));
        tabHost.addTab(tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("Floor Space"));
        tabHost.addTab(tabHost.newTabSpec("C").setContent(R.id.tab3).setIndicator("N BBANG"));
    }
    void bmi(){

    }
}
