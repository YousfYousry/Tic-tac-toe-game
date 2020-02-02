package com.example.yousf.tictacgamemadebyyoussef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import java.util.Random;


import static java.lang.Thread.sleep;


public class MainActivity extends AppCompatActivity {
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    int[] arr_com={0,1,2,3,4,5,6,7,8,9};
    int choice;
    int rand;
    boolean xturn=true;
    boolean single;
    boolean game_started=false;

    public void single(View view){
          if(!game_started) {
              int i=0;
              reset();
              xturn =true;
              single = true;
              choice =0;
              for(int x=0;x<3;x++){
                  for(int y=0;y<3;y++){
                      arr[x][y]=i+1;
                      arr_com[i]=i;
                      i++;
                  }
              }
              arr_com[i]=i;
              game_started = true;
              Button formLayout = (Button) findViewById(R.id.button);
              formLayout.animate().alpha(0).translationY(800f);
              Button formLayout2 = (Button) findViewById(R.id.button2);
              formLayout2.animate().alpha(0).translationY(800f);
              GridLayout lay = (GridLayout) findViewById(R.id.grid);
              lay.animate().alpha(1);
          }
    }
    public void multi(View view){
        if(!game_started) {
            reset();
            int i=0;
            single = false;
            game_started = true;
            choice =0;
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    arr[x][y]=i+1;
                    arr_com[i]=i;
                    i++;
                }
            }
            arr_com[i]=i;
            Button formLayout = (Button)findViewById(R.id.button);
            formLayout.animate().alpha(0).translationY(800f);
            Button formLayout2 = (Button)findViewById(R.id.button2);
            formLayout2.animate().alpha(0).translationY(800f);
            GridLayout lay = (GridLayout) findViewById(R.id.grid);
            lay.animate().alpha(1);
        }
    }

    public void wonfunc(){
        int i=1;
        single = false;
        game_started=false;
        Button formLayout = (Button)findViewById(R.id.button);
        formLayout.animate().alpha(1).translationY(0f);
        Button formLayout2 = (Button)findViewById(R.id.button2);
        formLayout2.animate().alpha(1).translationY(0f);
    }
    public void reset(){
        GridLayout lay = (GridLayout) findViewById(R.id.grid);
        lay.animate().alpha(0);
        ImageView l1 = (ImageView) findViewById(R.id.l1);
        l1.animate().alpha(0f).setDuration(70);
        ImageView l2 = (ImageView) findViewById(R.id.l2);
        l2.animate().alpha(0f).setDuration(70);
        ImageView l3 = (ImageView) findViewById(R.id.l3);
        l3.animate().alpha(0f).setDuration(70);
        ImageView l4 = (ImageView) findViewById(R.id.l4);
        l4.animate().alpha(0f).setDuration(70);
        ImageView l5 = (ImageView) findViewById(R.id.l5);
        l5.animate().alpha(0f).setDuration(70);
        ImageView l6 = (ImageView) findViewById(R.id.l6);
        l6.animate().alpha(0f).setDuration(70);
        ImageView l7 = (ImageView) findViewById(R.id.l7);
        l7.animate().alpha(0f).setDuration(70);
        ImageView l8 = (ImageView) findViewById(R.id.l8);
        l8.animate().alpha(0f).setDuration(70);


        ImageView x = (ImageView) findViewById(R.id.imageView1);
        ImageView o = (ImageView) findViewById(R.id.image1);
        x.animate().alpha(0f).setDuration(70);
        o.animate().alpha(0f).setDuration(70);

        ImageView x2 = (ImageView) findViewById(R.id.imageView2);
        ImageView o2 = (ImageView) findViewById(R.id.image2);
        x2.animate().alpha(0f).setDuration(70);
        o2.animate().alpha(0f).setDuration(70);

        ImageView x3 = (ImageView) findViewById(R.id.imageView3);
        ImageView o3 = (ImageView) findViewById(R.id.image3);
        x3.animate().alpha(0f).setDuration(70);
        o3.animate().alpha(0f).setDuration(70);

        ImageView x4 = (ImageView) findViewById(R.id.imageView4);
        ImageView o4 = (ImageView) findViewById(R.id.image4);
        x4.animate().alpha(0f).setDuration(70);
        o4.animate().alpha(0f).setDuration(70);

        ImageView x5 = (ImageView) findViewById(R.id.imageView5);
        ImageView o5 = (ImageView) findViewById(R.id.image5);
        x5.animate().alpha(0f).setDuration(70);
        o5.animate().alpha(0f).setDuration(70);

        ImageView x6 = (ImageView) findViewById(R.id.imageView6);
        ImageView o6 = (ImageView) findViewById(R.id.image6);
        x6.animate().alpha(0f).setDuration(70);
        o6.animate().alpha(0f).setDuration(70);

        ImageView x7 = (ImageView) findViewById(R.id.imageView7);
        ImageView o7 = (ImageView) findViewById(R.id.image7);
        x7.animate().alpha(0f).setDuration(70);
        o7.animate().alpha(0f).setDuration(70);

        ImageView x8 = (ImageView) findViewById(R.id.imageView8);
        ImageView o8 = (ImageView) findViewById(R.id.image8);
        x8.animate().alpha(0f).setDuration(70);
        o8.animate().alpha(0f).setDuration(70);

        ImageView x9 = (ImageView) findViewById(R.id.imageView9);
        ImageView o9 = (ImageView) findViewById(R.id.image9);
        x9.animate().alpha(0f).setDuration(70);
        o9.animate().alpha(0f).setDuration(70);

    }

    public boolean winCheckerX(){
        int x=0,y=0;

        if(arr[0][0]==arr[0][1]&&arr[0][1]==arr[0][2]){
            ImageView l1 = (ImageView) findViewById(R.id.l1);
            l1.animate().alpha(1f).setDuration(70);
            return true;
        }
        if(arr[1][0]==arr[1][1]&&arr[1][1]==arr[1][2]){
            ImageView l2 = (ImageView) findViewById(R.id.l2);
            l2.animate().alpha(1f).setDuration(70);
            return true;
        }
        if(arr[2][0]==arr[2][1]&&arr[2][1]==arr[2][2]){
            ImageView l3 = (ImageView) findViewById(R.id.l3);
            l3.animate().alpha(1f).setDuration(70);
            return true;
        }
        if(arr[0][0]==arr[1][0]&&arr[1][0]==arr[2][0]){
            ImageView l4 = (ImageView) findViewById(R.id.l4);
            l4.animate().alpha(1f).setDuration(70);
            return true;
        }
        if(arr[0][1]==arr[1][1]&&arr[1][1]==arr[2][1]){
            ImageView l5 = (ImageView) findViewById(R.id.l5);
            l5.animate().alpha(1f).setDuration(70);
            return true;
        }
        if(arr[0][2]==arr[1][2]&&arr[1][2]==arr[2][2]){
            ImageView l6 = (ImageView) findViewById(R.id.l6);
            l6.animate().alpha(1f).setDuration(70);
            return true;
        }
        if(arr[0][0]==arr[1][1]&&arr[1][1]==arr[2][2]){
            ImageView l7 = (ImageView) findViewById(R.id.l7);
            l7.animate().alpha(1f).setDuration(70);
            return true;
        }
        if(arr[2][0]==arr[1][1]&&arr[1][1]==arr[0][2]){
            ImageView l8 = (ImageView) findViewById(R.id.l8);
            l8.animate().alpha(1f).setDuration(70);
            return true;
        }
        int i=0;
        for(x=0;x<3;x++){
            for(y=0;y<3;y++) {
                if(arr[x][y]==10||arr[x][y]==11){
                    i++;
                }
            }
        }
        if(i>=9){
            Toast.makeText(this, "It's tie!", Toast.LENGTH_SHORT).show();
            wonfunc();
        }


        return false;
    }

