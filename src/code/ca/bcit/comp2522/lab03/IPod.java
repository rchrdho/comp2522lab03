package ca.bcit.comp2522.lab03;

public abstract class IPod extends IDevice
{

    private static final String purpose = "music";

    private final int numberOfSongsStored;
    private final double maxVolumeDb;

    public IPod(final String purpose,
                final int numberOfSongsStored,
                final double maxVolumeDb)
    {
        super(purpose);

        this.numberOfSongsStored = numberOfSongsStored;
        this.maxVolumeDb = maxVolumeDb;
    }


}
