public class Pacient {
    private int dni;
    private String name;
    private String lastName;
    private char sex;
    private int age;
    private String allergies;
    private String deseases;

    public Pacient(int dni, String name, String lastName, char sex, int age, String allergies, String deseases) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.allergies = allergies;
        this.deseases = deseases;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAllergies() {
        return allergies;
    }
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    public String getDeseases() {
        return deseases;
    }
    public void setDeseases(String deseases) {
        this.deseases = deseases;
    }
    @Override
    public String toString() {
        String text = "\nDNI: " + dni + "\nName: " + name + "\nLastName: " + 
        lastName + "\nSex: " + sex + "\nAge: " + age + "\nAllergies: " + 
        allergies + "\nDeseases: " + deseases + "\n--------------------";
        return text;
    }
}
