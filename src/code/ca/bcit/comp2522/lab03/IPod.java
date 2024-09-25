package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * Represents an IPod device, extending the IDevice class.
 * This class defines the specific attributes and behaviors of an IPod.
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPod extends IDevice
{

    private static final String DEVICE_PURPOSE = "music";

    private int     numberOfSongsStored;
    private double  maxVolumeDb;

    /**
     * Constructs an IPod with the specified number of songs stored and maximum volume.
     *
     * @param numberOfSongsStored Total number of songs currently stored on this ipod.
     * @param maxVolumeDb         Maximum volume this device can reach in decibels.
     */
    public IPod(final int    numberOfSongsStored,
                final double maxVolumeDb)
    {
        super(DEVICE_PURPOSE);

        this.numberOfSongsStored = numberOfSongsStored;
        this.maxVolumeDb         = maxVolumeDb;
    }

    /**
     * Accessor for numberOfSongsStored.
     *
     * @return total number of songs stored on ipod.
     */
    public int getNumberOfSongsStored()
    {
        return numberOfSongsStored;
    }

    /**
     * Accessor for maxVolumeDb.
     *
     * @return maximum volume this ipod can reach in decibels.
     */
    public double getMaxVolumeDb()
    {
        return maxVolumeDb;
    }

    /**
     *  Mutator for numberOfSongsStored.
     *
     * @param numberOfSongsStored the new numberOfSongStored to set
     */
    public void setNumberOfSongsStored(int numberOfSongsStored)
    {
        this.numberOfSongsStored = numberOfSongsStored;
    }

    /**
     * Mutator for maxVolumeDb.
     *
     * @param maxVolumeDb the new maxVolumeDb to set
     */
    public void setMaxVolumeDb(double maxVolumeDb)
    {
        this.maxVolumeDb = maxVolumeDb;
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

        return sb.toString();
    }

    /**
     * Prints the details of the IPod to the console.
     */
    @Override
    void printDetails()
    {
        System.out.println(this + "\n");
    }

    /**
     * Compares this IPod numberOfSongsStored with another IPods numberOfSongsStored.
     *
     * @param o the object to compare with
     * @return true if their numberOfSongsStored are equal, false otherwise
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

            return this.numberOfSongsStored == ipod.numberOfSongsStored ;
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
