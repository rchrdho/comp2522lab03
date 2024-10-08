package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * Represents an IPad device, extending the IDevice class.
 * This class defines the specific attributes and behaviors of an IPad.
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPad extends IDevice
{

    private static final String IPAD_PURPOSE = "learning";

    private boolean   hasCase;
    private String    systemVersion;

    /**
     * Constructs an IPad with specified case status and OS version.
     *
     * @param hasCase whether the iPad has a case
     * @param osVersion the operating system version of the iPad
     */
    public IPad(final boolean hasCase,
                final String  osVersion)
    {
        super(IPAD_PURPOSE);

        this.hasCase       = hasCase;
        this.systemVersion = osVersion;
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

        return systemVersion;
    }

    /**
     * Sets the operating system version of the iPad.
     *
     * @param osVersion the new operating system version
     */
    public void setOsVersion(final String osVersion)
    {

        this.systemVersion = osVersion;
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
        sb.append("\nHas Case: "        + hasCase);
        sb.append("\nIPAD OS version: " + systemVersion);

        return sb.toString();
     }

    /**
     * Prints the details of the IPad.
     */
    @Override
    void printDetails()
    {
        System.out.println(this + "\n");
    }

    /**
     * Compares this IPads system version with another IPads system version.
     *
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    public boolean equals(final Object o)
    {
        if(o == null)
        {
            return false;
        }

        if(o instanceof IPad)
        {
            IPad newIPad;

            newIPad = (IPad) o;

            return this.systemVersion.equalsIgnoreCase(newIPad.systemVersion);
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
        return Objects.hashCode(systemVersion);
    }

}
