public class App {
    
    // shows student info in a clear and readable manner
    public static void showInfo(RA2920482411020 student) {
        System.out.println(student.getName() + ", " + student.getAge() + " anos");
        System.out.println("Cursando o " + student.getSemester() + "º semestre de " + student.getCourse());
        System.out.println("RA: " + student.getRA());

        if (student.getGithub() != null) {
            System.out.println("GitHub: " + student.getGithub());
        }

        if (student.getLinkedin() != null) {
            System.out.println("LinkedIn: " + student.getLinkedin());
        }
    }



    public static void main(String[] args) {
        RA2920482411020 student = new RA2920482411020();
        showInfo(student);

        student.setName("Felix de Souza");
        student.setAge(19);
        student.setSemester(2);

        student.setGithub("github.com/feliquisds");
        student.setLinkedin("linkedin.com/in/feliquisds");

        showInfo(student);
    }
}
