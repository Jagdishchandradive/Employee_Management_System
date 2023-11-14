package net.javajags.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javajags.springboot.model.Employee;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//JpaRepository internally extends PagingAndSortingRepository ,
//	PagingAndSortingRepository provides 2 API's -> 
//Iterable<T> findAll(Sort sort); --> this method supports sorting
//Page<T> findAll(Pageable pageable);--> supports pagination
}
