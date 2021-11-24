package com.wbl.oopsexamples;

public class Employee {
            int id;
            String Name;
            com.wbl.oopsexamples.Address address;

            public  Employee(int id, String name, Address address) {
                this.id = id;
                this.Name = name;
                this.address = address;
            }

            public void display() {
                System.out.println("id id " + id + "Name" + Name + "Address" + address);
            }

            public static void main(String[] args) {
                Address a1 = new Address(101, "modena", "mountain house");
                Employee e = new Employee( 1,"shilpa",a1);
                e.display();
            }
        }


