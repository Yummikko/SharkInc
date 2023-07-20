package com.example.sharkinc;

public interface LeasingApplicationHandler {
    void setNextHandler(LoanApplicationHandler nextHandler);
    void handle(LeasingApplication application);
}
