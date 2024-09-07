public class RA2920482411020 {
    
    private String name;
    private String ra;
    private int age;
    private String githubLink;
    private String linkedinLink;
    private String course;
    private int semester;

    // constructor
    public RA2920482411020() {
        this.name = "Richard Felix de Souza";
        this.ra = "2920482411020";
        this.age = 18;
        this.course = "Análise e Desenvolvimento de Sistemas";
        this.semester = 1;
    }



    // name methods
    public String getName() {
        return name;
    }
    public void setName(String _name) {
        this.name = _name;
    }



    // RA methods
    public String getRA() {
        return ra;
    }



    // age methods
    public int getAge() {
        return age;
    }
    public void setAge(int _age) {
        this.age = _age;
    }



    // github methods
    public String getGithub() {
        return githubLink;
    }
    public void setGithub(String _githubLink) {
        this.githubLink = _githubLink;
    }
    public void removeGithub() {
        this.githubLink = null;
    }



    // linkedin methods
    public String getLinkedin() {
        return linkedinLink;
    }
    public void setLinkedin(String _linkedinLink) {
        this.linkedinLink = _linkedinLink;
    }
    public void removeLinkedin() {
        this.linkedinLink = null;
    }



    // course methods
    public String getCourse() {
        return course;
    }



    // semester methods
    public int getSemester() {
        return semester;
    }
    public void setSemester(int _semester) {
        this.semester = _semester;
    }
}
