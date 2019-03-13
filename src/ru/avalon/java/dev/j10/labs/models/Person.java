package ru.avalon.java.dev.j10.labs.models;

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

    private String name;
    private String secondName;
    private String fatherName;
    private String surname;
    private String fullName;
    private char firstLetter; // используется в случае, если у человека нет отчества, но есть второе имя
    
    
    public Person(String name,String secondName,String fatherName, String surname){
        this.name = name;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.surname = surname;
        
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
        
        if (secondName == ("")){
            fullName = name+" "+fatherName+" "+surname;
        } else if (fatherName == ("") ){
            firstLetter = secondName.charAt(firstLetter); // Достаем первую букву из String secondName
            fullName = name+" "+firstLetter+". "+surname;
        }else if (secondName == ("") && fatherName == ("") ){
            fullName = name+" "+surname;
        }
        
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        return fullName;
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
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return null;
    }
}