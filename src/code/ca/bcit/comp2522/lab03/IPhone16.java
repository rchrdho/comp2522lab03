package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 * Represents an iPhone 16 device, extending the IPhone class.
 * This class defines the specific attributes and behaviors of an iPhone 16,
 * including its camera resolution, memory capacity, phone plan minutes, and carrier.
 * @author Richard Ho
 * @author Gem Baojimin Sha
 */
public class IPhone16 extends IPhone
{
    // constant defining device purpose.
    private boolean highResCamera;
    private int     memoryGB;

    // iPhone 16 details
    private double  phonePlanMinutes;
    private String  iphone16Carrier;

    /**
     * Constructs an iPhone 16 with specified attributes.
     *
     * @param phonePlanMinutes the number of minutes in the phone plan
     * @param iphone16Carrier the phone carrier for this iPhone 16
     * @param highResCamera whether the iPhone has a high-resolution camera
     * @param memoryGB the amount of memory in gigabytes
     */
    public IPhone16(final double phonePlanMinutes,
                    final String iphone16Carrier,
                    final boolean highResCamera,
                    final int     memoryGB)
    {
        super(phonePlanMinutes, iphone16Carrier);

        this.highResCamera = highResCamera;
        this.memoryGB      = memoryGB;
    }

    /**
     * Gets the memory capacity of the iPhone 16.
     *
     * @return the memory capacity in gigabytes
     */
    public int getMemoryGB()
    {
        return memoryGB;
    }

    /**
     * Checks if the iPhone 16 has a high-resolution camera.
     *
     * @return true if the iPhone has a high-resolution camera, false otherwise
     */
    public boolean isHighResCamera()
    {
        return highResCamera;
    }

    /**
     * Sets the memory capacity of the iPhone 16.
     *
     * @param memoryGB the new memory capacity in gigabytes
     */
    public void setMemoryGB(final int memoryGB)
    {
        this.memoryGB = memoryGB;
    }

    /**
     * Sets whether the iPhone 16 has a high-resolution camera.
     *
     * @param highResCamera true if the iPhone has a high-resolution camera, false otherwise
     */
    public void setHighResCamera(final boolean highResCamera)
    {
        this.highResCamera = highResCamera;
    }

    /**
     * Returns a detailed string representation of the iPhone 16.
     *
     * @return a string containing the iPhone 16's details, including camera resolution, memory, plan minutes, and carrier
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;

        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nHigh res: "            + highResCamera);
        sb.append("\nMemory GB: "           + memoryGB);
        sb.append("\nPhone Plan Minutes: "  + phonePlanMinutes);
        sb.append("\nIPhone 16 Carrier: "   + iphone16Carrier);
        sb.append("\n");

        return sb.toString();
    }

    /**
     * Prints the complete details of the iPhone 16 to the console.
     */
    @Override
    void printDetails()
    {
        System.out.println(toString());
    }

    /**
     * Compares this iPhone 16 to another object for equality.
     * Two iPhone 16s are considered equal if they have the same camera resolution and phone plan minutes.
     *
     * @param o the object to compare with this iPhone 16
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == null)
        {
            return false;
        }

        if (o instanceof IPhone16)
        {
            final IPhone16 newPhone;
            newPhone = (IPhone16) o;

            return this.highResCamera == newPhone.highResCamera &&
                    this.phonePlanMinutes == newPhone.phonePlanMinutes;
        }

        return false;
    }

    /**
     * Returns a hash code value for the iPhone 16.
     * The hash code is generated based on the phone plan minutes.
     *
     * @return a hash code value for this iPhone 16 object
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(phonePlanMinutes);
    }

}
