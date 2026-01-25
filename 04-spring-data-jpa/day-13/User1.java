@OneToMany(
    mappedBy = "user",
    cascade = CascadeType.ALL,
    orphanRemoval = true
)
private List<Order> orders = new ArrayList<>();
