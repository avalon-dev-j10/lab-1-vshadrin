package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    private static String ivanovFullName;
    private static String ivanovFullAddress;
    private static String smithFullName;
    private static String smithFullAddress;
    
    
    
   public static void main(String[] args) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        
        
        
        
        Person ivanov = new Person("Иванов","", "Иван", "Иванович");
        Address ivanovAddress = new Address ("Россия","Омск","Улица Ленина", "4", "5");
        Address smithAddress = new Address ("Англия","Дувр","Main street", "11", "3");
        Person smith = new Person("John","Edvard", "", "Smith");

        
       String ivanovFullName = ivanov.getFullName();
       String ivanovFullAddress = ivanovAddress.getAddress();
       String smithFullName = smith.getFullName();
       String smithFullAddress = smithAddress.getAddress();
       
       System.out.println(ivanovFullName);
       System.out.println(ivanovFullAddress);
       System.out.println(smithFullName); 
       System.out.println(smithFullAddress);
        
        
        
        
        
        
        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
