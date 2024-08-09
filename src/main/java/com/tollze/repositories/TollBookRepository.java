package com.tollze.repositories;





import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tollze.entities.BookToll;


public interface TollBookRepository extends JpaRepository<BookToll, String> {
	public  List<BookToll> findByuserId(String userId);
	public BookToll findBytollBookId(String tollBookId);
	public  List<BookToll> findByuserIdAndPaymentStatusAndJourneydateGreaterThanEqual(String userId,String paymentStatus,LocalDate journeydate);
	//public BookToll updateBookToll(String tollBookId,BookToll bookToll );
}
