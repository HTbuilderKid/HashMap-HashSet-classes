
24. A HashMap in Java is basically a fast key => value storage, kind of like a dictionary. You give it a key (like a String or an int), it hashes it into a bucket, and then lets you quickly store or retrieve an associated value. Most of the time, it does this really fast, and the time for put() and get() are constant. It comes from the Map interface, which means that it supports core operations like adding things (put), looking them up (get), checking to see if something exists (containKey), looping through everything (entrySet/keySet), etc. 
However, it doesn't keep any specific order of the elements, which is bad if you want to sort items.

25. Since there are a lot of methods that depend on the type used to parametize it, I won't be listing all of them, or I'd run out of space.
But any method that accepts or returns K or V depends on the parameterized types.
Some of these methods include:
-V put(K key, V value)
-V get(Object key)
-V remove(Object key)
-V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)

26. We can check for the amount of entries contained in a map with the size method: map.size()

