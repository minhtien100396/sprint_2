package com.example.demo.controller.product;

import com.example.demo.dto.size.ISizeDto;
import com.example.demo.dto.size.SizeDto;
import com.example.demo.model.product.Size;
import com.example.demo.service.product.ISizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/size")
public class SizeRestController {
    @Autowired
    private ISizeService sizeService;

    @GetMapping
    public ResponseEntity<List<Size>> getAllSize() {
        List<Size> sizeList = sizeService.getAllSize();
        if (sizeList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(sizeList, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<List<ISizeDto>> getAllSizeDto(@RequestBody SizeDto sizeDto) {
        List<ISizeDto> sizeDtos = sizeService.getAllSizeDto(sizeDto);
        if (sizeDtos.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(sizeDtos, HttpStatus.OK);
    }
}
