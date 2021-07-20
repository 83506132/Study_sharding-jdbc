package com.muse.build.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductDescribe {
    private long id;
    private long product_info_id;
    private String describe;
    private long store_info_id;
}
