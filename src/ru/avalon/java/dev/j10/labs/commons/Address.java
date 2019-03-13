package ru.avalon.java.dev.j10.labs.commons;

/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
public class Address {
  
   private String country;
   private String city;
   private String street;
   private String housNum; // Номер дома
   private String flatNum; // Номер квартиры
   
   public Address(String country, String city, String street, String housNum, String flatNum){
    this.country = country ;
    this.city = city;
    this.street = street;
    this.housNum = housNum;
    this.flatNum = flatNum;
   }
   
   public String getAddress () {
    String fullAddress = country+" "+city+" "+street+" Дом "+housNum+" Квартира "+flatNum;
    return fullAddress;
   }
}