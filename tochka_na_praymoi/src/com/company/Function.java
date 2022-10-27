package com.company;

import java.awt.*;

public class Function {
    float x;
    float y;
    // конструктор
    public Function(){
        x = 0;
        y = 0;
    }

    public Function(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //вывод
    public String toString() {
        return "A" + "(" + x + ";" + y + ")";
    }
    // движение по Х
    public  Function MoveX(int k){
        Function result = new Function();

        result.y = y;
        result.x = x + k;

        return result;

    }

    // движение по У
    public  Function MoveY(int k){
        Function result = new Function();
        result.x = x;
        result.y = y + k;

        return result;

    }




}
