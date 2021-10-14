package com.example.buscaminas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Random;

public class JuegoPrincipal extends AppCompatActivity {
    static Random rnd = new Random();
    int [][] tablero = crearTablero();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        

    }
    private static int [][] crearTablero(){
        int [][] tablero = new int[10][10];
        for (int i = 0; i < tablero.length ; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 0;
            }
        }
        return tablero;
    }

    private static int [][] rellenarMinasTablero(int x, int y,int [][]llenarMinastablero) {
        for (int i = 0; i < llenarMinastablero.length ; i++) {
            for (int j = 0; j < llenarMinastablero.length; j++) {
                if(llenarMinastablero[i][j]!=llenarMinastablero[x][y]){
                    llenarMinastablero[i][j] = rnd.nextInt();
                }else{
                    llenarMinastablero[i][j] = -1;
                }
            }
        }
        return llenarMinastablero;
    }
}