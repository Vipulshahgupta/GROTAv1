package com.guptastore.gupta.daorepo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.guptastore.gupta.entities.SupplierPayment;

public interface SupplierPaymentDaoRepo extends JpaRepository<SupplierPayment, Long> {
	
	@Query("SELECT u FROM SupplierPayment u "
			+ "WHERE supplierId=(SELECT supplierId FROM Supplier "
			+ "WHERE supplierName=:n)")
	List<SupplierPayment> findBysupplierId(@Param("n")String name);
	
	@Modifying(clearAutomatically = true)
	@Query(value="INSERT into supplier_payment_tab(TNX_ID,AMOUNT_PAID_TO_SUPPLIER,BILL_ID,PAYMENT_DATE,PAYMENT_STATUS,PENDING_AMOUNT,SUPPLIER_ID) VAlUES (:tx,:am,:sbi,SYSTIMESTAMP,:sta,:pa,:sid)",nativeQuery = true)
	@Transactional
	int updateSupplierPayment(@Param("tx") double tnx_id,@Param("am") double amount,@Param("sbi") Long supplier_bill_id,@Param("sta") String status,@Param("pa") Double up_pendingamount,@Param("sid") long supplier_id);
	
	@Query(value="SELECT * FROM (SELECT * FROM supplier_payment_tab sp WHERE sp.supplier_id = ( SELECT supplier_id FROM supplier_tab WHERE supplier_name = :sn) AND sp.bill_id = :sbi ORDER BY sp.payment_date DESC ) sp WHERE ROWNUM = 1",nativeQuery = true)
	SupplierPayment findBysupplierId(@Param("sn") String supplier_name,@Param("sbi") Long supplier_bill_id);
}
