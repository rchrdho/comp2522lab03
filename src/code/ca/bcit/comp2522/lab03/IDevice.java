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
    // constant defining device purpose.
    private final String purpose;

    /**
     * Constructs an IDevice with a specified purpose.
     * @param purpose String representing purpose of device
     */
    public IDevice(final String purpose)
    {
        this.purpose = purpose;
    }
    /**
     * Gets the purpose of the device.
     *
     * @return the purpose of the device as a String
     */
    String getPurpose()
    {
        return purpose;
    }
    /**
     * Returns a string representation of the IDevice.
     * This implementation returns the purpose of the device.
     *
     * @return a string containing the device's purpose
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;

        sb = new StringBuilder();

        sb.append(getPurpose());

        return sb.toString();
    }
    /**
     * Abstract method to print the details of the device.
     * This method should be implemented by subclasses to provide
     * specific details about each type of device.
     */
    abstract void printDetails();
    /**
     * Compares this IDevice to another object for equality.
     * Two IDevices are considered equal if they have the same purpose and are of the same class.
     *
     * @param o the object to compare with this IDevice
     * @return true if the objects are equal, false otherwise
     */
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
    /**
     * Returns a hash code value for the IDevice.
     * The hash code is generated based on the device's purpose.
     *
     * @return a hash code value for this IDevice object
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(purpose);
    }
}
