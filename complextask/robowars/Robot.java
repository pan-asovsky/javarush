package javarush.complextask.robowars;

public class Robot extends AbstractRobot {

    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
