package com.example.springIntro;

public class CustomerDal implements ICustomerDal{

    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    // Servis classın
    @Override
    public void add() {
        // bütün db lerin connectionString'i ayrı olur - db'ye laşmaya çalıştığımız adres
        System.out.println("Connection String : " + this.connectionString);
        System.out.println("Oracle veritabanına eklendi");
    }


}
