package ru.arthur.entities;

import org.hibernate.annotations.BatchSize;

import javax.persistence.*;

/**
 * Created by salimhanov on 11.07.2014.
 */
@Entity
public class User  {
        private String id;
        private String lastName;
        private String firstName;
        private String email;
        private String datebirth;
    private String login;
    private String password;



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }



    @Column(name= "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "datebirth")
    public String getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(String birthdate) {
        this.datebirth = birthdate;
    }

    @Column(name = "login")

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



@Column(name = "lastname")
public String getLastName(){
    return lastName;
}

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

 @Column(name = "firstname")
    public String getFirstName(){
     return firstName;
 }

public void setFirstName(String firstName){
    this.firstName = firstName;
}





}
