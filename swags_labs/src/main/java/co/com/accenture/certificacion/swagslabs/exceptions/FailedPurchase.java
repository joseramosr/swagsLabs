package co.com.accenture.certificacion.swagslabs.exceptions;

public class FailedPurchase extends AssertionError{

	public static final String FAILED_PURCHASE_ERROR = "ERROR, THE PURCHASE COULD NOT BE MADE";

	public FailedPurchase(String message, Throwable testErrorException) {
		super(message, testErrorException);
	}
}
