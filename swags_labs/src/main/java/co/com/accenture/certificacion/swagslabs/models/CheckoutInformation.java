package co.com.accenture.certificacion.swagslabs.models;

import co.com.accenture.certificacion.swagslabs.models.builders.CheckoutInformationBuilder;
public class CheckoutInformation {
    private final String firstName;
    private final String lastName;
    private final String zipCode;

    public CheckoutInformation(CheckoutInformationBuilder checkoutInformationBuilder) {
        this.firstName = checkoutInformationBuilder.getFirstName();
        this.lastName = checkoutInformationBuilder.getLastName();
        this.zipCode = checkoutInformationBuilder.getZipCode();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZipCode() {
        return zipCode;
    }
}
