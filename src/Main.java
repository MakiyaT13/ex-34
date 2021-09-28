/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] names = new String [50];

    System.out.print("How many employees?");
    int number = input.nextInt();

    for (int i = 0; i < number; i++){
      System.out.print("Enter Name: ");
      names[i] =  input.nextLine();
    }

    System.out.printf("There are %d employees", number);
    for (int i = 0; i < number; i++){
      System.out.println(names[i]);
    }

    System.out.print("Enter an employee name to remove: ");
    String name =  input.nextLine();

    System.out.printf("There are %d employees", number-1);