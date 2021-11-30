package enumEntities;

public enum Cities {

    ANAPOLIS,
    GOIÁS,
    BRASÍLIA;

    public static Cities getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

}
