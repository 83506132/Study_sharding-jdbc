package com.muse.build.entity;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Region {
    private long id;
    private String region_code;
    private String region_name;
    private int level;
    private String parent_region_code;
}
