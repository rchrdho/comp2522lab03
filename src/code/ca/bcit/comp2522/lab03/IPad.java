package ca.bcit.comp2522.lab03;

/**
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */

public class IPad extends IDevice {

    private static final String IPad_PURPOSE = "learning";

    private boolean hasCase;
    private String  systemVersion;

    public IPad(final boolean hasCase,
                final String systemVersion) {

        super("IPad_PURPOSE");
        this.hasCase = hasCase;
        this.systemVersion = systemVersion;
    }

    public boolean hasCase() {
        return hasCase;
    }

    public void setHasCase(final boolean hasCase) {
        this.hasCase = hasCase;
    }
    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }
@Override
public String toString() {
    final StringBuilder sb;
    sb = new StringBuilder();

    sb.append(super.toString());
    sb.append("\nHasCase: " + hasCase);
    sb.append("\nIPAD system version: " + systemVersion);
    return sb.toString();

}
    @Override
    public void printDetails(){
        System.out.println(this.toString());
    }

}
