package com.guptastore.gupta.daorepo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.guptastore.gupta.entities.CustomerPayment;


public interface CustomerPaymentDaoRepo extends JpaRepository<CustomerPayment, Long> {

	
	@Query("SELECT u FROM CustomerPayment u "
			+ "WHERE customerId=(SELECT customerId FROM Customer "
			+ "WHERE customerName=:n)")
	List<CustomerPayment> findBycustomerId(@Param("n")String name);
	
	@Modifying(clearAutomatically = true)
	@Query(value="INSERT into customer_payment_tab(TNX_ID,AMOUNT_PAID_TO_CUSTOMER,BILL_ID,PAYMENT_DATE,PAYMENT_STATUS,PENDING_AMOUNT,CUSTOMER_ID) VAlUES (:tx,:am,:sbi,SYSTIMESTAMP,:sta,:pa,:cid)",nativeQuery = true)
	@Transactional
	int updateCustomerPayment(@Param("tx") double tnx_id,@Param("am") double amount,@Param("sbi") Long customer_bill_id,@Param("sta") String status,@Param("pa") Double up_pendingamount,@Param("cid") long customer_id);
	
	@Query(value="SELECT * FROM (SELECT * FROM customer_payment_tab sp WHERE sp.customer_id = ( SELECT customer_id FROM customer_tab WHERE customer_name = :sn) AND sp.bill_id = :sbi ORDER BY sp.payment_date DESC ) sp WHERE ROWNUM = 1",nativeQuery = true)
	CustomerPayment findBycustomerId(@Param("sn") String customer_name,@Param("sbi") Long customer_bill_id);
}
