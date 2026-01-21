Exercise 1: Understand the N+1 Problem
🎯 Concept Tested

N+1 query problem

Lazy loading side-effects

Performance bottlenecks

🧠 Problem Statement

Fetch all users and then access their orders.
Observe how multiple SQL queries are fired.

  List<User> users = userRepository.findAll();

for (User user : users) {
    user.getOrders(); // causes extra queries
}
🧠 What Happens (IMPORTANT)

1 query → fetch users

N queries → fetch orders for each user

Total = 1 + N queries ❌

🧠 Interview Explanation

“N+1 occurs when a parent entity is fetched first, and child entities are lazily loaded one-by-one.”
