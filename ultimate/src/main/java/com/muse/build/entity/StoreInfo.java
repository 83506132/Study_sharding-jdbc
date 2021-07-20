package com.muse.build.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreInfo {
    private long id;
    private String store_name;
    private long reputation;
    private String reegion_code;
}
