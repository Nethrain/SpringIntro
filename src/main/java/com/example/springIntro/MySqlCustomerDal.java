package com.example.springIntro;

public class MySqlCustomerDal implements ICustomerDal{

    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }


    // Servis class'ım
    @Override
    public void add() {
        System.out.println("MySql veritabanına eklendi");
    }


}
