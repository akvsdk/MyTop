package com.ep.jyq.mytop.bean;

/**
 * author  Joy
 * Date:  2016/10/12 0012.
 * version:  V1.0
 * Description:
 */
public class Goods_params {
    private String type;
    private String value;
    private int id;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}
