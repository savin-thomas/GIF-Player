package com.example.gif_player;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

    }

    public void c1(View view) {

        CheckBox cb1 = findViewById (R.id.cb1);
        cb1.toggle ();

    }

    public void c2(View view) {

        CheckBox cb2 = findViewById (R.id.cb2);
        cb2.toggle ();

    }

    public void c3(View view) {

        CheckBox cb3 = findViewById (R.id.cb3);
        cb3.toggle ();

    }

    public void c4(View view) {

        CheckBox cb4 = findViewById (R.id.cb4);
        cb4.toggle ();

    }

    public void c5(View view) {

        CheckBox cb5 = findViewById (R.id.cb5);
        cb5.toggle ();

    }

    public void c6(View view) {

        CheckBox cb6 = findViewById (R.id.cb6);
        cb6.toggle ();

    }

    public void c7(View view) {

        CheckBox cb7 = findViewById (R.id.cb7);
        cb7.toggle ();

    }

    public void c8(View view) {

        CheckBox cb8 = findViewById (R.id.cb8);
        cb8.toggle ();

    }

    public void c9(View view) {

        CheckBox cb9 = findViewById (R.id.cb9);
        cb9.toggle ();

    }

    public void c10(View view) {

        CheckBox cb10 = findViewById (R.id.cb10);
        cb10.toggle ();

    }

    public void c11(View view) {

        CheckBox cb11 = findViewById (R.id.cb11);
        cb11.toggle ();

    }

    public void c12(View view) {

        CheckBox cb12 = findViewById (R.id.cb12);
        cb12.toggle ();

    }

    public void c13(View view) {

        CheckBox cb13 = findViewById (R.id.cb13);
        cb13.toggle ();

    }

    public void c14(View view) {

        CheckBox cb14 = findViewById (R.id.cb14);
        cb14.toggle ();

    }

    public void c15(View view) {

        CheckBox cb15 = findViewById (R.id.cb15);
        cb15.toggle ();

    }

    public void c16(View view) {

        CheckBox cb16 = findViewById (R.id.cb16);
        cb16.toggle ();

    }

    public void c17(View view) {

        CheckBox cb17 = findViewById (R.id.cb17);
        cb17.toggle ();

    }

    public void c18(View view) {

        CheckBox cb18 = findViewById (R.id.cb18);
        cb18.toggle ();

    }

    public void c19(View view) {

        CheckBox cb19 = findViewById (R.id.cb19);
        cb19.toggle ();

    }

    public void c20(View view) {

        CheckBox cb20 = findViewById (R.id.cb20);
        cb20.toggle ();

    }

    public void c21(View view) {

        CheckBox cb21 = findViewById (R.id.cb21);
        cb21.toggle ();

    }

    public void c22(View view) {

        CheckBox cb22 = findViewById (R.id.cb22);
        cb22.toggle ();

    }

    public void c23(View view) {

        CheckBox cb23 = findViewById (R.id.cb23);
        cb23.toggle ();

    }

    public void c24(View view) {

        CheckBox cb24 = findViewById (R.id.cb24);
        cb24.toggle ();

    }

    public void c25(View view) {

        CheckBox cb25 = findViewById (R.id.cb25);
        cb25.toggle ();

    }

    public void c26(View view) {

        CheckBox cb26 = findViewById (R.id.cb26);
        cb26.toggle ();

    }

    public void c27(View view) {

        CheckBox cb27 = findViewById (R.id.cb27);
        cb27.toggle ();

    }

    public void c28(View view) {

        CheckBox cb28 = findViewById (R.id.cb28);
        cb28.toggle ();

    }

    public void c29(View view) {

        CheckBox cb29 = findViewById (R.id.cb29);
        cb29.toggle ();

    }

    public void c30(View view) {

        CheckBox cb30 = findViewById (R.id.cb30);
        cb30.toggle ();

    }

    public void c31(View view) {

        CheckBox cb31 = findViewById (R.id.cb31);
        cb31.toggle ();

    }

    public void c32(View view) {

        CheckBox cb32 = findViewById (R.id.cb32);
        cb32.toggle ();

    }

    public void c33(View view) {

        CheckBox cb33 = findViewById (R.id.cb33);
        cb33.toggle ();

    }


    public void clickplay(View v) {

        ScrollView mainScrollView = findViewById (R.id.sv);

        CheckBox cb1 = findViewById (R.id.cb1);
        CheckBox cb2 = findViewById (R.id.cb2);
        CheckBox cb3 = findViewById (R.id.cb3);
        CheckBox cb4 = findViewById (R.id.cb4);
        CheckBox cb5 = findViewById (R.id.cb5);
        CheckBox cb6 = findViewById (R.id.cb6);
        CheckBox cb7 = findViewById (R.id.cb7);
        CheckBox cb8 = findViewById (R.id.cb8);
        CheckBox cb9 = findViewById (R.id.cb9);
        CheckBox cb10 = findViewById (R.id.cb10);
        CheckBox cb11 = findViewById (R.id.cb11);
        CheckBox cb12 = findViewById (R.id.cb12);
        CheckBox cb13 = findViewById (R.id.cb13);
        CheckBox cb14 = findViewById (R.id.cb14);
        CheckBox cb15 = findViewById (R.id.cb15);
        CheckBox cb16 = findViewById (R.id.cb16);
        CheckBox cb17 = findViewById (R.id.cb17);
        CheckBox cb18 = findViewById (R.id.cb18);
        CheckBox cb19 = findViewById (R.id.cb19);
        CheckBox cb20 = findViewById (R.id.cb20);
        CheckBox cb21 = findViewById (R.id.cb21);
        CheckBox cb22 = findViewById (R.id.cb22);
        CheckBox cb23 = findViewById (R.id.cb23);
        CheckBox cb24 = findViewById (R.id.cb24);
        CheckBox cb25 = findViewById (R.id.cb25);
        CheckBox cb26 = findViewById (R.id.cb26);
        CheckBox cb27 = findViewById (R.id.cb27);
        CheckBox cb28 = findViewById (R.id.cb28);
        CheckBox cb29 = findViewById (R.id.cb29);
        CheckBox cb30 = findViewById (R.id.cb30);
        CheckBox cb31 = findViewById (R.id.cb31);
        CheckBox cb32 = findViewById (R.id.cb32);
        CheckBox cb33 = findViewById (R.id.cb33);

        AnimationDrawable animation = new AnimationDrawable ();



        if (cb1.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.gokusmile), 500);
        }
        if (cb2.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.gokublue), 500);
        }
        if (cb3.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.gokuultra), 500);
        }

        if (cb4.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g1), 500);
        }
        if (cb5.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g2), 500);
        }
        if (cb6.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g3), 500);
        }

        if (cb7.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g4), 500);
        }
        if (cb8.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g5), 500);
        }
        if (cb9.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g6), 500);
        }

        if (cb10.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g7), 500);
        }
        if (cb11.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g8), 500);
        }
        if (cb12.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g9), 500);
        }

        if (cb13.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g10), 500);
        }
        if (cb14.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g11), 500);
        }
        if (cb15.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.g13), 500);
        }
        if (cb16.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i1), 500);
        }
        if (cb17.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i2), 500);
        }
        if (cb18.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i3), 500);
        }

        if (cb19.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i4), 500);
        }
        if (cb20.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i5), 500);
        }
        if (cb21.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i6), 500);
        }

        if (cb22.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i7), 500);
        }
        if (cb23.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i8), 500);
        }
        if (cb24.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.i9), 500);
        }

        if (cb25.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n1), 500);
        }
        if (cb26.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n2), 500);
        }
        if (cb27.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n3), 500);
        }

        if (cb28.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n4), 500);
        }
        if (cb29.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n5), 500);
        }
        if (cb30.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n6), 500);
        }
        if (cb31.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n7), 500);
        }
        if (cb32.isChecked ()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n8), 500);
        }
        if (cb33.isChecked()) {
            animation.addFrame (getResources ().getDrawable (R.drawable.n9), 500);
        }


        animation.setOneShot (false);

        ImageView imageAnim = (ImageView) findViewById (R.id.output);
        imageAnim.setImageDrawable (animation);


// start the animation!
        animation.start ();

        mainScrollView.scrollTo(0, 4750);
    }


    }
