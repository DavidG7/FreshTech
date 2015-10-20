package com.netbuilder.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netbuilder.entities.Address;
import com.netbuilder.entityrepositories.AddressRepository;



@RestController
@RequestMapping("/book")
public class AddressController {

  @Autowired
  private AddressRepository addressRepository;

  @RequestMapping(method = RequestMethod.POST)
  public Map<String, Object> createBook(@RequestBody Map<String, Object> addressMap){
    Address address = new Address(addressMap.get("name").toString(),
        addressMap.get("isbn").toString(),
        addressMap.get("author").toString(),
        Integer.parseInt(addressMap.get("pages").toString()));

    bookRepository.save(book);
    Map<String, Object> response = new LinkedHashMap<String, Object>();
    response.put("message", "Book created successfully");
    response.put("book", book);
    return response;
  }

  @RequestMapping(method = RequestMethod.GET, value="/{bookId}")
  public Book getBookDetails(@PathVariable("bookId") String bookId){
    return bookRepository.findOne(bookId);
  }
}