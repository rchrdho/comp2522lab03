package ca.bcit.comp2522.lab03;

import java.util.Objects;
/**
 * Represents an IPhone device, extending the IDevice class.
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPhone extends IDevice
{
    // constant defining device purpose.
    private static final String IPHONE_PURPOSE = "talking";

    private double phonePlanMinutes;
    private String phoneCarrier;

    /**
     * Constructs an IPhone with specified phone plan minutes and carrier.
     *
     * @param phonePlanMinutes the number of minutes in the phone plan
     * @param carrier the phone carrier
     */
    public IPhone(final double phonePlanMinutes,
                  final String carrier)
    {
        super(IPHONE_PURPOSE);

        this.phonePlanMinutes = phonePlanMinutes;
        this.phoneCarrier     = carrier;

    }
    /**
     * Returns a string representation of the IPhone.
     *
     * @return a string containing the IPhone's details
     */
    @Override
    public String toString()
    {
        final StringBuilder sb;
        sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nPhone Plan Minutes: " + phonePlanMinutes);
        sb.append("\nPhone Carrier: "      + phoneCarrier);
        sb.append("\n");

        return sb.toString();
    }

    /**
     * Prints the details of the IPhone.
     */
    @Override
    void printDetails()
    {
        System.out.println(this.toString());
    }

    /**
     * Compares this IPhone to another object for equality.
     *
     * @param o the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(final Object o)
    {
        if (o == null)
        {
            return false;
        }

        if (o instanceof IPhone)
        {
            IPhone newIphone;
            newIphone = (IPhone) o;

            return this.phonePlanMinutes == newIphone.phonePlanMinutes;
        }

        return false;
    }

    /**
     * Returns a hash code value for the IPhone.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {
        return Objects.hashCode(phonePlanMinutes);
    }

    /**
     * Gets the number of minutes in the phone plan.
     *
     * @return the number of minutes in the phone plan
     */
    public double getPhonePlanMinutes()
    {
        return phonePlanMinutes;
    }

    /**
     * Gets the phone carrier.
     *
     * @return the phone carrier
     */
    public String getPhoneCarrier()
    {
        return phoneCarrier;
    }

}
