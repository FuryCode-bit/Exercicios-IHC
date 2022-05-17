package com.fichas;

public class printCell {
    public printCell(){
        for (int i = 0; i < 36; i++){
            System.out.print("-");
        }
        System.out.print("|");
        for (int k = 0; k < 7; k++) {
            for (int j = 0; j < 20; j++){
                System.out.print("-");
            }
            System.out.print("|");
        }
    }
}
