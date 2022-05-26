package com.zzpzaf.restapidemo.Repositories;

import java.util.List;

import com.zzpzaf.restapidemo.dataObjects.Item;

import org.springframework.jdbc.core.JdbcTemplate;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsRepo {
    

    //private Item item = new Item();
    
    //private final Log logger = LogFactory.getLog(getClass());
       
    @Autowired
    private JdbcTemplate jdbcTemplate; 

    @Value("${ITEMS_TABLE}")
    private String ITEMS_TABLE; // = "items";
    
    public List<Item> getItems() {
        //return jdbcTemplate.query("SELECT * FROM " + ITEMS_TABLE, BeanPropertyRowMapper.newInstance(Item.class));
        
        //logger.info("=========== ItemsRepo ==========");
        return jdbcTemplate.query("SELECT * FROM " + ITEMS_TABLE, BeanPropertyRowMapper.newInstance(Item.class));
    }  
}
