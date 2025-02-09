package com.alokSpringBootIntro.week1.Week1Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

    //Field injection
/*    @Autowired
    private DB db;*/

    //Constructor injection
    final private DB db;

    public DBService(DB db) {
        this.db = db;
    }

    String getData() {
        return db.getData();
    }

}
