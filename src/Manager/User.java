package Manager;

public class User {
    private String name;
    private String pwd;

    @Override
    public boolean equals(Object obj){
        User user = (User)obj;
        return this.name.equals(user.getName()) && this.pwd.equals(user.getPwd());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
