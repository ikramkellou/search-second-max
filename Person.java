public class Person {
    String nom;
    int age;
    
    public Person(){
        this.nom = "";
        this.age = 0;
    }
    public Person(int age, String nom){
        this.nom = nom;
        this.age = age;
    }


    public String getNom(){
        return nom;
    }

    public int getAge(){
        return age;
    }


    
}
