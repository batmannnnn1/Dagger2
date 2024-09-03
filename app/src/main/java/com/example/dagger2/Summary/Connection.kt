package com.example.dagger2.Summary

/*

Dagger work with 3 Ideologies : Consumer,Component,Producer

Consumer -> Those who consume the Objects...we use @Inject annotation for this
Producer -> Who creates the Object's for consumer... we use @Provides annotation for this
Component ->  A Component is an interface in Dagger that connects consumers and producers

If we use @Inject annotation in class constructor then dagger create their object through the component easily...

But in Interface or Builder case we use Module Then dagger create objects through the module...
because interface don't have constructors...

In Component you have to tell'em who's the consumer...
Also In Module you decide the which Implementation you have to use for Main class


 */