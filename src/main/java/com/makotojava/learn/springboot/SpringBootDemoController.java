package com.makotojava.learn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import com.makotojava.learn.odot.service.CategoryService;
import com.makotojava.learn.odot.service.ItemService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})

public class SpringBootDemoController {

  @Autowired
  private ItemService itemService;

  @Autowired
  private CategoryService categoryService;

  @CrossOrigin(origins = "http://localhost:8080")
  
  public ItemService getItemService() {
    if (itemService == null) {
      throw new RuntimeException("ItemService not configured. Cannot continue.");
    }
    return itemService;
  }

  public CategoryService getCategoryService() {
    if (categoryService == null) {
      throw new RuntimeException("CategoryService not configured. Cannot continue.");
    }
    return categoryService;
  }

}
