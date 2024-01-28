package com.example.springIntro;

// Çıplak class kalmamamalı!!
public class CustomerManager implements ICustomerService {
    String bisey;
    private ICustomerDal customerDal;
  //  public CustomerManager(ICustomerDal customerDal) { // bu methodu çağırdığında ICustomerDal'ı implente eden classları obje olarak parametre verebilirsin
    //    this.customerDal = customerDal;
   // }

    // Constructor Injection
    public void add() {
        // İş kuralları
        // bir class başka bir classı kullandığında onu new lememelidir.. IoC bunu bize sağlıyor.
        customerDal.add();
    }

    // setter injection
    public ICustomerDal getCustomerDal() {
        return customerDal;
    }

    public void setCustomerDal(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }
}
