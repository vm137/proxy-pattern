Proxy Pattern

JDK Dynamic proxy can only proxy by interface (so your target class needs to implement an interface, which is then also implemented by the proxy class).

CGLIB (Code Generation Library) (and javassist) can create a proxy by subclassing. In this scenario the proxy becomes a subclass of the target class. No need for interfaces.