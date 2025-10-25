package org.ramich.ecommerce.payment;

import org.ramich.ecommerce.customer.CustomerResponse;
import org.ramich.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
