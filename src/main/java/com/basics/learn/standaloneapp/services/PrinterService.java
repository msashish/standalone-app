package com.basics.learn.standaloneapp.services;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class PrinterService {

    public void printMessage(String[] args ){

        Arrays.stream(args).forEach(System.out::println);
    }
}
