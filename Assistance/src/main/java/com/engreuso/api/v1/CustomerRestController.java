package com.engreuso.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.engreuso.exceptions.CustomerNotFoundException;
import com.engreuso.model.Customer;
import com.engreuso.model.Order;
import com.engreuso.service.CustomerService;
import com.engreuso.service.OrdersService;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private OrdersService orderService;
	
	@Autowired
	private OrdersService ordersService;

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Iterable listAll() {
		return customerService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Customer get(@PathVariable("id") Long id) {
		return customerService.findOne(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody Customer update(@PathVariable("id") Long id, @RequestBody Customer customerUpdated) {
		return customerService.update(id, customerUpdated);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") Long id) {
		customerService.delete(id);
	}
	
	@RequestMapping(value = "/{id}/orders", method = RequestMethod.GET)
	public Iterable getOrdersByCustomerID(@PathVariable("id") Long id) {
		return customerService.getOrdersByCustomerID(id);
	}
	
	@RequestMapping(value = "/{id}/orders", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public Customer saveOrderByCustomerID(@PathVariable("id") Long id, @RequestBody Order order) {
		return customerService.saveOrderByCustomerID(id, order);
	}
	
	@RequestMapping(value = "/{id}/orders", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteOrdersBuCustomerID(@PathVariable("id") Long id) {
		customerService.deleteOrdersByCustomerID(id);
	}
}