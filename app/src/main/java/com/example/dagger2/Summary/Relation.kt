package com.example.dagger2.Summary

/*

Activity level components depends on the Application level component
so we have to tell the dagger that our activity level component depends on the application level component...

you have to declare the app level component in the dependent component's factory...
also you have to declare the dependencies attribute in the activity level component and
pass the application level component for tell'em this are the my dependencies...
 */