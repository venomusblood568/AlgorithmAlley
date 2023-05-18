//Single Level inheritance - A class inherits properties from a single class. For example, Class B inherits Class A.
package com.coding;

class shape {
    public void display(){
        System.out.println("inside display");
    }
}
//entends is the keyword for the link to the main class and keep in mind that rectangle is a subclass
class rectangle extends shape{
    public void area(){
        System.out.println("inside area");
    }
}
public class single_level {
    public static void main (String args[]){
        rectangle rect = new rectangle();
        rect.display();
        rect.area();
    }
}
