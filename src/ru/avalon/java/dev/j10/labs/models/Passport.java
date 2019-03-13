package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    private String name;
    private String secondName;
    private String fatherName;
    private String surname;
    private String birthday;
    private String passpDate; // Дата выдачи пасспорта
    private String ufms; // УФМС России
    
    public Passport (String name, String secondName, String fatherName,String surname, String birthday, String passpDate, String ufms){ 
        this.name = name;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.surname = surname;
        this.birthday = birthday;
        this.passpDate = passpDate;
        this.ufms = ufms;
    }
    // про перегрузку конструкторов помню, но не считаю необходимым использовать. Все поля должны быть заполнены! Паспорт всё таки, а не бумажка.
    
    public String getPassportData (){
        String passportData = name+" "+secondName+" "+fatherName+" "+surname+" "+birthday+" "+passpDate+" "+ufms;
        return passportData;
    }
    
    
    
    
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
}
