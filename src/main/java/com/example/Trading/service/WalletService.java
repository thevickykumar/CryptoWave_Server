package com.example.Trading.service;

import com.example.Trading.exception.WalletException;
import com.example.Trading.model.Order;
import com.example.Trading.model.User;
import com.example.Trading.model.Wallet;

public interface WalletService {

    Wallet getUserWallet(User user) throws WalletException;

    public Wallet addBalanceToWallet(Wallet wallet, Long money) throws WalletException;

    public Wallet findWalletById(Long id) throws WalletException;

    public Wallet walletToWalletTransfer(User sender,Wallet receiverWallet, Long amount) throws WalletException;

    public Wallet payOrderPayment(Order order, User user) throws WalletException;
}
