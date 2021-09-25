# CopyOnWriteArrayList in Java
## CopyOnWriteArrayList implements list
## Found in java.util.concurrent package.

## Few important points
* CopyOnWriteArrayList creates a Cloned copy of underlying ArrayList, for every update operation at a certain point both will be synchronized automatically. 
* Costly to use because for every update a cloned copy will be created.
* Best choice if frequent operation is read operation.
* Underlying data structure is a grow-able array.
* It is a thread-safe version of ArrayList.
* Insertion is preserved, duplicates, null, and heterogeneous Objects are allowed.
* The main important point about CopyOnWriteArrayList is the Iterator of CopyOnWriteArrayList can not perform remove operation otherwise we get Runtime exception saying UnsupportedOperationException. add() and set() methods on CopyOnWriteArrayList iterator also throws UnsupportedOperationException.Also iterator of CopyOnWriteArrayList will never throw ConcurrentModificationException.

Declaration:
public class CopyOnWriteArrayList<E> extends Object implements List<E>, RandomAccess, Cloneable, Serializable
Here, E is the type of elements held in this collection.

Constructors:
1. CopyOnWriteArrayList(): Creates an empty list.
CopyOnWriteArrayList c = new CopyOnWriteArrayList();

2. CopyOnWriteArrayList(Collection obj): Creates a list containing the elements of the specified collection, in the order, they are returned by the collection's iterator.
CopyOnWriteArrayList c = new CopyOnWriteArrayList(Collection obj);

3. CopyOnWriteArrayList(Object[] obj): Creates a list holding a copy of the given array.
CopyOnWriteArrayList c = new CopyOnWriteArrayList(Object[] obj);

Iterating over CopyOnWriteArrayList: We can iterate over CopyOnWriteArrayList using iterator() method. The important point to be noted is that the iterator we create is an immutable snapshot of the original list. Because of this property, we can see that GfG is not printed at the first iteration.

Difference between ArrayList and CopyOnWriteArrayList

Both implements List interface.
1. CopyOnWriteArrayList creates a cloned copy of underlying
ArrayList, for every update operation at certain point both will be synchronized automatically which is taken care by JVM. Therefore there is no effect for threads which are performing read operation. Therefore, thread-safety is not there in ArrayList whereas CopyOnWriteArrayList is thread safe.
2. While iterating ArrayList object by one thread if other thread try to do modification then we will get Runtime exception saying ConcurrentModificationException whereas we won't get any exception in the case of CopyOnWriteArrayList.
3. ArrayList is introduced in JDK 1.2 whereas CopyOnWriteArrayList is introduced by SUN people in JDK 1.5.
4. Iterator of ArrayList can perform remove operation while iteration. But iterator of CopyOnWriteArrayList can't perform remove operation while iteration, otherwise it will throw run time exception UnsupportedOperationException.