package com.example.averla;

import android.content.ContentValues;

// class object
public class ObjectValue {

    private Object[] object;
    //construct an object
    ObjectValue(ContentValues contentValues){


         this.object = new Object[]{ contentValues.get(String.valueOf(DataHolderClass.ZERO))
        ,contentValues.get(String.valueOf(DataHolderClass.ONE)),
         contentValues.get(String.valueOf(DataHolderClass.TWO)), contentValues.get(String.valueOf(DataHolderClass.THREE))
         ,contentValues.get(String.valueOf(DataHolderClass.FOUR))};

    }

    // return an array of object
    public  Object[] objects()
    {
        return object;
    }
}
