package services;

import model.User;

import java.util.*;

public class UsersServices {
    private static Set<User> users;
    // lưu trữ thông tin user theo set, không trùng lặp thông tin user
//    public UsersServices(){
//        init();
//    }
     static {
        users = new HashSet<>();
        //khởi tạo thông tin user ban đầu
        Date createDay = new Date();
       // User(long id, String userName, String numPhone, String email, String adress, Date createDay, int idRole)
        users.add(new User(760423,"Trung", "021312921","1234asd@gmail.com",
                "123/23/12 kasdkasd", createDay ));
        users.add(new User(760424,"Bình", "1235324","sakls@gmail.com",
                "123/23/12 kasdkasd", createDay));
        users.add(new User(760425,"Nhân", "6343421","123llll@gmail.com",
                "123/23/12 kasdkasd", createDay));
        users.add(new User(760426,"Nhật", "09239342","1234asd@gmail.com",
                "123/23/12 kasdkasd", createDay));
    }

    public static Set<User> getUsers() {
        //getUsers.toString > phương thức trả về mảng Object
        return users;
    }
    public void setUsers(Set<User> users) {
        UsersServices.users = users;
    }
    public static void addUser(User user){
        //them dau danh sach
        UsersServices.users.add(user);
    }
    public static void removeUser(long idUser){
        for (User user: users) {
            if (user.getId() == idUser){
                users.remove(user);
                break;
            }
        }
    }
//    public void editUser(){
//    }
}
