    package com.alptekin.Entity;


    import jakarta.persistence.*;
    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;

    @Entity
    @Table(name = "users")
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        private String email;

        @Column
        private String firstName;

        @Column
        private String lastName;

        @Column
        private String gender;

        @Column
        private String password;

        @Column
        private String phoneNumber;

    }
