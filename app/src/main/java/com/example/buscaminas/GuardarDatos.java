package com.example.buscaminas;

import android.view.View;

public class GuardarDatos {
    private static int [][] tablero;
    private static int numTotalMinas;
    private static int minasRestantes;
    private static int huecosRestantes;
    private static View [][] botones;
    private static boolean [][] tieneBandera;



    private void iniciarCampos(int tableroCreado[][], int minas){

        tablero = tableroCreado;
        numTotalMinas = minas;
        minasRestantes = minas;
        huecosRestantes = tableroCreado.length*tableroCreado[0].length-numTotalMinas;


    }

}
