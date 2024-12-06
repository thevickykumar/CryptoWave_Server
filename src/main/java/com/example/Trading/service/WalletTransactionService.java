package com.example.Trading.service;

import com.example.Trading.domain.WalletTransactionType;
import com.example.Trading.model.Wallet;
import com.example.Trading.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {

    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);
}
