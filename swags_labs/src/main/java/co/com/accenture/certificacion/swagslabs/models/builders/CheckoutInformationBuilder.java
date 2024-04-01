package co.com.accenture.certificacion.swagslabs.models.builders;

import co.com.accenture.certificacion.swagslabs.models.CheckoutInformation;
import org.apache.commons.lang3.builder.Builder;

public class CheckoutInformationBuilder implements Builder<CheckoutInformation> {

    private final String firstName;
    private  String lastName;
    private  String zipCode;

    private CheckoutInformationBuilder(String firstName) {
        this.firstName = firstName;
    }

    public static CheckoutInformationBuilder enteringTheFirstName(String firstName) {
        return new CheckoutInformationBuilder(firstName);
    }

    @Override
    public CheckoutInformation build() {return new CheckoutInformation(this);}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public CheckoutInformationBuilder enteringLastName(String lastName) {
        this.lastName=lastName;
        return this;
    }

    public CheckoutInformationBuilder enteringZipCode(String zipCode) {
        this.zipCode=zipCode;
        return this;
    }
}
