package com.moringaschool.alienske.simplechat;

import com.parse.ParseObject;

/**
 * Created by USER on 03/08/2015.
 */
//This class provids message data for the ListView
// will be used to retrieve and save messages to Parse.
public class Message extends ParseObject {
    public String getUserId() {
        return getString("userId");
    }
    public String getBody(){
        return getString("body");
    }
    public void setUserId(String userId){
        put("userId", userId);
    }
    public void setBody(String body){
        put("body", body);
    }
}
