package com.wbl.encapsulation;

public class TestEncapsulation {

    public static void main(String[] args) {
        Account a = new Account();
        a.setAcc_no(1);
        a.setName("shilpa");
        a.setEmail("shilpa@gmail.com");
        a.setAmount(530);
        System.out.println("Acc no " +a.getAcc_no() );
        System.out.println("Name " +a.getName());
        System.out.println("Email " +a.getEmail());
        System.out.println("Amount " +a.getAmount());
    }
}
