package com.crudoperation.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crudoperation.entity.IplTeam;

import jakarta.transaction.Transactional;

public interface IplRepository extends JpaRepository<IplTeam, Integer>{
	
//	@Repository
//	public interface IplRepository extends JpaRepository<IplTeam, Integer>{
//		@Modifying
//	    @Transactional
//	    @Query("DELETE FROM IplTeam t WHERE t.id = :id")
//	    void deleteByIdCustom(@Param("id") int id);


}
