package com.company;

public class Fraction {
    int num;
    int denom;

    //Конструктор по умолчанию
    public Fraction(){
        num = 1;
        denom = 1;
    }
    //Констуторк с параметрами
    public Fraction(int num, int denom) {
        this.num = num;
        this.denom = denom;
    }
    //первый способ вывода
    public String toString() {
        return num + "/" + denom;
    }
    //второй способ вывода объекта на экран
    public void printFraction(){
        System.out.println(num + "/" + denom);
    }
    public void multyOnkoef(int k){
        num *= k;
        if(k != 0) {
            denom *= k;
        }


    }
   //умножение
    public Fraction multyFraction(Fraction secondFactor){
        Fraction result = new Fraction();
        result.num = num *secondFactor.num;
        result.denom = denom *secondFactor.denom;
        return result;
    }
    //деление
    public Fraction Divide(Fraction secondFactor){
        Fraction result = new Fraction();
        result.num = num *secondFactor.denom;
        result.denom = denom *secondFactor.num;
        return result;
    }
    //сумма
    public Fraction Sum(Fraction secondFactor){
        int k = 0;
        Fraction result = new Fraction();
        if (denom != secondFactor.denom){

            secondFactor.num = secondFactor.num *denom;
            num = num *secondFactor.denom;

            k = secondFactor.denom;
            secondFactor.denom = denom *secondFactor.denom;
            denom = k * denom;

            System.out.println(secondFactor.num);
        }
        result.num = secondFactor.num + num;
        result.denom = denom;

        return result;
    }
    //разность
    public Fraction Subtraction(Fraction secondFactor){
        int k = 0;
        Fraction result = new Fraction();
        if (denom != secondFactor.denom){

            secondFactor.num = secondFactor.num *denom;
            num = num *secondFactor.denom;

            k = secondFactor.denom;
            secondFactor.denom = denom *secondFactor.denom;
            denom = k * denom;

        }

        result.num = num - secondFactor.num;
        result.denom = denom;

        return result;
    }

    //геттеры и сеттеры


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDenom() {
        return denom;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
}




