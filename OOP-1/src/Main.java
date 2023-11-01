// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JavaDeveloper firstDeveloper = new JavaDeveloper(3500);
        firstDeveloper.getRequiredSkills();
        firstDeveloper.getSalary();

        JuniorJavaDeveloper secondDeveloper = new JuniorJavaDeveloper(2000);
        secondDeveloper.getRequiredSkills();
        secondDeveloper.getSalary();
    }
}

class JavaDeveloper{
     int salary;
    JavaDeveloper(){

    }
    JavaDeveloper(int salary){
        this.salary = salary;
    }
    private  String skills = "OOPs patterns and concepts, \n" +
            "writing reusable Java libraries, \n" +
            "concurrency patterns, MVC patterns, \n" +
            "JDBC, RESTful web services, \n" +
            "popular web application frameworks, \n" +
            "Java GUI frameworks, \n" +
            "Ability to write clean, \n" +
            "code versioning tools, \n" +
            "and continuous integration.\n";
    final void getSalary(){
        System.out.println(this.salary + " azn \n");
    }
    void getRequiredSkills(){
        System.out.println(skills);
    }
}

class JuniorJavaDeveloper extends JavaDeveloper{
    private  String skills = "Java 11+ \n" +
            "Spring Framework \n" +
            "Algorithms and Data structure \n" +
            "Design Patterns \n" +
            "SQL \n" +
            "Database version control (Liquibase, Flyway or another) \n" +
            "RESTful web services \n" +
            "GIT \n";
    JuniorJavaDeveloper(){

    }
    JuniorJavaDeveloper(int salary){
        super(salary);
    }

    @Override
    void getRequiredSkills() {
        System.out.println(skills);
    }
}