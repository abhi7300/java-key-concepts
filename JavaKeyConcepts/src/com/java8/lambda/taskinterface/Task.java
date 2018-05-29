package com.java8.lambda.taskinterface;


/*
 * A special annotation @FunctionalInterface has been used to
 * mark this interface. If the sole purpose of an Interface is 
 * to be used for a lambda expression, then it is better to mark the 
 * interface with this annotation.
 *  
 * This helps a developer and prevents him/her from adding another 
 * abstract method to this interface, as an Interface used for 
 * lambda expression can have only one abstract method.
 * 
 * If not marked with this annotation, a compilation error would
 * show up at the line where the lambda is declared, if a new abstract
 * method is added to the interface on top of the one already present. If 
 * the annotation is used, the error will show up at the interface instead of
 * the line where the lambda is declared.
 * */
@FunctionalInterface
public interface Task {
 void perform();
}
