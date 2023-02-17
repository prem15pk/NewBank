package com.bank.Controller;

import com.bank.DTOs.TransActionDTO;
import com.bank.DTOs.ViewDTO.TransActionView;
import com.bank.Entity.Transaction;
import com.bank.Repository.TransactionRepo;
import com.bank.ServiceImple.TransactionImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/bank/transaction/")
public class TransactionController {

    @Autowired
    TransactionImple transactionImple;

    @Autowired
    TransactionRepo transactionRepo;
    @PostMapping("updateTransaction")
    public ResponseEntity<Object> UpdateTransAction(@RequestBody TransActionDTO transActionDTO){
        TransActionView t  = transactionImple.saveTransAction(transActionDTO);
        if (t != null) return new ResponseEntity<>(t, HttpStatus.CREATED);
        else return new ResponseEntity<>("Wrong Input",HttpStatus.INTERNAL_SERVER_ERROR);

    }
    @GetMapping("getAllTransAction")
    public List<Transaction> getAllTransaction(){
        return transactionImple.getAllTransAction();
    }

    public ResponseEntity<Object> isActive(TransActionDTO transActionDTO){
       return  null;
    }


}
