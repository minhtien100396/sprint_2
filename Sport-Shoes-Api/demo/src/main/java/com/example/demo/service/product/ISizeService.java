package com.example.demo.service.product;

import com.example.demo.dto.size.ISizeDto;
import com.example.demo.dto.size.SizeDto;
import com.example.demo.model.product.Size;

import java.util.List;

public interface ISizeService {
    List<Size> getAllSize();

    List<ISizeDto> getAllSizeDto(SizeDto sizeDto);
}
