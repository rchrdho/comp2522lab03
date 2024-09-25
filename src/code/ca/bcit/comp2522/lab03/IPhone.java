package ca.bcit.comp2522.lab03;

/**
 * Represents an IPhone device, extending the IDevice class.
 * This class specifies generic attributes that an IPhone MUST have
 * which includes its purpose, phonePlanMinutes, and phoneCarrier
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPhone extends IDevice
{

    private static final String IPHONE_PURPOSE = "talking";
    private static final double MINIMUM_MINUTES = 0.00;

    private double phonePlanMinutes;
    private String phoneCarrier;

    /**
     * Constructs an IPhone with specified phone plan minutes and carrier.
     *
     * @param phonePlanMinutes the number of minutes in the phone plan
     * @param carrier the phone carrier company
     */
    public IPhone(final double phonePlanMinutes,
                  final String carrier)
    {
        super(IPHONE_PURPOSE);

        isValidPhonePlanMinutes(phonePlanMinutes);

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

        return sb.toString();
    }

    /**
     * Prints the details of the IPhone.
     */
    @Override
    void printDetails()
    {
        System.out.println(this + "\n");
    }

    /**
     * Compares this IPhone phonePlanMinutes to another IPhones phonePlanMinutes.
     *
     * @param o the object to compare with
     * @return true if the objects phonePlanMinutes are equal, false otherwise
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
     * Returns a hash code value for the IPhone phonePlanMinutes.
     *
     * @return a hash code value for this object
     */
    @Override
    public int hashCode()
    {
        return Double.hashCode(phonePlanMinutes);
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
    public String getCarrier()
    {
        return phoneCarrier;
    }

    /**
     * Mutator for Carrier.
     *
     * @param carrier a string that is set as the new Carrier.
     */
    public void setCarrier(final String carrier)
    {
        this.phoneCarrier = carrier;
    }

    /**
     * Mutator for phonePlanMinutes
     *
     * @param phonePlanMinutes a double that is set as the new phonePlanMinutes
     */
    public void setPhonePlanMinutes(final double phonePlanMinutes)
    {
        this.phonePlanMinutes = phonePlanMinutes;
    }

    /**
     * Checks if the phone was created with reasonable minutes.
     *
     * @param phonePlanMinutes          the minutes to validate.
     * @throws IllegalArgumentException if the minutes are below 0.
     */
    protected void isValidPhonePlanMinutes(final double phonePlanMinutes)
    {
        if (phonePlanMinutes < MINIMUM_MINUTES)
        {
            throw new IllegalArgumentException("Invalid phone plan minutes, cannot be below 0");
        }
    }

}
