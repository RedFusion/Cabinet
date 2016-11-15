package ru.menkin.ea.controller;

import org.hibernate.*;
import ru.menkin.ea.model.*;
import ru.menkin.ea.utils.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hibernate tutorial");

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();

        Users user = new Users();
        user.setLogin("login");
        user.setPassword("1123");
        session.save(user);

        Subject subject = new Subject();
        subject.setUsersByIdUser(user);
        subject.setTopic("Topic1");
        subject.setStatus(0);
        session.save(subject);

        Message message = new Message();
        message.setSubjectByIdSubject(subject);
        message.setDate(new Date());
        message.setReaded(1);
        message.setText("New text");
        session.save(message);

        session.getTransaction().commit();

        session.close();

        System.out.println(user.toString());
    }
}
