package jp.co.internous.knights.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.internous.knights.model.domain.MstCategory;
import jp.co.internous.knights.model.domain.MstProduct;
import jp.co.internous.knights.model.form.SearchForm;
import jp.co.internous.knights.model.mapper.MstProductMapper;
import jp.co.internous.knights.model.mapper.MstCategoryMapper;
import jp.co.internous.knights.model.session.LoginSession;

@Controller
@RequestMapping("/knights")
public class IndexController {
	
	@Autowired
	private MstProductMapper productMapper;
	
	@Autowired
	private MstCategoryMapper categoryMapper;
	
	@Autowired
	private LoginSession loginSession;
	
	@RequestMapping("/")
	public String index(Model m) {

		if (!loginSession.isLoginFlag() && loginSession.getTemporaryId() == 0) {
			int tmpUserId = (int)(Math.random() * 1000000000 * -1);
			while (tmpUserId > -100000000) {
				tmpUserId *= 10;
			}
			loginSession.setTemporaryId(tmpUserId);
		}
		
		List<MstCategory> categories = categoryMapper.findAll();	

		List<MstProduct> productList = productMapper.findAll();
		
		m.addAttribute("categories", categories);
		m.addAttribute("selected", 0);
		m.addAttribute("products", productList);
		m.addAttribute("loginSession",loginSession);
		
		return "index";
	}

	
	@RequestMapping("/searchItem")
	public String searchItem(SearchForm search,Model m) {
		
		List<MstProduct> productList = null;
		
		String productName = search.getProductName().replaceAll("　", " ").replaceAll("\\s{2,}", " ").trim();

		if(search.getCategory() == 0) {
			productList = productMapper.findByProductName(productName.split(" "));
		}else {
			productList = productMapper.findByCategoryIdAndProductName(search.getCategory(),productName.split(" "));
		}
		
		List<MstCategory> categories = categoryMapper.findAll();

		m.addAttribute("productName", productName);
		m.addAttribute("selected", search.getCategory()); 
		m.addAttribute("categories", categories); 
		m.addAttribute("products", productList);
		m.addAttribute("loginSession",loginSession);
		
		return "index";
	}
	
}
