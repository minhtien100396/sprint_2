package com.example.demo.repository.product;

import com.example.demo.dto.size.ISizeDto;
import com.example.demo.dto.size.SizeDto;
import com.example.demo.model.product.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface ISizeRepository extends JpaRepository<Size, Integer> {
    @Query(value = "select s.id id, s.size size from product_detail pd" +
            " join size s on pd.size_id = s.id" +
            " join product p on p.id =pd.product_id" +
            " where p.id =:#{#sizeDto.productId} and pd.color_id =:#{#sizeDto.colorId}", nativeQuery = true)
    List<ISizeDto> getAllSizeDto(@Param("sizeDto") SizeDto sizeDto);
}
