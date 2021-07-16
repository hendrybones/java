package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
	int v1=10, v2=4;
	final int diff;
	if(v1 >v2) {
        diff = v1 - v2;
        System.out.println("v1 is greater than V2=" + diff);
    }
	else {
        diff = v2 - v1;
        System.out.println("vi is not bigger than v2=" + diff);
    }
    }
}
