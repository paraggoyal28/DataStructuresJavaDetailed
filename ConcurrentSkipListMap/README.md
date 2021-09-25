# ConcurrentSkipListMap class
## Introduced in Java 1.6
## Belongs to java.util.concurrent package.
## Scalable implementation of ConcurrentNavigableMap.
## All elements are sorted based on the natural ordering or by the Comparator function passed.
## Uses concurrent version of SkipList providing O(logn) time for insertion, removal, updation, and access operations. 
## Thread safety.

## Declaration
## public class ConcurrentSkipListMap<K, V> extends AbstractMap<K, V> implements ConcurrentNavigableMap<K, V>, Cloneable, Serializable
## Here, K is the key Object type and V is the value Object type.

## Constructors of ConcurrentSkipListMap
1. ConcurrentSkipListMap(): Constructs a new, empty map, sorted according to the natural ordering of the keys.
ConcurrentSkipListMap<K, V> cslm = new ConcurrentSkipListMap<K, V>();
2. ConcurrentSkipListMap(Comparator<? super K> comparator): Constructs a new, empty map, sorted according to the specified comparator.
ConcurrentSkipListMap<K, V> cslm = new ConcurrentSkipListMap<K, V>(Comparator<? super K> comparator);
3. ConcurrentSkipListMap(Map<? extends K, ? extends V> m): Constructs a new map containing the same mappings as the given map, sorted according to the natural ordering of the keys.
ConcurrentSkipListMap<K, V> cslm = new ConcurrentSkipListMap<K, V>(Map<? extends K, ? extends V> m);
4. ConcurrentSkipListMap(SortedMap<K, ? extends V> m): Constructs a new map containing the same mappings and using the same ordering as the specified sorted map.
ConcurrentSkipListMap<K, V> cslm = new ConcurrentSkipListMap<K, V>(SortedMap<K, ? extends V> m);
