package utils;


import java.util.UUID;
import java.util.Date;
public class Utils {

     
    public static String uuid(){

        
        UUID uuid = UUID.randomUUID();
        
        String response= uuid.toString();
        return response;

    }    
    public static Date date(){
        Date response = new Date();
        return response;
    }
}
