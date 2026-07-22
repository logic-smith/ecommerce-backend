package com.ecommerce.backend.dto;

import com.ecommerce.backend.model.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record OrderResponse(
        Long orderId,
        BigDecimal totalAmount,
        OrderStatus status,
        LocalDateTime orderDate,
        List<OrderItemResponse> items
) {}