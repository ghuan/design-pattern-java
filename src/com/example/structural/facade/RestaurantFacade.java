package com.example.structural.facade;

import com.example.structural.facade.bean.Chef;
import com.example.structural.facade.bean.Waiter;

/**
 * 餐馆外观类
 */
public class RestaurantFacade {
    private Waiter waiter;
    private Chef chef;
    public RestaurantFacade(){
        this.waiter = new Waiter();
        this.chef = new Chef();
    }
    public void meal(){
        this.waiter.introduce();
        this.waiter.placeOrder();
        this.chef.prepare();
        this.chef.cook();
        this.waiter.serveDishes();
    }
}
