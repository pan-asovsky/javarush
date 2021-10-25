package javarush.robowars;

public class BodyPart {

    final static BodyPart HEAD = new BodyPart("Голова");
    final static BodyPart ARM = new BodyPart("Рука");
    final static BodyPart CHEST = new BodyPart("Грудь");
    final static BodyPart LEG = new BodyPart("Нога");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }

}
