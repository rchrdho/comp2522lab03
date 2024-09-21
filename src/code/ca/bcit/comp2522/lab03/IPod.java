package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 *
 * @author Richard Ho
 * @author Gem
 * @version 1.0
 */
public abstract class IPod extends IDevice
{

    private static final String purpose = "music";

    private final int numberOfSongsStored;
    private final double maxVolumeDb;

    public IPod(final int numberOfSongsStored,
                final double maxVolumeDb)
    {
        super(purpose);

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
        if (!(o instanceof IPod))
        {
            return false;
        }

        final IPod ipod;
        ipod = (IPod) o;

        return this.numberOfSongsStored == ipod.numberOfSongsStored;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(numberOfSongsStored);
    }
}
