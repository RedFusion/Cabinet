package ru.menkin.ea.model;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message extends DomainObject{

    @Column(name = "text", nullable = false)
    private String text;

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    private java.util.Date date;

    @Column(name = "readed", nullable = false)
    private int readed;

    @ManyToOne
    @JoinColumn(name = "id_subject", referencedColumnName = "id", nullable = false)
    private Subject subjectByIdSubject;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public java.util.Date getDate() {
        return date;
    }
    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public int getReaded() {
        return readed;
    }
    public void setReaded(int readed) {
        this.readed = readed;
    }

    public Subject getSubjectByIdSubject() {
        return subjectByIdSubject;
    }
    public void setSubjectByIdSubject(Subject subjectByIdSubject) {
        this.subjectByIdSubject = subjectByIdSubject;
    }
}
