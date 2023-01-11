package com.example.healthcare;

import android.content.ContentValues;

import android.content.Context;

import android. database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;



public class Database extends SQLiteOpenHelper {



    public Database (Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {

        super (context, name, factory, version);



        @Override

        public void onCreate (SOLiteDatabase sqLiteDatabase) {

            String qryl = "create table users(username text,email text,password text)".

                    sqLiteDatabase.execSQL(qry1);



            @Override

            public void onUpgrade (SQLiteDatabase sqLiteDatabase, int i, int i1) {

            }

            public void register(String username, String email, String password){

                ContentValues cv = new ContentValues);

                cv.put ("username" ‚username);

                cv.put ("email" ‚email);

                cv.put ("password" ‚password);

                SQLiteDatabase db = getWritableDatabase ();

                db.insert( table: "users", nullColumnHack: null, cv);

                db.close();

            }
        }


        public int Login(String username, String password){

            int result=0;

            String strl[] a now String(2);

            str[0] a username;

            str[1] = password;

            SQLiteDatabase db = getReadableDatabase;

            Cursor c = db.rawQuery( sql:
                    "select * from users where usernames=? and password =?\u201D,str);

            If(c. moveToFirst())!

                    result=1;

        }

        return result;

    }

}