package com.pablo.ejemplolistas;

public class SingleData {

    private int orderTag;
    private String tag;
    private String subTag;

    public SingleData(int order, String name, String subName){
        this.orderTag = order;
        this.tag = name;
        this.subTag = subName;
    }

    public int getOrderTag() {
        return orderTag;
    }

    public String getTag() {
        return tag;
    }

    public String getSubTag() {
        return subTag;
    }
}
