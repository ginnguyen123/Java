package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class User {
    private long id;
    private String userName;
    private String numPhone;
    private String email;
    private String adress;
    private Date createDay;
    //private int idRole;
    public User(){};
    public User(long id, String userName, String numPhone, String email, String adress, Date createDay){
        //, int idRole)
        this.id = id;
        this.userName = userName;
        this.numPhone = numPhone;
        this.email = email;
        this.adress = adress;
        this.createDay = createDay;
        //this.idRole = idRole;
    }
    public long getId() {
        return this.id;
    }
//  public int getIdRole() {
//        return idRole;
//    }
    public String getAdress() {
        return adress;
    }
    public Date getCreateDay() {
        return createDay;
    }
    public String getEmail() {
        return email;
    }
    public String getNumPhone() {
        return numPhone;
    }
    public String getUserName() {
        return userName;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setCreateDay(Date createDay) {
        this.createDay = createDay;
    }
    public void setEmail(String email) {
        this.email = email;
    }
//    public void setIdRole(int idRole) {
//        this.idRole = idRole;
//    }
    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        String dateTimeFormat = "hh:mm:ss E dd:MM:yyyy";
        DateFormat dateFormat = new SimpleDateFormat(dateTimeFormat);
        String createdDay = dateFormat.format(this.createDay);
        return String.format("%5s %5s %5s %10s %15s %15s \n", this.id, this.userName, this.numPhone, this.adress,
                this.email, createdDay); //, this.idRole
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(userName, user.userName) && Objects.equals(numPhone, user.numPhone) && Objects.equals(email, user.email) && Objects.equals(adress, user.adress) && Objects.equals(createDay, user.createDay);
    }
}
