package com.cinema.cinema.daos;

import com.cinema.cinema.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffDao extends JpaRepository<Staff,Long> {

}
