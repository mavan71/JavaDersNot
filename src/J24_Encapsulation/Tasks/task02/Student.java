package J24_Encapsulation.Tasks.task02;

import J06_SwitchStatement.Scanner;

public class Student {

/*
Runner ve Student classları create ediniz
Student classı içinde;
String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz

Runner classın içinde;
girilen değerleri aşagıdaki gibi print eden code create ediniz
Örnek:
age 48'dir.
name Haluk'tur.

name(isim) olarak;
"Student name is Haluk"
ve
age(yaş) olarak da;
"He is 48 years old"
 */

  private  String name;
  private int age;

  public Student(String name, int age) {
      this.name =name;
      this.age =age;

  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student name is " + name +
                "\n He/She is " + age +
                " years old";
    }


}
