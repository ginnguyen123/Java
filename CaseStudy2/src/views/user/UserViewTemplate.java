package views.user;

import model.User;
import services.UsersServices;
import views.View;

import java.util.List;

public abstract class UserViewTemplate extends View {
    protected UsersServices usersServices;
    public UserViewTemplate(){
        //phương thức gọi khởi tạo ds user ở Set user trong class  UsersServices
        UsersServices usersServices = new UsersServices();
    }
    public void showUsers(List<User> users){
        //phương thức in các object user được lưu trữ trong set
        for (User user : users){
            System.out.println(user);
        }
    }
}
