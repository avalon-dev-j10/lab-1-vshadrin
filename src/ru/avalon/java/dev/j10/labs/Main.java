package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.commons.Address;
import ru.avalon.java.dev.j10.labs.models.Passport;

public class Main {

    
    
    
   public static void main(String[] args) {

       
        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */

        
        
       Person ivanov = new Person();
       Person smith = new Person();
        
       Passport ivanPassp = ivanov.getPassp();
       ivanPassp.setName("Иван");
       ivanPassp.setSecondName("");
       ivanPassp.setFatherName("Иванович");
       ivanPassp.setSurname("Иванов");
      
       Passport smithPassp = smith.getPassp();
       smithPassp.setName("John");
       smithPassp.setSecondName("Edvadr");
       smithPassp.setFatherName("");
       smithPassp.setSurname("Smith");
       
              
       Address ivanAddr = ivanov.getAddr();
       ivanAddr.setCountry("Россия");
       ivanAddr.setCity("Норильск");
       ivanAddr.setStreet("Улица ленина");
       ivanAddr.setHousNum("4");
       ivanAddr.setFlatNum("5");
       
             
       Address smithAddr = smith.getAddr();
       smithAddr.setCountry("Англия");
       smithAddr.setCity("Дувр");
       smithAddr.setStreet("Main street");
       smithAddr.setHousNum("11");
       smithAddr.setFlatNum("3");
       
       String ivanovGetFullName = ivanov.getFullName();
       String smithFullName = smith.getFullName();
       String ivanovFullAddress = ivanov.getAddress();
       String smithFullAddress = smith.getAddress();
       
       
       
       System.out.println(ivanovGetFullName);
       System.out.println(ivanovFullAddress);
       
       System.out.println();

             
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
