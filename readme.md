EasyLWJGL
=============

Java library for easier use of the Lightweight Java Game Library.

LWJGL has native library components that must be dynamically linked
to by the Java process before any of the LWJGL Java classes can be
used.
It can be tricky to get the files to the right places in the file
system and to load them in the right order.

EasyLWJGL does that for you.

To use it in your code, simply make sure to call EasyLWJGL.load();
before touching any of the LWJGL classes.


