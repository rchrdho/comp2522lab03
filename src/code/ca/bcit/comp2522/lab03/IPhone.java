package ca.bcit.comp2522.lab03;

import java.util.Objects;
/**
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 * @version 1.0
 */
public class IPhone extends IDevice
{
    private static final String IPHONE_PURPOSE = "talking";

    private double phonePlanMinutes;
    private String phoneCarrier;

    public IPhone(final double phonePlanMinutes,
                  final String carrier)
    {
        super(IPHONE_PURPOSE);

        this.phonePlanMinutes = phonePlanMinutes;
        this.phoneCarrier     = carrier;

    }

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

    @Override
    void printDetails()
    {
        System.out.println(this.toString());
    }

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

    @Override
    public int hashCode()
    {
        return Objects.hashCode(phonePlanMinutes);
    }

    public double getPhonePlanMinutes()
    {
        return phonePlanMinutes;
    }

    public String getPhoneCarrier()
    {
        return phoneCarrier;
    }

}
