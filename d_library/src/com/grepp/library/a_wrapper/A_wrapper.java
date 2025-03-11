package com.grepp.library.a_wrapper;

public class A_wrapper {

    private boolean activated;
    private Boolean wActivated;
    private int num;
    private Integer wNum;
    private char ch;
    private Character wCh;
    private double dNum;
    private Double wDNum;

    @Override
    public String toString() {
        return "A_wrapper{" +
            "activated=" + activated +
            ", wActivated=" + wActivated +
            ", num=" + num +
            ", wNum=" + wNum +
            ", ch=" + ch +
            ", wCh=" + wCh +
            ", dNum=" + dNum +
            ", wDNum=" + wDNum +
            '}';
    }
}
