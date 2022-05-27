package jp.co.internous.knights.model.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jp.co.internous.knights.model.domain.MstProduct;

@Mapper
public interface MstProductMapper {

	@Select("SELECT * FROM mst_product")
	List<MstProduct> findAll();
	
	List<MstProduct> findByProductName(@Param("productName") String[] productName);

	
	List<MstProduct> findByCategoryIdAndProductName(
			@Param("categoryId") int categoryId,
			@Param("productName") String[] productName);
	
	@Select("SELECT * FROM mst_product WHERE id = #{id}")
	MstProduct findById(int id);
}
