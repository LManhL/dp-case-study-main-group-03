package subsystem;

import entity.payment.CreditCard;
import entity.payment.PaymentTransaction;
import subsystem.interbank.InterbankSubsystemController;

/***
 * The {@code InterbankSubsystem} class is used to communicate with the
 * Interbank to make transaction.
 * 
 * @author hieud
 *
 */

/**
 * InterbankSubsystem được thiết kế là Object Adapter
 * InterbankInterface là Client interface
 */
public class InterbankSubsystem implements InterbankInterface {

	/**
	 * Represent the controller of the subsystem
	 */

	 /**
	 * Biến ctrl là adaptee
	 * InterbankSubsystemController là Service
	 */

	private InterbankSubsystemController ctrl;

	/**
	 * Initializes a newly created {@code InterbankSubsystem} object so that it
	 * represents an Interbank subsystem.
	 */
	public InterbankSubsystem() {
		this.ctrl = new InterbankSubsystemController();
	}

	/**
	 * @see InterbankInterface#payOrder(CreditCard, int,
	 *      String)
	 */
	@Override
	public PaymentTransaction payOrder(CreditCard card, int amount, String contents) {
		// Thực hiện lời gọi tương ứng đến Service
		PaymentTransaction transaction = ctrl.payOrder(card, amount, contents);
		return transaction;
	}

	/**
	 * @see InterbankInterface#refund(CreditCard, int,
	 *      String)
	 */
	@Override
	public PaymentTransaction refund(CreditCard card, int amount, String contents) {
		// Thực hiện lời gọi tương ứng đến Service
		PaymentTransaction transaction = ctrl.refund(card, amount, contents);
		return transaction;
	}
}
