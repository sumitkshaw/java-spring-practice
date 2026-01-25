@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL
    )
    private List<Order> orders = new ArrayList<>();

    // getters & setters
}
