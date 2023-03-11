public class Order {
    private long id;
    private long employeeId;
    private long customerId;
    private long [] books;

    public long getId() {
        return id;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public long[] getBooks() {
        return books;
    }

    public Order(long id, long employeeId, long customerId, long[] books) {
        this.id = id;
        this.employeeId = employeeId;
        this.customerId = customerId;
        this.books = books;
    }



}

