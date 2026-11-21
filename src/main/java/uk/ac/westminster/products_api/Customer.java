package uk.ac.westminster.products_api;

public class Customer {

    private Long id;
    private String name;
    private String email;
    private Address address;

    public Customer() {}

    public Customer(Long id, String name, String email, Address address) {
        setId(id);
        setName(name);
        setEmail(email);
        setAddress(address);
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public Address getAddress() { return address; }

    public void setId(Long id) {
        if (id != null && id < 1) {
            throw new IllegalArgumentException("id must be 1 or more");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be empty");
        }
        this.name = name;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("email is not valid");
        }
        this.email = email;
    }

    public void setAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("address cannot be null");
        }
        this.address = address;
    }
}
