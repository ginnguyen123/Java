package services;

import model.User;

import java.util.*;


public class UsersServices {
    private static List<User> users;
    // lưu trữ thông tin user theo set, không trùng lặp thông tin user
//    public UsersServices() {
//
//    }
    static {
        users = new ArrayList<>();
        //khởi tạo thông tin user ban đầu
        Date createDay = new Date();
        // User(long id, String userName, String numPhone, String email, String adress, Date createDay, int idRole)
//        users.add(new User(760423, "Trung", "021312921", "1234asd@gmail.com",
//                "123/23/12 kasdkasd", createDay));
//        users.add(new User(760424, "Bình", "1235324", "sakls@gmail.com",
//                "123/23/12 kasdkasd", createDay));
//        users.add(new User(760425, "Nhân", "6343421", "123llll@gmail.com",
//                "123/23/12 kasdkasd", createDay));
//        users.add(new User(760426, "Nhật", "09239342", "1234asd@gmail.com",
//                "123/23/12 kasdkasd", createDay));
    }

    public static List<User> getUsers() {
        //getUsers.toString > phương thức trả về mảng Object
        return users;
    }
    public static void setUsers(List<User> users) {
        users = users;
    }
    public static void addUser(User user){
        //them dau danh sach
        users.add(user);
    }
    public static void removeUser(long idUser){
        for (User user: users) {
            if (user.getId() == idUser){
                users.remove(user);
                break;
            }
        }
    }
    public static boolean isfindUser(long idUser){
         for (User u : users ){
             if (u.getId() == idUser){
                return true;
             }
         }
        return false;
    }
    public static User findUser(long idUser){
        for (User u : users){
            if (u.getId() == idUser){
                return u;
            }
        }
        return null;
    }
//    public static void updateUser(User user){
//        for (User u : users){
//            if (u.getId() == user.getId()){
//                u.setUserName(user.getUserName());
//            }
//        }
//    }
//    public User findUserByUserID(long idUser){
//        for (User u : users ){
//            if (u.getId() == idUser){
//                return u;
//            }
//        }
//        return null;
//    }
//
//    public void updateUser(User user) {
//        for (User u : users ){
//            if (u.getId() == user.getId()){
//                u.setUserName(user.getUserName());
//            }
//        }
//    }
}
