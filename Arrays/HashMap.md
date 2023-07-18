In Java, `HashMap` is a class that implements the `Map` interface and provides an efficient way to store key-value pairs. It allows you to associate values with unique keys, enabling fast retrieval of values based on their corresponding keys. Here's a detailed explanation of the `HashMap` class:

**Key Features:**
1. **Uniqueness**: `HashMap` allows only unique keys. Duplicate keys are not allowed, and attempting to add a duplicate key will replace the existing key-value pair.
2. **Null Keys**: `HashMap` allows one null key, but multiple null values.
3. **Ordering**: `HashMap` does not guarantee any specific order of key-value pairs. The iteration order can be arbitrary and may change over time, especially when the `HashMap` is modified.
4. **Efficient Retrieval**: `HashMap` provides constant-time performance (O(1)) for retrieval operations (`get()` and `containsKey()`) regardless of the size of the map.
5. **Modifications**: `HashMap` supports adding, removing, and updating key-value pairs efficiently.
6. **Not Thread-safe**: `HashMap` is not synchronized and not thread-safe. If you need to use a `HashMap` in a multi-threaded environment, consider using `ConcurrentHashMap` or synchronize access to the `HashMap` externally.

**Common Methods:**
Here are some commonly used methods provided by the `HashMap` class:

1. `put(key, value)`: Inserts a key-value pair into the map.
2. `get(key)`: Retrieves the value associated with a given key.
3. `containsKey(key)`: Checks if a key is present in the map.
4. `remove(key)`: Removes the key-value pair associated with the given key from the map.
5. `size()`: Returns the number of key-value pairs in the map.
6. `isEmpty()`: Checks if the map is empty.
7. `clear()`: Removes all key-value pairs from the map.
8. `keySet()`: Returns a set of all keys in the map.
9. `values()`: Returns a collection of all values in the map.
10. `entrySet()`: Returns a set of all key-value pairs (entries) in the map.

**Example Usage:**
Here's an example that demonstrates how to use a `HashMap`:

```java
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 40);

        // Access values
        int aliceAge = hashMap.get("Alice");
        System.out.println("Alice's age: " + aliceAge);

        // Check if a key exists
        boolean isBobPresent = hashMap.containsKey("Bob");
        System.out.println("Is Bob present? " + isBobPresent);

        // Remove a key-value pair
        hashMap.remove("Charlie");

        // Iterate over keys and values
        for (String name : hashMap.keySet()) {
            int age = hashMap.get(name);
            System.out.println("Name: " + name + ", Age: " + age);
        }

        // Clear the HashMap
        hashMap.clear();
    }
}
```

Output:
```
Alice's age: 25
Is Bob present? true
Name: Alice, Age: 25
Name: Bob, Age: 30
```

In the example, we create a `HashMap` called `hashMap` that associates `String` keys with `Integer` values. We add key-value pairs, access values using `get()`, check for the presence of a key using `containsKey()`, and remove a key-value pair using `remove()`. Finally, we iterate over the keys and values using `keySet()` and `get()`.