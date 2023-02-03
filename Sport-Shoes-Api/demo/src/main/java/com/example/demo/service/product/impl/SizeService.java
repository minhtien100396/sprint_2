package com.example.demo.service.product.impl;

import com.example.demo.dto.size.ISizeDto;
import com.example.demo.dto.size.SizeDto;
import com.example.demo.model.product.Size;
import com.example.demo.repository.product.ISizeRepository;
import com.example.demo.service.product.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService implements ISizeService {
    @Autowired
    private ISizeRepository sizeRepository;

    @Override
    public List<Size> getAllSize() {
        return sizeRepository.findAll();
    }

    @Override
    public List<ISizeDto> getAllSizeDto(SizeDto sizeDto) {
        return sizeRepository.getAllSizeDto(sizeDto);
    }
}
