package com.stackroute.pe3;

import java.util.Arrays;

public class ChessBoard {

    public static void main(String[] args) {
        ChessBoard b = new ChessBoard();
        b.Board();

    }

    public void Board() {
        String[][] array = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (((i + j) % 2) == 0) {
                    array[i][j] = "WW|";
                } else {
                    array[i][j] = "BB|";
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
            }


    }



