package builderPattern;

public class User {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    //Only the nested UserBuilder class will utilize this private constructor.
    private User(UserBuilder userBuilder){
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.email = userBuilder.email;
        this.phone = userBuilder.phone;
        this.address = userBuilder.address;
        this.age = userBuilder.age;
    }
    //A nested static class for creating User instances using a fluent builder pattern.
    protected static class UserBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;

        //Setters for each field, returns the builder for method chaining.
        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public UserBuilder email(String email){
            this.email = email;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }
        public UserBuilder age(int age){
            this.age = age;
            return this;
        }
        //Method for creating a User object using the specified builder.
        public User build(){
            return new User(this);
        }
    }
}