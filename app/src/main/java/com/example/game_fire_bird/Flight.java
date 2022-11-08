package com.example.game_fire_bird;

import static com.example.game_fire_bird.GameView.screenRatioX;
import static com.example.game_fire_bird.GameView.screenRatioY;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;

public class Flight {

    int toShoot = 0;
    boolean isGoingUp = false;
    int x, y, width, height, wingCounter = 0, shootCounter = 1;
    Bitmap flight1, flight2, dead;
    Bitmap shoot1, shoot2, shoot3, shoot4, shoot5;
    Bitmap flight3, flight4, flight5, flight6, flight7, flight8, flight9, flight10, flight11,
            flight12, flight13, flight14, flight15, flight16, flight17, flight18, flight19, flight20, flight21, flight22, flight23, flight24;
    private GameView gameView;

    Flight(GameView gameView, int screenY, Resources res) {

        this.gameView = gameView;

        flight1 = BitmapFactory.decodeResource(res, R.drawable.fly3);
        flight2 = BitmapFactory.decodeResource(res, R.drawable.fly4);
        flight3 = BitmapFactory.decodeResource(res, R.drawable.fly5);
        flight4 = BitmapFactory.decodeResource(res, R.drawable.fly6);
        flight5 = BitmapFactory.decodeResource(res, R.drawable.fly7);
//        flight6 = BitmapFactory.decodeResource(res, R.drawable.banh6);
//        flight7 = BitmapFactory.decodeResource(res, R.drawable.banh7);
//        flight8 = BitmapFactory.decodeResource(res, R.drawable.banh8);
//        flight9 = BitmapFactory.decodeResource(res, R.drawable.banh9);
//        flight10 = BitmapFactory.decodeResource(res, R.drawable.banh10);
//        flight11 = BitmapFactory.decodeResource(res, R.drawable.banh11);
//        flight12 = BitmapFactory.decodeResource(res, R.drawable.banh12);
//        flight13 = BitmapFactory.decodeResource(res, R.drawable.banh13);
//        flight14 = BitmapFactory.decodeResource(res, R.drawable.banh14);
//        flight15 = BitmapFactory.decodeResource(res, R.drawable.banh15);
//        flight16 = BitmapFactory.decodeResource(res, R.drawable.banh16);
//        flight17 = BitmapFactory.decodeResource(res, R.drawable.banh17);
//        flight18 = BitmapFactory.decodeResource(res, R.drawable.banh18);
//        flight19 = BitmapFactory.decodeResource(res, R.drawable.banh19);
//        flight20 = BitmapFactory.decodeResource(res, R.drawable.banh20);
//        flight21 = BitmapFactory.decodeResource(res, R.drawable.banh21);
//        flight22 = BitmapFactory.decodeResource(res, R.drawable.banh22);
//        flight23 = BitmapFactory.decodeResource(res, R.drawable.banh23);
//        flight24 = BitmapFactory.decodeResource(res, R.drawable.banh24);


        width = flight1.getWidth();
        height = flight1.getHeight();

        width /= 4;
        height /= 4;

        width = (int) (width * screenRatioX);
        height = (int) (height * screenRatioY);

        flight1 = Bitmap.createScaledBitmap(flight1, width, height, false);
        flight2 = Bitmap.createScaledBitmap(flight2, width, height, false);
//        flight3 = Bitmap.createScaledBitmap(flight3, width, height, false);
//        flight4 = Bitmap.createScaledBitmap(flight4, width, height, false);
//        flight5 = Bitmap.createScaledBitmap(flight5, width, height, false);
//        flight6 = Bitmap.createScaledBitmap(flight6, width, height, false);
//        flight7 = Bitmap.createScaledBitmap(flight7, width, height, false);
//        flight8 = Bitmap.createScaledBitmap(flight8, width, height, false);
//        flight9 = Bitmap.createScaledBitmap(flight9, width, height, false);
//        flight10 = Bitmap.createScaledBitmap(flight10, width, height, false);
//        flight11 = Bitmap.createScaledBitmap(flight11, width, height, false);
//        flight12 = Bitmap.createScaledBitmap(flight12, width, height, false);
//        flight13 = Bitmap.createScaledBitmap(flight13, width, height, false);
//        flight14 = Bitmap.createScaledBitmap(flight14, width, height, false);
//        flight15 = Bitmap.createScaledBitmap(flight15, width, height, false);
//        flight16 = Bitmap.createScaledBitmap(flight16, width, height, false);
//        flight17 = Bitmap.createScaledBitmap(flight17, width, height, false);
//        flight18 = Bitmap.createScaledBitmap(flight18, width, height, false);
//        flight19 = Bitmap.createScaledBitmap(flight19, width, height, false);
//        flight20 = Bitmap.createScaledBitmap(flight20, width, height, false);
//        flight21 = Bitmap.createScaledBitmap(flight21, width, height, false);
//        flight22 = Bitmap.createScaledBitmap(flight22, width, height, false);
//        flight23 = Bitmap.createScaledBitmap(flight23, width, height, false);
//        flight24 = Bitmap.createScaledBitmap(flight24, width, height, false);

        shoot1 = BitmapFactory.decodeResource(res, R.drawable.banh1);
        shoot2 = BitmapFactory.decodeResource(res, R.drawable.banh2);
        shoot3 = BitmapFactory.decodeResource(res, R.drawable.banh3);
        shoot4 = BitmapFactory.decodeResource(res, R.drawable.banh4);
        shoot5 = BitmapFactory.decodeResource(res, R.drawable.banh5);

        shoot1 = Bitmap.createScaledBitmap(shoot1, width, height, false);
        shoot2 = Bitmap.createScaledBitmap(shoot2, width, height, false);
        shoot3 = Bitmap.createScaledBitmap(shoot3, width, height, false);
        shoot4 = Bitmap.createScaledBitmap(shoot4, width, height, false);
        shoot5 = Bitmap.createScaledBitmap(shoot5, width, height, false);

        dead = BitmapFactory.decodeResource(res, R.drawable.dead2);
        dead = Bitmap.createScaledBitmap(dead, width, height, false);

        y = screenY / 2;
        x = (int) (64 * screenRatioX);

    }

    Bitmap getFlight() {

        if (toShoot != 0) {

            if (shootCounter == 1) {
                shootCounter++;
                return shoot1;
            }

            if (shootCounter == 2) {
                shootCounter++;
                return shoot2;
            }

            if (shootCounter == 3) {
                shootCounter++;
                return shoot3;
            }

            if (shootCounter == 4) {
                shootCounter++;
                return shoot4;
            }

            shootCounter = 1;
            toShoot--;
            gameView.newBullet();

            return shoot5;
        }

        if (wingCounter == 0) {
            wingCounter++;
            return flight1;
        }
        wingCounter--;

        return flight2;
    }

    Rect getCollisionShape() {
        return new Rect(x, y, x + width, y + height);
    }

    Bitmap getDead() {
        return dead;
    }

}