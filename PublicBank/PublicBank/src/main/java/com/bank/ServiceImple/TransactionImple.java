package com.bank.ServiceImple;

import com.bank.DTOs.TransActionDTO;
import com.bank.DTOs.ViewDTO.TransActionView;
import com.bank.Entity.Account;
import com.bank.Entity.Transaction;
import com.bank.Repository.AccountRepo;
import com.bank.Repository.TransactionRepo;
import com.bank.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionImple  implements TransactionService {

    @Autowired
    AccountRepo accountRepo;
    @Autowired
    TransactionRepo transactionRepo;
    @Override
    public List<Transaction> getAllTransAction() {
        return (List<Transaction>)transactionRepo.findAll();
    }

    @Override
    public Transaction updateTransAction(Transaction transaction) {

        return null;
    }


    public Transaction updateTransAction(TransActionDTO transActionDTO) {

        Transaction t = new Transaction();


      Transaction ts =  transactionRepo.save(t);
        return ts;
    }

    public TransActionView saveTransAction(TransActionDTO transActionDTO){
        TransActionView transActionView = new TransActionView();
        Account fromAccount = accountRepo.findById(transActionDTO.getFromAccount()).orElse(null);
        Account toAccount = accountRepo.findById(transActionDTO.getToAccount()).orElse(null);
        Transaction transaction = new Transaction();
        transaction.setId(transaction.getId());

        transaction.setTransactionDate(transaction.getTransactionDate());
        transaction.setTransactionAmount(transActionDTO.getTransactionAmount());
        transaction.setBlance(transActionDTO.getBlance());
        transaction.setDiscription(transActionDTO.getDiscription());
        transaction.setFromAccount(fromAccount);
        transaction.setToAccount(toAccount);
        transactionRepo.save(transaction);
        transActionView.setTransActionId(transaction.getTid());
        transActionView.setBalance(transActionDTO.getBlance());
        transActionView.setToAccountNo(transActionDTO.getToAccount());
        transActionView.setFromAccount(transActionDTO.getFromAccount());
        transActionView.setTransactionAmount(transActionDTO.getTransactionAmount());
        transActionView.setDiscription(transActionDTO.getDiscription());
        transActionView.setTransactionDate(transaction.getTransactionDate());
        transActionView.setCurrentBalance(transaction.getBlance() -transActionDTO.getTransactionAmount() );
       return transActionView;
    }




}
