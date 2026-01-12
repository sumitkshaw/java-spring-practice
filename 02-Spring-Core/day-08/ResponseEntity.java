@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<String> getUserById(@PathVariable int id) {

        if (id < 1) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Invalid user ID");
        }

        if (id != 1) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("User not found");
        }

        return ResponseEntity
                .status(HttpStatus.OK)
                .body("User found: Sumit");
    }
}
