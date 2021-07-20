package com.muse.build.service;

import com.muse.build.dto.ProductDTO;
import org.springframework.stereotype.Service;

public interface ProductService {
    int add(ProductDTO dto);
}
