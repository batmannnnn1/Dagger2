package com.example.dagger2.Summary

/*
Every time when Activity level component use the App level component we have to explicitly
define the which implementation's object Activity level component use:

this is not a good approach so we use subcomponent...
Activity level Component now become sub-component and App level becomes the Parent-component
and now subcomponent will use the all the Parent component object directly...

only..you have to declare the subcomponent object in Parent component
 */