package com.fichas;

import com.fichas.printCell;

public class printDataCell {

    public printDataCell(String[] data){
        new printCell();
        System.out.println("");
        System.out.printf(" | %-32s", data[0]);
        for(int item = 1; item < 8; item++){
            System.out.printf(" | %-18s", data[item]);
        }
        System.out.println("");
    }
}
