package ca.bcit.comp2522.lab03;

import java.util.Objects;

/**
 *
 * @author Richard Ho
 * @author Gem Baojimin Sha
 */
public class IPhone16 extends IPhone
{
    private boolean     highResCamera;
    private int         memoryGB;
    private double      phonePlanMinutes;
    private String      iphone16Carrier;

    public IPhone16(final double  phonePlanMinutes,
                    final String  iphone16Carrier,
                    final boolean highResCamera,
                    final int     memoryGB)
    {
        super(phonePlanMinutes, iphone16Carrier);

        this.highResCamera = highResCamera;
        this.memoryGB      = memoryGB;
    }

    public int getMemoryGB()
    {
        return memoryGB;
    }

    public boolean isHighResCamera()
    {
        return highResCamera;
    }

    public void setMemoryGB(final int memoryGB)
    {
        this.memoryGB = memoryGB;
    }

    public void setHighResCamera(final boolean highResCamera)
    {
        this.highResCamera = highResCamera;
    }

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

    @Override
    void printDetails()
    {
        System.out.println(toString());
    }

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

    @Override
    public int hashCode()
    {
        return Objects.hashCode(phonePlanMinutes);
    }

}
