/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author amct2
 */
public class Person {
    private  String name;
    private  Calendar birthday;
    private final long milliseconds_per_year = (long)(1000 * 60 * 60 * 24 * 365.25);
    
    public Person(String name, Calendar birthday){
        this.birthday = birthday;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Calendar getBirthday(){
        return this.birthday;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBirthday(Calendar birthday){
        this.birthday = birthday;
    }
    
    public int getAge(){
        Calendar today = GregorianCalendar.getInstance();
        return (int) (millisecondsToYear(today.getTimeInMillis() - birthday.getTimeInMillis()));
    }
    
    private long millisecondsToYear(long milles){
        return milles/milliseconds_per_year;
    }
}