package com.bootup.asg1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootup.asg1.entity.BookingRecord;

public interface BookingRecordDao extends JpaRepository<BookingRecord, Integer>{

}
