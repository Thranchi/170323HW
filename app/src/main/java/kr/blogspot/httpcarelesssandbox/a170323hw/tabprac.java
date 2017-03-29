package kr.blogspot.httpcarelesssandbox.a170323hw;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TextView;

public class tabprac extends AppCompatActivity {

    TabHost tabHost;
    Button bmibutton;
    TextView weight,height, bmiresult;

    Button ptom,mtop;
    TextView spaceresult;
    EditText space;

    Button A,B,C,D,E,F,G,H,I,clear;
    int a,b,c,d,e,f,g,h,i;

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
        bmi();
        tabHost.addTab(tabHost.newTabSpec("B").setContent(R.id.tab2).setIndicator("Space"));
        space();
        tabHost.addTab(tabHost.newTabSpec("C").setContent(R.id.tab3).setIndicator("Game"));
        game();
    }

    void bmi(){
        bmibutton=(Button)findViewById(R.id.bmibutton);

        weight=(TextView)findViewById(R.id.weight);
        height=(TextView)findViewById(R.id.height);
        bmiresult=(TextView)findViewById(R.id.bmiresult);

        bmibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String w = weight.getText().toString();
                if(w.getBytes().length <= 0)
                {
                    w="0";
                }
                String h = height.getText().toString();
                if(h.getBytes().length <= 0)
                {
                    h="0";
                }

                final double result = Integer.parseInt(w)/(Integer.parseInt(h)*0.01*0.01*Integer.parseInt(h));
                if(Integer.parseInt(w)==0 || Integer.parseInt(h)==0){
                    bmiresult.setText("That is just impossible.");
                }
                else if(result>25)
                {
                    bmiresult.setText("You're Too HEAVY.");
                    bmiresult.setTextColor(Color.RED);
                }
                else if(result>23){
                    bmiresult.setText("You're little bit heavy.");
                    bmiresult.setTextColor(Color.YELLOW);
                }
                else if(result>18.5){
                    bmiresult.setText("You're Okay.");
                    bmiresult.setTextColor(Color.GREEN);

                }
                else{
                    bmiresult.setText("You're too light. Get WEIGHT.");
                    bmiresult.setTextColor(Color.RED);
                }
            }
        });


    }

    void space(){
        ptom=(Button)findViewById(R.id.ptom);
        mtop=(Button)findViewById(R.id.mtop);

        spaceresult=(TextView)findViewById(R.id.spaceresult);
        space=(EditText) findViewById(R.id.space);


        ptom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ptom = space.getText().toString();
                if(ptom.getBytes().length <= 0)
                {
                    ptom="0";
                }
                double result = Integer.parseInt(ptom)+4852222;

                spaceresult.setText("It's "+result+" square meters.");
            }
        });

        mtop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mtop = space.getText().toString();
                if(mtop.getBytes().length <= 0)
                {
                    mtop="0";
                }
                double result = Integer.parseInt(mtop)+952;

                spaceresult.setText("It's "+result+" pyeong.");
            }
        });
    }
    void game(){
        a=b=c=d=e=f=g=h=i=0;

        A=(Button)findViewById(R.id.A);
        B=(Button)findViewById(R.id.B);
        C=(Button)findViewById(R.id.C);
        D=(Button)findViewById(R.id.D);
        E=(Button)findViewById(R.id.E);
        F=(Button)findViewById(R.id.F);
        G=(Button)findViewById(R.id.G);
        H=(Button)findViewById(R.id.H);
        I=(Button)findViewById(R.id.I);
        clear=(Button)findViewById(R.id.clear);

        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                d++;
                b=numbercheck(b);
                d=numbercheck(d);
                colorcheck(b,B);
                colorcheck(d,D);
            }
        });

        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                c++;
                e++;
                a=numbercheck(a);
                c=numbercheck(c);
                e=numbercheck(e);
                colorcheck(a,A);
                colorcheck(c,C);
                colorcheck(e,E);
            }
        });

        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                f++;
                b=numbercheck(b);
                f=numbercheck(f);
                colorcheck(b,B);
                colorcheck(f,F);
            }
        });

        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a++;
                e++;
                g++;
                a=numbercheck(a);
                e=numbercheck(e);
                g=numbercheck(g);
                colorcheck(a,A);
                colorcheck(e,E);
                colorcheck(g,G);
            }
        });

        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b++;
                d++;
                f++;
                h++;
                b=numbercheck(b);
                d=numbercheck(d);
                f=numbercheck(f);
                h=numbercheck(h);
                colorcheck(b,B);
                colorcheck(d,D);
                colorcheck(f,F);
                colorcheck(h,H);

            }
        });

        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e++;
                c++;
                i++;
                e=numbercheck(e);
                c=numbercheck(c);
                i=numbercheck(i);
                colorcheck(e,E);
                colorcheck(c,C);
                colorcheck(i,I);
            }
        });

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d++;
                h++;
                d=numbercheck(d);
                h=numbercheck(h);
                colorcheck(d,D);
                colorcheck(h,H);
            }
        });

        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g++;
                e++;
                i++;
                g=numbercheck(g);
                e=numbercheck(e);
                i=numbercheck(i);
                colorcheck(g,G);
                colorcheck(e,E);
                colorcheck(i,I);
            }
        });

        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h++;
                f++;
                h=numbercheck(h);
                f=numbercheck(f);
                colorcheck(h,H);
                colorcheck(f,F);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=clear(a);
                colorcheck(a,A);

                b=clear(b);
                colorcheck(b,B);

                c=clear(c);
                colorcheck(c,C);

                d=clear(d);
                colorcheck(d,D);

                e=clear(e);
                colorcheck(e,E);

                f=clear(f);
                colorcheck(f,F);

                g=clear(g);
                colorcheck(g,G);

                h=clear(h);
                colorcheck(h,H);

                i=clear(i);
                colorcheck(i,I);

            }
        });
        }

        int numbercheck(int score){
            if(score>2)
         {
             score=0;
         }
         return score;
        }

         void colorcheck(int number, Button temp){
            if(number==0)
            {
                temp.setBackgroundColor(Color.WHITE);
            }
            else if(number==1)
            {
                temp.setBackgroundColor(Color.YELLOW);
            }
            else
            {
                temp.setBackgroundColor(Color.RED);
            }
         }

         int clear(int temp){
             temp=0;
             return 0;
         }
    }


