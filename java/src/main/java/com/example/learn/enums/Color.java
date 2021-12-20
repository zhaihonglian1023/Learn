package com.example.learn.enums;


public enum Color {

    RED(1),
    BLUE(2),
    PINK(3);

    private Color(int sort){
        this.sort = sort;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    private int sort;

}