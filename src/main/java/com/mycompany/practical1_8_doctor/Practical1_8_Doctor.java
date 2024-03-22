/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1_8_doctor;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KonGo
 */
public class Practical1_8_Doctor {
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    
    public static void main(String[] args) {
        System.out.println("Practical task 1.8");
        
        doctors.add(new Doctor("Иванов Иван Иванович", "Уролог", 1, 6,true));
        doctors.add(new Doctor("Петров Иван Петрович", "Терапевт", 2, 12,true));
        doctors.add(new Doctor("Лавров Максим Алексеевич", "Психиатр", 3, 9,true)); 
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить врача");
            System.out.println("2. Изменить статус аттестации врача");
            System.out.println("3. Выйти из программы");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addDoctor(scanner);
                    break;
                case 2:
                    changeCertification(scanner);
                    break;
                case 3:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Неверный выбор. Повторите попытку.");
            }
        } while (choice != 3);
    }
    private static void addDoctor(Scanner scanner) {
        System.out.println("Введите ФИО врача:");
        String fullName = scanner.nextLine();
        System.out.println("Введите специальность врача:");
        String specialty = scanner.nextLine();
        System.out.println("Введите порядковый номер врача:");
        int number = scanner.nextInt();
        scanner.nextLine(); 

        boolean exists = false;
        for (Doctor doctor : doctors) {
            if (doctor.getNumber() == number) {
                exists = true;
                break;
            }
        }

        if (!exists) {
            System.out.println("Введите количество рабочих смен в месяц:");
            int shifts = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите статус аттестации врача (true/false):");
            boolean certification = scanner.nextBoolean();
            scanner.nextLine();

            Doctor newDoctor = new Doctor(fullName, specialty, number, shifts, certification);
            doctors.add(newDoctor);
            System.out.println("Врач успешно добавлен.");
        } else {
            System.out.println("Врач с таким порядковым номером уже существует.");
        }
    }
    private static void changeCertification(Scanner scanner) {
        System.out.println("Введите порядковый номер врача, для которого нужно изменить статус аттестации:");
        int Number = scanner.nextInt();
        scanner.nextLine(); // считывание символа новой строки после ввода числа

        boolean found = false;
        for (Doctor doctor : doctors) {
            if (doctor.getNumber() == Number) {
                found = true;
                boolean currentStatus = doctor.isCertification();
                doctor.setCertification(!currentStatus);
                System.out.println("Статус аттестации для врача " + doctor.getFullName() + " изменен на " + !currentStatus);
                break;
            }
        }

        if (!found) {
            System.out.println("Врач с таким порядковым номером не найден.");
        }
    }
}
