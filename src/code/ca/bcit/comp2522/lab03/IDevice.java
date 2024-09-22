package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * The IDevice class abstracts models a basic Apple.inc product with a purpose.
 * Provides methods to determine if device purposes are equal
 * Has an abstract method to print device details
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public abstract class IDevice
{

    private final String purpose;

    /**
     *
     * @param purpose String representing purpose of device
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }

    String getPurpose()
    {
        return purpose;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb;

        sb = new StringBuilder();

        sb.append(getPurpose());

        return sb.toString();
    }

    abstract void printDetails();

    @Override
    public boolean equals(final Object o)
    {

        if (o == null)
        {
            return false;
        }

        if (o.getClass().equals(this.getClass()))
        {

            final IDevice device;
            device = (IDevice)o;

            return this.getPurpose().equals(device.getPurpose());
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(purpose);
    }
}
