package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by vinaykum on 1/9/19.
 */

public abstract class Tweet {

    String message;

    String message2;

    Date date;

    public void Tweet(){

        message = "" ;

    }

    public void setMessage(String tweetmessage){

        message = tweetmessage;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String tweetmessage, String message2){
        message = tweetmessage;
        this.message2 = message2;

        System.out.println("second setMessage has been called");
    }

    public abstract String getSomething();
}
