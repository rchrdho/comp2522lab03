package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 *
 * @author Richard Ho
 * @author Gem
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
    public boolean equals(final Object o)
    {

        if (o == null)
        {
            return false;
        }

        if (!(o.getClass().equals(this.getClass())))
        {
            return false;
        }

        final IDevice obj;
        obj = (IDevice)o;

        return this.getPurpose().equals(obj.getPurpose());
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(purpose);
    }
}
