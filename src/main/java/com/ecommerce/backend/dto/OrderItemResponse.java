package com.ecommerce.backend.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
        Long itemId,
        Long productId,
        String productName,
        Integer quantity,
        BigDecimal priceAtPurchase,
        BigDecimal subtotal
) {}