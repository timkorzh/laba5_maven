package com.company.collection_manage;

public class Coordinates {
    public Coordinates() {
        this.y= (float) 0;
        this.x = 0;
    }
    public Coordinates(String coordinates) {
        parseString(coordinates);
    }
    public void parseString(String coordinates) {
        this.x = Integer.parseInt(coordinates.split(";")[0].trim());
        this.y = Float.parseFloat(coordinates.split(";")[1].trim().replace(',', '.'));
    }
    private int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    private Float y;
    public float getY() {
        return y;
    }
    public void setY(Float y) {
        this.y = y;
    }
}
