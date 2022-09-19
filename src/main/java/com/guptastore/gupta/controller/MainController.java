package com.guptastore.gupta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.guptastore.gupta.entities.Customer;
import com.guptastore.gupta.entities.CustomerPayment;
import com.guptastore.gupta.entities.Expense;
import com.guptastore.gupta.entities.Supplier;
import com.guptastore.gupta.entities.SupplierPayment;
import com.guptastore.gupta.services.CustomerPaymentService;
import com.guptastore.gupta.services.CustomerService;
import com.guptastore.gupta.services.ExpenseService;
import com.guptastore.gupta.services.SupplierPaymentService;
import com.guptastore.gupta.services.SupplierService;

@RestController
public class MainController {
	
	/*@Autowired
	private CourseService cs;*/
	
	@Autowired
	private SupplierService ss;
	
	@Autowired
	private SupplierPaymentService sps;
	
	@Autowired
	private CustomerService cs;
	
	@Autowired
	private CustomerPaymentService cps;
	
	@Autowired
	private ExpenseService xs;
	
	
//	@GetMapping(value="/")
//	public String handle() 
//		{
//			return "Hi My Page 1"; 
//		}
	
	//**************************************
	//-------- SUPPLIER SERVICES -----------
	//**************************************
	
	@GetMapping(value="/supplierpayments/vsps/{name}")
	public List<SupplierPayment> getsupplierspayment(@PathVariable String name)
	{
		return this.sps.getsupplierspay(name);
	}
	
	@PostMapping(path="/supplierpayments/unbspd")
	public SupplierPayment addsupplierspayment(@RequestBody SupplierPayment supplierPayment) 
		{
			return this.sps.addsupplierspay(supplierPayment);
		}
	
	@PutMapping(path="/supplierpayments/usep")
	public String updatesupplierspayment(@RequestParam String supplier_name,
			@RequestParam Long supplier_bill_id,@RequestParam Double amount )
	{
		return this.sps.updatesupplierspay(supplier_name,supplier_bill_id,amount);
	}
	
	@GetMapping(value="/suppliers")
	public List<Supplier> getsuppliers()
		{
			return this.ss.getsuppliers();
		}
	
	@PostMapping(path="/suppliers")
	public Supplier addsupplier(@RequestBody Supplier supplier) 
		{
			return this.ss.addsuppliers(supplier);
		}
	
	@PutMapping(path="/suppliers")
	public Supplier updateSuppliers(@RequestBody Supplier supplier)
	{
		return this.ss.updateSuppliers(supplier);
	}
	
	@DeleteMapping(value="/suppliers/{supplierId}")
	public ResponseEntity<HttpStatus> deleteSuppliers(@PathVariable String supplierId)
		{
			try {
			this.ss.deleteSuppliers(Long.parseLong(supplierId));
			return new ResponseEntity<>(HttpStatus.OK);
				}
			catch(Exception e) {
				System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
			}
		}
	

	//**************************************
	//-------- CUSTOMER SERVICES -----------
	//**************************************
	
	@GetMapping(value="/customerpayments/vcps/{name}")
	public List<CustomerPayment> getcustomerspayment(@PathVariable String name)
	{
		return this.cps.getcustomerspay(name);
	}
	
	@PostMapping(path="/customerpayments/unbcpd")
	public CustomerPayment addcustomerspayment(@RequestBody CustomerPayment customerPayment) 
		{
			return this.cps.addcustomerspay(customerPayment);
		}
	
	@PutMapping(path="/customerpayments/ucep")
	public String updatecustomerspayment(@RequestParam String customer_name,
			@RequestParam Long customer_bill_id,@RequestParam Double amount )
	{
		return this.cps.updatecustomerspay(customer_name,customer_bill_id,amount);
	}
	
	@GetMapping(value="/customers")
	public List<Customer> getcustomers()
		{
			return this.cs.getcustomers();
		}
	
	@PostMapping(path="/customers")
	public Customer addcustomer(@RequestBody Customer customer) 
		{
			return this.cs.addcustomers(customer);
		}
	
	@PutMapping(path="/customers")
	public Customer updateCustomers(@RequestBody Customer customer)
	{
		return this.cs.updateCustomers(customer);
	}
	
	@DeleteMapping(value="/customers/{customerId}")
	public ResponseEntity<HttpStatus> deleteCustomers(@PathVariable String customerId)
		{
			try {
			this.cs.deleteCustomers(Long.parseLong(customerId));
			return new ResponseEntity<>(HttpStatus.OK);
				}
			catch(Exception e) {
				System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
			}
		}
	
	
	
	//**************************************
	//-------- EXPENSE SERVICES -----------
	//**************************************
	
	@GetMapping(value="/expenses/view")
	public List<Expense> getexpenses()
	{
		return this.xs.getexpenseslist();
	}
	
	@PostMapping(path="/expenses/upload")
	public Expense addexpenses(@RequestBody Expense expenses) 
		{
			return this.xs.addnewexpense(expenses);
		}
	
//	@PutMapping(path="/expenses/update")
//	public String updatecustomerspayment(@RequestParam String customer_name,
//			@RequestParam Long customer_bill_id,@RequestParam Double amount )
//	{
//		return this.cps.updatecustomerspay(customer_name,customer_bill_id,amount);
//	}
	
	
/*	@GetMapping(value="/courses")
	public List<Course> getCourses()
		{
			return this.cs.getCourses();
		}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourses(@PathVariable String courseId)
		{
			return this.cs.getCourses(Long.parseLong(courseId));
		}
	
	@PostMapping(path="/courses")
	public Course addCourses(@RequestBody Course course)
		{
			return this.cs.addCourses(course);
		}
	
	@PutMapping(path="/courses")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.cs.updateCourses(course);
	}
	
	@DeleteMapping(value="/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable String courseId)
		{
			try {
			this.cs.deleteCourses(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
				}
			catch(Exception e) {
				System.out.println(e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
			}
		}*/
	
	
	
}
	

