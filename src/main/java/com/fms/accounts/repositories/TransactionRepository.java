package com.fms.accounts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fms.accounts.models.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
