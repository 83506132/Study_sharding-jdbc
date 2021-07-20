package com.muse.build.dto;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private long product_info_id;
    private long store_info_id;
    private String product_name;
    private String spec;
    private String region_code;
    private BigDecimal price;
    private String picture;
    private String describe;
}
