package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * Represents an IPad device, extending the IDevice class.
 * This class defines the specific attributes and behaviors of an IPad.
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPad extends IDevice
{

    // constant defining device purpose.
    private static final String IPad_PURPOSE = "learning";

    // iPads details
    private boolean hasCase;
    private String osVersion;

    /**
     * Constructs an IPad with specified case status and OS version.
     *
     * @param hasCase whether the iPad has a case
     * @param osVersion the operating system version of the iPad
     */
    public IPad(final boolean hasCase,
                final String  osVersion)
    {
        super("IPad_PURPOSE");

        this.hasCase = hasCase;
        this.osVersion = osVersion;
    }

    /**
     * Checks if the iPad has a case.
     *
     * @return true if the iPad has a case, false otherwise
     */
    public boolean hasCase()
    {
        return hasCase;
    }

    /**
     * Sets whether the iPad has a case.
     *
     * @param hasCase true if the iPad has a case, false otherwise
     */
    public void setHasCase(final boolean hasCase)
    {

        this.hasCase = hasCase;
    }

    /**
     * Gets the operating system version of the iPad.
     *
     * @return the operating system version
     */
    public String getOsVersion()
    {

        return osVersion;
    }

    /**
     * Sets the operating system version of the iPad.
     *
     * @param osVersion the new operating system version
     */
    public void setOsVersion(String osVersion)
    {

        this.osVersion = osVersion;
    }

    /**
     * Returns a string representation of the IPad.
     *
     * @return a string containing the IPad's details
     */
     @Override
    public String toString()
     {
        final StringBuilder sb;

        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nHas Case: " + hasCase);
        sb.append("\nIPAD OS version: " + osVersion);

        return sb.toString();

     }

    /**
     * Prints the details of the IPad.
     */
    @Override
    void printDetails()
    {
        System.out.println(this.toString());
    }

    /**
     * Compares this IPad to another object for equality.
     *
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    public boolean equals(final Object o)
    {
        if(o == null){
            return false;
        }

        if(o instanceof IPad){
            IPad newIPad;
            newIPad = (IPad) o;

            return this.osVersion.equals(newIPad.getOsVersion());

        }

        return false;
    }

    /**
     * Returns a hash code value for the IPad.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {

        return Objects.hashCode(osVersion);
    }

}
