package com.blz.service;

import com.blz.model.EmployeePayroll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    /**
     * Creating arrayList of EmployeePayrollData type: employeePayrollList
     */
    private List<EmployeePayroll> employeePayrollList = new ArrayList<>();

    /**
     * Constructor
     */
    public EmployeePayrollService() {
        employeePayrollList = new ArrayList<>();
    }

    public void writeToFile() {
        String path = "C:\\Users\\SONY\\JAVA\\File_IO_Operations\\src\\main\\resources\\temp";
        StringBuffer empDataBuffer = new StringBuffer();
        employeePayrollList.forEach(data -> {
            String dataString = data.toString().concat("\n");
            empDataBuffer.append(dataString);

        });
        try {
            Files.write(Paths.get(path), empDataBuffer.toString().getBytes());

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void printData() {
        String path = "C:\\Users\\SONY\\JAVA\\File_IO_Operations\\src\\main\\resources\\temp";
        try {
            Files.lines(Paths.get(path)).forEach(System.out::println);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}

