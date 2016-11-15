package ru.menkin.ea.model;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject extends DomainObject{

    @Column(name = "topic", nullable = false)
    private String topic;

    @Column(name = "status", nullable = false)
    private int status;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id", nullable = false)
    private Users usersByIdUser;

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }

    public Users getUsersByIdUser() {
        return usersByIdUser;
    }
    public void setUsersByIdUser(Users usersByIdUser) {
        this.usersByIdUser = usersByIdUser;
    }
}
