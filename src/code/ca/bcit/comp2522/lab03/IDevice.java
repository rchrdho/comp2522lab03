package ca.bcit.comp2522.lab03;

/**
 *
 */
public abstract class IDevice
{

    private final String purpose;

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

        return true;
    }

    @Override
    public int hashCode()
    {

        return this.purpose.hashCode();
    }
}