//        public void computer_easy2() {
//            if (!xturn) {
//                int i = 0, x, y;
//            rand = (int)(Math.random() * 9);
//            for(x=0;x<3;x++){
//                for(y=0;y<3;y++) {
//                    arr_com[i]=arr[x][y];
//                    i++;
//                }
//            }
//                while(arr_com[rand] == 10 || arr_com[rand] == 11) {
//                    rand = (int) (Math.random() * 9);
//                }
//                choice(rand+1);
//            }
//        }

    public void computer_easy() {
        if (!xturn) {
            rand = (int) (Math.random() * 9+1);
            int i = 0;
            int x, y;
            for (x = 0; x < 3; x++) {
                for (y = 0; y < 3; y++) {
                    arr_com[i+1] = arr[x][y];
                    i++;
                }
            }
            i = 0;
            for ( x = 0; x < 3; x++) {
                for ( y = 0; y < 3; y++) {
                    if (arr[x][y] == 10 || arr[x][y] == 11) {
                        i++;
                    }
                }
            }
                if (arr_com[1] == arr_com[3] && arr_com[1] == 11 && arr_com[2] == 2) {
                    choice(2);
                } else if (arr_com[1] == arr_com[7] && arr_com[1] == 11 && arr_com[4] == 4) {
                    choice(4);
                } else if (arr_com[1] == arr_com[9] && arr_com[1] == 11 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[1] == arr_com[4] && arr_com[1] == 11 && arr_com[7] == 7) {
                    choice(7);
                } else if (arr_com[1] == arr_com[2] && arr_com[1] == 11 && arr_com[3] == 3) {
                    choice(3);
                } else if (arr_com[1] == arr_com[5] && arr_com[1] == 11 && arr_com[9] == 9) {
                    choice(9);
                } else if (arr_com[2] == arr_com[8] && arr_com[2] == 11 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[2] == arr_com[3] && arr_com[2] == 11 && arr_com[1] == 1) {
                    choice(1);
                } else if (arr_com[2] == arr_com[5] && arr_com[2] == 11 && arr_com[8] == 8) {
                    choice(8);
                } else if (arr_com[3] == arr_com[6] && arr_com[3] == 11 && arr_com[9] == 9) {
                    choice(9);
                } else if (arr_com[3] == arr_com[5] && arr_com[3] == 11 && arr_com[7] == 7) {
                    choice(7);
                } else if (arr_com[3] == arr_com[7] && arr_com[3] == 11 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[3] == arr_com[9] && arr_com[3] == 11 && arr_com[6] == 6) {
                    choice(6);
                } else if (arr_com[4] == arr_com[7] && arr_com[4] == 11 && arr_com[1] == 1) {
                    choice(1);
                } else if (arr_com[4] == arr_com[5] && arr_com[4] == 11 && arr_com[6] == 6) {
                    choice(6);
                } else if (arr_com[4] == arr_com[6] && arr_com[4] == 11 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[5] == arr_com[6] && arr_com[5] == 11 && arr_com[4] == 4) {
                    choice(4);
                } else if (arr_com[5] == arr_com[7] && arr_com[5] == 11 && arr_com[3] == 3) {
                    choice(3);
                } else if (arr_com[5] == arr_com[8] && arr_com[5] == 11 && arr_com[2] == 2) {
                    choice(2);
                } else if (arr_com[5] == arr_com[9] && arr_com[5] == 11 && arr_com[1] == 1) {
                    choice(1);
                } else if (arr_com[6] == arr_com[9] && arr_com[6] == 11 && arr_com[3] == 3) {
                    choice(3);
                } else if (arr_com[7] == arr_com[8] && arr_com[7] == 11 && arr_com[9] == 9) {
                    choice(9);
                } else if (arr_com[7] == arr_com[9] && arr_com[7] == 11 && arr_com[8] == 8) {
                    choice(8);
                } else if (arr_com[8] == arr_com[9] && arr_com[8] == 11 && arr_com[7] == 7) {
                    choice(7);
                } else if (arr_com[1] == arr_com[3] && arr_com[1] == 10 && arr_com[2] == 2) {
                    choice(2);
                } else if (arr_com[1] == arr_com[7] && arr_com[1] == 10 && arr_com[4] == 4) {
                    choice(4);
                } else if (arr_com[1] == arr_com[9] && arr_com[1] == 10 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[1] == arr_com[4] && arr_com[1] == 10 && arr_com[7] == 7) {
                    choice(7);
                } else if (arr_com[1] == arr_com[2] && arr_com[1] == 10 && arr_com[3] == 3) {
                    choice(3);
                } else if (arr_com[1] == arr_com[5] && arr_com[1] == 10 && arr_com[9] == 9) {
                    choice(9);
                } else if (arr_com[2] == arr_com[8] && arr_com[2] == 10 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[2] == arr_com[3] && arr_com[2] == 10 && arr_com[1] == 1) {
                    choice(1);
                } else if (arr_com[2] == arr_com[5] && arr_com[2] == 10 && arr_com[8] == 8) {
                    choice(8);
                } else if (arr_com[3] == arr_com[6] && arr_com[3] == 10 && arr_com[9] == 9) {
                    choice(9);
                } else if (arr_com[3] == arr_com[5] && arr_com[3] == 10 && arr_com[7] == 7) {
                    choice(7);
                } else if (arr_com[3] == arr_com[7] && arr_com[3] == 10 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[3] == arr_com[9] && arr_com[3] == 10 && arr_com[6] == 6) {
                    choice(6);
                } else if (arr_com[4] == arr_com[7] && arr_com[4] == 10 && arr_com[1] == 1) {
                    choice(1);
                } else if (arr_com[4] == arr_com[5] && arr_com[4] == 10 && arr_com[6] == 6) {
                    choice(6);
                } else if (arr_com[4] == arr_com[6] && arr_com[4] == 10 && arr_com[5] == 5) {
                    choice(5);
                } else if (arr_com[5] == arr_com[6] && arr_com[5] == 10 && arr_com[4] == 4) {
                    choice(4);
                } else if (arr_com[5] == arr_com[7] && arr_com[5] == 10 && arr_com[3] == 3) {
                    choice(3);
                } else if (arr_com[5] == arr_com[8] && arr_com[5] == 10 && arr_com[2] == 2) {
                    choice(2);
                } else if (arr_com[5] == arr_com[9] && arr_com[5] == 10 && arr_com[1] == 1) {
                    choice(1);
                } else if (arr_com[6] == arr_com[9] && arr_com[6] == 10 && arr_com[3] == 3) {
                    choice(3);
                } else if (arr_com[7] == arr_com[8] && arr_com[7] == 10 && arr_com[9] == 9) {
                    choice(9);
                } else if (arr_com[7] == arr_com[9] && arr_com[7] == 10 && arr_com[8] == 8) {
                    choice(8);
                } else if (arr_com[8] == arr_com[9] && arr_com[8] == 10 && arr_com[7] == 7) {
                    choice(7);
                } else {
                    while (arr_com[rand] == 10 || arr_com[rand] == 11) {
                        rand = (int) (Math.random() * 9+1);
                    }
                    choice(rand);

                }
        }
    }

    public void choice(int choice){
        if(arr[0][0]!=10&&arr[0][0]!=11&&game_started&&choice==1) {
            ImageView x = (ImageView) findViewById(R.id.imageView1);
            ImageView o = (ImageView) findViewById(R.id.image1);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[0][0] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[0][0] = 11;
                xturn = true;

            }
            if (winCheckerX()&&arr[0][0]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[0][0]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }

        }else  if(arr[0][1]!=10&&arr[0][1]!=11&&game_started&&choice==2) {
            ImageView x = (ImageView) findViewById(R.id.imageView2);
            ImageView o = (ImageView) findViewById(R.id.image2);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[0][1] = 10;
                xturn = false;

            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[0][1] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[0][1]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[0][1]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }else if(arr[0][2]!=10&&arr[0][2]!=11&&game_started&&choice==3) {

            ImageView x = (ImageView) findViewById(R.id.imageView3);
            ImageView o = (ImageView) findViewById(R.id.image3);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[0][2] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[0][2] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[0][2]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[0][2]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }else if(arr[1][0]!=10&&arr[1][0]!=11&&game_started&&choice==4) {

            ImageView x = (ImageView) findViewById(R.id.imageView4);
            ImageView o = (ImageView) findViewById(R.id.image4);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[1][0] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[1][0] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[1][0]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[1][0]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }else  if(arr[1][1]!=10&&arr[1][1]!=11&&game_started&&choice==5) {

            ImageView x = (ImageView) findViewById(R.id.imageView5);
            ImageView o = (ImageView) findViewById(R.id.image5);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[1][1] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[1][1] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[1][1]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[1][1]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }else  if(arr[1][2]!=10&&arr[1][2]!=11&&game_started&&choice==6) {

            ImageView x = (ImageView) findViewById(R.id.imageView6);
            ImageView o = (ImageView) findViewById(R.id.image6);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[1][2] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[1][2] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[1][2]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[1][2]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }else if(arr[2][0]!=10&&arr[2][0]!=11&&game_started&&choice==7) {

            ImageView x = (ImageView) findViewById(R.id.imageView7);
            ImageView o = (ImageView) findViewById(R.id.image7);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[2][0] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[2][0] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[2][0]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[2][0]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }else  if(arr[2][1]!=10&&arr[2][1]!=11&&game_started&&choice==8) {

            ImageView x = (ImageView) findViewById(R.id.imageView8);
            ImageView o = (ImageView) findViewById(R.id.image8);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[2][1] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[2][1] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[2][1]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[2][1]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }else if(arr[2][2]!=10&&arr[2][2]!=11&&game_started&&choice==9) {

            ImageView x = (ImageView) findViewById(R.id.imageView9);
            ImageView o = (ImageView) findViewById(R.id.image9);
            if (xturn) {
                x.animate().alpha(1f).setDuration(70);
                arr[2][2] = 10;
                xturn = false;
            } else {
                o.animate().alpha(1f).setDuration(70);
                arr[2][2] = 11;
                xturn = true;
            }
            if (winCheckerX()&&arr[2][2]==10) {
                Toast.makeText(this, "X player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }else if (winCheckerX()&&arr[2][2]==11) {
                Toast.makeText(this, "O player won!", Toast.LENGTH_SHORT).show();
                wonfunc();
            }
        }


    }

    public void one(View view){
        choice(1);
        if(single){
            computer_easy();
        }
    }

    public void two(View view){
        choice(2);
        if(single){
            computer_easy();
        }
    }

    public void three(View view){
        choice(3);
        if(single){
            computer_easy();
        }
    }

    public void four(View view){
        choice(4);
        if(single){
            computer_easy();
        }
    }

    public void five(View view){
        choice(5);
        if(single){
            computer_easy();
        }
    }

    public void six(View view){
        choice(6);
        if(single){
            computer_easy();
        }
    }

    public void seven(View view){
        choice(7);
        if(single){
            computer_easy();
        }
    }

    public void eight(View view){
        choice(8);
        if(single){
            computer_easy();
        }
    }
    public void nine(View view){
        choice(9);
        if(single){
            computer_easy();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
