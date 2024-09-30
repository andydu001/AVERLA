package com.example.averla;
/*

An attempt to create a content provider

Author: Andy Duverneau
Date: 7/2024

 */
import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.File;

public class Anima extends ContentProvider{
    private SQLiteOpenHelper helper;
    private  DatabaseUtils databaseUtils;
    private Context context;
    private Cursor cursor;
    private SQLiteDatabase.CursorFactory cursorFactory;
    private String type;
    private String tableName;
    private String[] colunm;
    private String having;
    private String orderby;
    private final String COLUNM_NAME = "fruit";
    private Uri newUri;
    private int delt;
    private int updt;
    private File filePath;
    private  final int ReadAnWriteMode = SQLiteDatabase.OPEN_READONLY;

    @Override
    public boolean onCreate() {
        return false;
    }
    /*

    String table name s
    String colunm[]   trings
     */
    @SuppressLint("WrongConstant")
    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] colunm, @Nullable String tableName, @Nullable String[] strings, @Nullable String selection) {

       /*   CreateHelp createHelp = new CreateHelp();

       //  String DBname = createHelp.getDatabasePath("C:\\Users\\andyd\\AndroidStudioProjects\\Dras.db").getName();

     System.out.println( createHelp.openOrCreateDatabase(uri.getPath(),ReadAnWriteMode, null).isOpen());
*/
      //   System.out.println( DBname);
     /*
     if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
           // File file = new File(uri.toString());
            database = helper.getReadableDatabase();
          //  database.openDatabase(file, new SQLiteDatabase.OpenParams.Builder().build());
        };
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
            File file = new File(uri.toString());
              database.openDatabase(file, new SQLiteDatabase.OpenParams.Builder().build());
        };

           // System.out.println(helper.getDatabaseName()+" Andy Duverneau");
            this.colunm =  colunm;
            this.tableName = tableName;
             //cursor = database.query(tableName,colunm,selection,strings, "WA",having, orderby);

*/

        return cursor;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        return null ;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String s, @Nullable String[] strings) {
        return 0;
    }

    public String getTableName() {
        return tableName;
    }


    public String[] getColunm() {
        return colunm;
    }


    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
