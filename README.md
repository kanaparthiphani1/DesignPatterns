### Singleton Pattern
Ensures a class has only one instance and provides a global point of access to it. This is often implemented using an enum or a private constructor and a static method.

### Prototype Pattern
Creates new objects by copying an existing object, allowing clients to produce new instances by copying an existing one. This is often implemented using the `Cloneable` interface.

### Factory Pattern
Defines an interface for creating an object but leaves the choice of its type to the subclasses, allowing a class to delegate the responsibility of instantiating its objects to its subclasses.

### Abstract Factory Pattern
Provides an interface for creating families of related or dependent objects without specifying their concrete classes. This is often implemented using interfaces for product creation.

### Builder Pattern
Separates the construction of a complex object from its representation, allowing the same construction process to create different representations. It is often used for constructing complex objects step by step.

### Facade Pattern
Provides a simplified interface to a set of interfaces in a subsystem, making a group of interfaces more accessible and easier to use for the client.

### Adapter Pattern
Allows the interface of an existing class to be used as another interface, enabling classes with incompatible interfaces to work together by providing a wrapper or an adapter.

### Decorator Pattern
Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending behavior.

### Observer Pattern
Defines a one-to-many dependency between objects, so that when one object changes state, all its dependents are notified and updated automatically.

### Strategy Pattern
Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the client to choose and switch algorithms at runtime.
