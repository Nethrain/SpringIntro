package com.example.springIntro;

// Çıplak class kalmamamalı!!
public class CustomerManager implements ICustomerService {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal) { // bu methodu çağırdığında ICustomerDal'ı implente eden classları obje olarak parametre verebilirsin
        this.customerDal = customerDal;
    }

    public void add() {
        // İş kuralları
        // bir class başka bir classı kullandığında onu new lememelidir.. IoC bunu bize sağlıyor.
        customerDal.add();
    }

}
