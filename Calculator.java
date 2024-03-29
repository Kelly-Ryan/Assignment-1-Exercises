package com.javadevelopers.code;

public class Calculator {

    private float no1;
    private float no2;
    private String operator;

    public void setNo1(float no1){
        this.no1 = no1;
    }

    public void setNo2(float no2) {
        this.no2 = no2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public float getNo1(){
        return no1;
    }

    public float getNo2() {
        return no2;
    }

    public String getOperator() {
        return operator;
    }

    public float performCalculation(){

        switch(operator){

            case "+":
                return no1 + no2;

            case "-":
                return no1 - no2;

            case "*":
                return no1 * no2;

            case "/":
                return no1 / no2;

            case "%":
                return no1 % no2;

            default:
                return 0;

        }
    }
}
