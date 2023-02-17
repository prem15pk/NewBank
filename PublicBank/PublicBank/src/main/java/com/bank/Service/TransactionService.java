package com.bank.Service;

import com.bank.Entity.Transaction;

import java.util.List;

public interface TransactionService {

    public List<Transaction> getAllTransAction();

    public Transaction updateTransAction(Transaction transaction);
}
