package ru.neoflex.pracice.database;

import jakarta.persistence.*;

@Entity
@Table(name = "Result")
public class table {
    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private long ID;

    @Column(name = "first_number")
    private int Num1;

    @Column(name = "action")
    private String action;

    @Column(name = "second_number")
    private int Num2;

    @Column(name = "result")
    private int result;

    /*Конструктор по умолчанию*/
    public table(){
    }
    public table(Integer a, String c, Integer b, int result) {
        this.Num1 = a;
        this.Num2 = b;
        this.action = c;
        this.result = result;
    }


}
