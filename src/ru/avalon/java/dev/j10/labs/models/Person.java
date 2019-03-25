package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Address;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    
    
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
    
    // помоему вышеописанное задание не отсюда

   
    private char firstLetter; // используется в случае, если у человека нет отчества, но есть второе имя
    private Passport passp;
    private Address addr;
    
    public Person(){
        passp = new Passport();
        addr = new Address();
        
    }

       
    
    public Passport getPassp() {
        return passp;
    }
    
    public Address getAddr() {
       
    return addr;
    }
           
        
    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    
    
    public String getFullName() {
        String fullName = null;
        
        if (passp.getSecondName() == ("")){
           fullName = passp.getName()+" "+passp.getFatherName()+" "+passp.getSurname();
        } else if (passp.getFatherName() == ("") ){
            firstLetter = passp.getSecondName().charAt(firstLetter); // Достаем первую букву из String secondName
             fullName = passp.getName()+" "+firstLetter+". "+passp.getSurname();
        }else if (passp.getSecondName() == ("") && passp.getFatherName() == ("") ){
           fullName = passp.getName()+" "+passp.getSurname();
        }
        return fullName;
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        
    }
    
    
    // Этот геттер здесь не нужен. Он реализован в классе Address
    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        String fullAddress ;
        fullAddress = addr.getCountry()+" "+addr.getCity()+" "+addr.getStreet()+" Дом "+addr.getHousNum()+" Квартира "+addr.getHousNum();
    return fullAddress;
    }
}