/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lan.rgb.paragui;

import java.time.LocalDate;

/**
 *
 * @author diak
 */
public class Employee {
  Integer id;
  String name;
  String city;
  Double salary;
  LocalDate birth;

  public Employee(int id, String name, String city, double salary, LocalDate birth) {
    this.id = id;
    this.name = name;
    this.city = city;
    this.salary = salary;
    this.birth = birth;
  }
}
