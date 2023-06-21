public class Employees {
    String Name;
    String Position;
    double Salary;
    int Experience;
    String Educational_level;

    // Generating setters
    public void setName(String name) {
        Name = name;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setSalary(double salary) {

        Salary = (salary / 1.35) + ((salary / 1.35) * 5 / 100 * Experience);

        if (Educational_level.toLowerCase() == "bachelor degree 500" || Educational_level == "diploma degree 250") {

            if (Position.toLowerCase() == "full time") {
                Salary += salary / 1.35 * 3 / 100;
            } else if (Position.toLowerCase() == "part time") {
                Salary += salary / 1.35 * 1.5 / 100;
            }

        }
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public void setEducational_level(String educational_level) {
        Educational_level = educational_level;
    }

    // Generating getters
    public String getName() {
        return Name;
    }

    public String getPosition() {
        return Position;
    }

    public double getSalary() {
        return Salary;
    }

    public int getExperience() {
        return Experience;
    }

    public String getEducational_level() {
        return Educational_level;
    }

}
