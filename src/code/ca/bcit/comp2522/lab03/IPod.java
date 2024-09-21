package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPod extends IDevice
{

    private static final String DEVICE_PURPOSE = "music";

    private final int numberOfSongsStored;
    private final double maxVolumeDb;

    public IPod(final int numberOfSongsStored,
                final double maxVolumeDb)
    {
        super(DEVICE_PURPOSE);

        this.numberOfSongsStored = numberOfSongsStored;
        this.maxVolumeDb = maxVolumeDb;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nNumber of Songs Stored: " + numberOfSongsStored);
        sb.append("\nMax Volume Db: " + maxVolumeDb);

        return sb.toString();
    }

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

    @Override
    public int hashCode()
    {
        return Objects.hashCode(numberOfSongsStored);
    }

    @Override
    void printDetails()
    {
        System.out.println(this.toString());
    }

    protected int getNumberOfSongsStored()
    {
        return numberOfSongsStored;
    }

    protected double getMaxVolumeDb()
    {
        return maxVolumeDb;
    }
}
