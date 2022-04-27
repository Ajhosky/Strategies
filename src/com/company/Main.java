package com.company;

import com.company.behavioral.strategy.*;

public class Main {

    public static void main(String[] args) {
        /*
        singleton obj1 = singleton.getInstance("My object 1");
        singleton obj2 = singleton.getInstance("My object 2");
        singletone obj3 = singleton.getInstance("My object 3");
        singletone obj4 = singleton.getInstance("My object 4");
        singletone obj5 = singleton.getInstance("My object 5");

        System.out.println(obj1.value);
        System.out.println(obj2.value);
        System.out.println(obj3.value);
        System.out.println(obj4.value);
        System.out.println(obj5.value);
        */
        /*
        Painter painter = new Painter();
        painter.setGraphics(new Circle());
        painter.setGraphics(new Square());
        painter.setGraphics(new Triangle());
        painter.draw();
        painter.draw();
        painter.draw();
        */
        Cordinate start = new Cordinate();
        Cordinate end = new Cordinate();

        GoogleMap map1 =  new GoogleMap(new BikeStrategy());
        map1.createRoute(start, end);

        GoogleMap map2 =  new GoogleMap(new CarStrategy());
        map2.createRoute(start, end);

        GoogleMap map3 =  new GoogleMap(new WalkStrategy());
        map3.createRoute(start, end);
    }
}
