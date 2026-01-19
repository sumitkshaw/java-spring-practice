@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Order() {}

    public Order(String product, User user) {
        this.product = product;
        this.user = user;
    }

    // getters & setters
}
