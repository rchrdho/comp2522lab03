package ca.bcit.comp2522.lab03;

/**
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class Ipad extends IDevice {

    private static final String IPad_PURPOSE = "learning";
    private final boolean hasCase;
    private final String systemVersion;

    public Ipad(boolean hasCase,
                String systemVersion) {
        super(DEVICE_PURPOSE);
        this.hasCase = hasCase;
        this.systemVersion = systemVersion;
    }

}
