public class App {
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
    }
}
