public class Pacient {
    private int dni;
    private String name;
    private String lastName;
    private char sex;
    private int age;

    public Pacient(int dni, String name, String lastName, char sex, int age) {
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
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
    @Override
    public String toString() {
        String text = "PACIENTE \nDNI: " + dni + "\nName: " + name + "\nLastName: " + lastName + "\nSex: " + sex + "\nAge: " + age;
        return text;
    }
}
