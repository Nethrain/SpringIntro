package com.example.springIntro;

public class CustomerDal implements ICustomerDal{


    // Servis classın
    @Override
    public void add() {
        System.out.println("Oracle veritabanına eklendi");
    }


}
