package com.company.behavioral.strategy;

public class GoogleMap {
    Route route;


    public GoogleMap(Route route) {
        this.route = route;
    }


    public void createRoute(Cordinate start, Cordinate end){
        route.createRoute();
    }
    
}
