/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.util.Date;

/**
 *
 * @author amct2
 */
public class Person {
    private  String name;
    private  Date birthday;
    
    public Person(String name, Date birthday){
        this.birthday = birthday;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public Date getBirthday(){
        return this.birthday;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    
    public int getAge(){
        return (int)((new Date().getTime() - birthday.getTime())/31536000000L);
    }
}