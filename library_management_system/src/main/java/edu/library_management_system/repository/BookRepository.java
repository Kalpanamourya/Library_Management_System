package edu.library_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.library_management_system_model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book , Integer>{
	List<Book> findByName(String name);
}
