package org.ramich.ecommerce.kafka;

import org.ramich.ecommerce.customer.CustomerResponse;
import org.ramich.ecommerce.order.PaymentMethod;
import org.ramich.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
