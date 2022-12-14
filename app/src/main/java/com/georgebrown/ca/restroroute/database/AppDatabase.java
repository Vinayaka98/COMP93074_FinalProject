package com.georgebrown.ca.restroroute.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;


import com.georgebrown.ca.restroroute.model.Restaurant;

@Database(entities = {Restaurant.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public abstract RestaurantDao restaurantDao();




    public static AppDatabase getInstance(Context context){
        if(instance == null){
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "app-database")
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public static void destroyInstance(){
        instance = null;
    }

}
