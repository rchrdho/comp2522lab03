package ca.bcit.comp2522.lab03;

/**
 *
 */
public abstract class IDevice
{

    private final String purpose;

    IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    String getPurpose()
    {
        return this.purpose;
    }

    abstract void printDetails();

    @Override
    public String toString()
    {
        final StringBuilder sb;

        sb = new StringBuilder();

        sb.append(getPurpose());

        return sb.toString();

    }

    @Override
    boolean equals();
}
