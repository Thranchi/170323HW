package kr.blogspot.httpcarelesssandbox.a170323hw;

import android.graphics.Color;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class menuprac extends AppCompatActivity {

    TextView text;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprac);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        final RelativeLayout bg = (RelativeLayout) findViewById(R.id.backg);
        image = (ImageView)findViewById(R.id.image);
        text = (TextView)findViewById(R.id.textView);

        //배경색바꾸기
        if(item.getItemId()==R.id.redrize)
        {
            colorch(1);
        }
        else if(item.getItemId()==R.id.blurize)
        {
            colorch(2);
        }
        else if(item.getItemId()==R.id.yellorize)
        {
            colorch(3);
        }

        //회전시키기기
       else if(item.getItemId()==R.id.rotate) {
            image.setRotation(30);
        }

        //제목보이기
        else if(item.getItemId()==R.id.info){
            if(infocont(item.isChecked()))
                item.setChecked(true);
            else
                item.setChecked(false);
        }

        //확대시키기
        else if(item.getItemId()==R.id.enlarge){
            if(imageenlarge(item.isChecked())){
                item.setChecked(true);
            }
            else
                item.setChecked(false);
        }

        //치킨
        else if(item.getItemId()==R.id.chicken){
            image.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.chicken);
            item.setChecked(true);
            info(1);
        }

        //파스타
        else if(item.getItemId()==R.id.pasta){
            image.setVisibility(View.VISIBLE);
            image.setImageResource(R.drawable.pasta);
            item.setChecked(true);
            info(0);
        }
        return super.onOptionsItemSelected(item);
    }
    private void colorch(int a){
        final RelativeLayout bg = (RelativeLayout) findViewById(R.id.backg);

        if(a==1)
        {
            bg.setBackgroundColor(Color.RED);
        }
        else if(a==2)
        {
            bg.setBackgroundColor(Color.BLUE);
        }
        else if(a==3)
        {
            bg.setBackgroundColor(Color.YELLOW);
        }
    }

    private void info(int status){
        if(status==1)
        {
            text.setText("Assssssssssome Chicken");
        }
        else if(status==0)
        {
            text.setText("Wierd Pasta");
        }
    }

    private boolean imageenlarge(boolean ch){

        if(ch)//체크되어있으면 커져있으니 작게해준다
        {

            image.setScaleX((float) 0.7);
            image.setScaleY((float) 0.7);
            return false;
        }
        else
        {
            image.setScaleX((float) 1.4);
            image.setScaleY((float) 1.4);
            return true;

            //scalex이라는게 있다
        }
    }

    private boolean infocont(boolean ch){
        if(ch)//체크되어있으면 커져있으니 없애준다
        {
            text.setVisibility(View.GONE);
            return false;
        }
        else
        {
            text.setVisibility(View.VISIBLE);
            return true;
        }
    }

}
