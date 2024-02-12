package com.cinema.cinema.daos;

import com.cinema.cinema.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface AdminDao extends JpaRepository<Admin,Long> {

}
