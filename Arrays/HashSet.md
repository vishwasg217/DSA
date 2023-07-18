In Java, `HashSet` is a class that implements the `Set` interface and provides an unordered collection of unique elements. It does not allow duplicate elements, making it useful when you want to store a collection of unique values. Here's a detailed explanation of the `HashSet` class:

**Key Features:**
1. **Uniqueness**: `HashSet` allows only unique elements. Duplicate elements are not allowed, and attempting to add a duplicate element will be ignored.
2. **Ordering**: `HashSet` does not guarantee any specific order of elements. The iteration order can be arbitrary and may change over time, especially when the `HashSet` is modified.
3. **Efficient Retrieval**: `HashSet` provides constant-time performance (O(1)) for basic operations like adding, removing, and checking for the presence of an element.
4. **No Index-based Access**: Unlike lists or arrays, `HashSet` does not provide index-based access to elements. You can only iterate over the elements or check for their presence.
5. **Not Thread-safe**: `HashSet` is not synchronized and not thread-safe. If you need to use a `HashSet` in a multi-threaded environment, consider using `Collections.synchronizedSet()` to create a synchronized set.

**Common Methods:**
Here are some commonly used methods provided by the `HashSet` class:

1. `add(element)`: Adds an element to the set.
2. `remove(element)`: Removes an element from the set.
3. `contains(element)`: Checks if an element is present in the set.
4. `size()`: Returns the number of elements in the set.
5. `isEmpty()`: Checks if the set is empty.
6. `clear()`: Removes all elements from the set.
7. `iterator()`: Returns an iterator to iterate over the elements in the set.
8. `addAll(collection)`: Adds all elements from the specified collection to the set.
9. `retainAll(collection)`: Retains only the elements in the set that are present in the specified collection.
10. `removeAll(collection)`: Removes all elements from the set that are also present in the specified collection.

**Example Usage:**
Here's an example that demonstrates how to use a `HashSet`:

```java
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a new HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Check if an element is present
        boolean containsApple = hashSet.contains("Apple");
        System.out.println("Contains Apple? " + containsApple);

        // Remove an element
        hashSet.remove("Banana");

        // Iterate over elements
        for (String fruit : hashSet) {
            System.out.println("Fruit: " + fruit);
        }

        // Clear the HashSet
        hashSet.clear();
    }
}
```

Output:
```
Contains Apple? true
Fruit: Orange
Fruit: Apple
```

In the example, we create a `HashSet` called `hashSet` that stores `String` elements. We add elements using `add()`, check for the presence of an element using `contains()`, and remove an element using `remove()`. We iterate over the elements using a for-each loop. Finally, we clear the `HashSet` using `clear()`.