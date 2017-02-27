package ua.kpi.tef;

/**
 * Created by User on 14.02.2017.
 */
public class Model {
    private int value;
    private String[] str;

    // The Program logic

    /**
     * in this method squaring this.value and add valueInt
     * @param valueInt
     * @return sqr
     */

    public int sqrAndAdd(int valueInt){
        return value *= valueInt;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String[] getStr() { return str; }

    public void setStr(String[] str) {
        this.str = str;
    }
}
