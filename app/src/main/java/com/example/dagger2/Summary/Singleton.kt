package com.example.dagger2.Summary

/*

Suppose in component you have any object which too expensive to create everytime
so we use @Singleton annotation for only create one time...

 you have to use @Singleton annotation in Component for tell'em this component have singleton too..

                 ONE PROBLEM IN SINGLETON ANNOTATION !!

    when you declare the singleton they only exist until activity destroyed...
    once the activity destroyed and onCreate method called the Component again recreate and create the object...

 so you have to declare the component in Application level...
the class who inherits the Application()...

Singleton annotation defines the scope...

 */