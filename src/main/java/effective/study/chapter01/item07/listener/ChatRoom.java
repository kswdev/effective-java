package effective.study.chapter01.item07.listener;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ChatRoom {
    private List<WeakReference<User>> users;
    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(new WeakReference<>(user));
    }

    public void sendUser(String messsage) {
        users.forEach(wr -> Objects.requireNonNull(wr.get()).receive(messsage));
    }

    public List<WeakReference<User>> getUsers() {
        return users;
    }
}
