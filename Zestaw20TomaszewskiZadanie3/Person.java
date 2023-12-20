package Zestaw20TomaszewskiZadanie3;

public class Person {
    private String name;
    private int birthYear;
    public Person(String name, int birtYear){
        this.name = name;
        this.birthYear = birtYear;
    }
    public Person(String name){
        this(name, 1990);
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return 2023 - this.birthYear;
    }

    public static Person getOlder(Person pers1, Person pers2){
        if(pers1.getAge()>pers2.getAge())
            return pers1;
        else if(pers1.getAge()<pers2.getAge())
            return pers2;
        else
            return null;
    }

    public static Person getOldest(Person[] tabl){
        Person max = tabl[0];
        for(int i = 1; i<tabl.length; i++){
            if(tabl[i].getAge()>max.getAge())
                max = tabl[i];
        }
        return max;
    }

    public String toString(){
        return "Person: " + this.name + " birth year: " + this.birthYear + " age: " + this.getAge();
    }

    public static Person[] sortowanie(Person[] tabl){
        for(int i = 0; i<tabl.length-1; i++){
            for(int j = i+1; j<tabl.length; j++){
                if(tabl[i].getAge()>tabl[j].getAge()){
                    Person tmp = tabl[i];
                    tabl[i] = tabl[j];
                    tabl[j] = tmp;
                }
            }
        }
        return tabl;
    }

}
