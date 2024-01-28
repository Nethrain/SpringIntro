package com.example.springIntro;

public class MySqlCustomerDal implements ICustomerDal{

    // Servis class'ım
    @Override
    public void add() {
        System.out.println("MySql veritabanına eklendi");
    }


}
