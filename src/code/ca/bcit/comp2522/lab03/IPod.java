package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * Represents an IPod device, extending the IDevice class.
 * This class defines the specific attributes and behaviors of an IPod.
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPod extends IDevice
{

    // constant defining device purpose.
    private static final String DEVICE_PURPOSE = "music";

    // ipods unique details
    private final int    numberOfSongsStored;
    private final double maxVolumeDb;

    /**
     * Constructs an IPod with the specified number of songs stored and maximum volume.
     * @param numberOfSongsStored
     * @param maxVolumeDb
     */
    public IPod(final int    numberOfSongsStored,
                final double maxVolumeDb)
    {
        super(DEVICE_PURPOSE);

        this.numberOfSongsStored = numberOfSongsStored;
        this.maxVolumeDb         = maxVolumeDb;
    }
    /**
     * Returns a string representation of the IPod object.
     *
     * @return a string containing the IPod's details, including the number of songs stored and maximum volume
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;

        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nNumber of Songs Stored: " + numberOfSongsStored);
        sb.append("\nMax Volume Db: "          + maxVolumeDb);
        sb.append("\n");

        return sb.toString();
    }
    /**
     * Prints the details of the IPod to the console.
     */
    @Override
    void printDetails()
    {
        System.out.println(this);
    }

    /**
     * Compares this IPod object to another object for equality.
     *
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == null)
        {
            return false;
        }

        if (o instanceof IPod)
        {

            final IPod ipod;
            ipod = (IPod) o;

            return this.numberOfSongsStored == ipod.numberOfSongsStored;
        }

        return false;
    }

    /**
     * Generates a hash code for the IPod object.
     *
     * @return the hash code based on the number of songs stored
     */
    @Override
    public int hashCode()
    {
        return Integer.hashCode(numberOfSongsStored);
    }


}
