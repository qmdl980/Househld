package com.example.qmdl9.household;

/**
 * Created by qmdl9 on 2017-06-25.
 */

public class Record {
    private String kind;
    private String where;
    private String amount;

    public Record(String kind, String where, String amount){
        this.kind = kind;
        this.where = where;
        this.amount = amount;
    }
    @Override
    public String toString(){
        return(kind +"    " + where + "    " + amount + "\n");
    }
}
