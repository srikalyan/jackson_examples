package com.srikalyan.jackson.examples.dto;

import org.codehaus.jackson.annotate.JsonTypeInfo;

/**
 * A simple interface to demo the type hierarchy using jackson
 *
 * @author srikalyan.swayampakula
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "class")
public interface Shape {

    public String getName();

    /**
     * @return - the perimeter of the shape
     */
    public double getPerimeter();

    /**
     * @return - the area of the shape
     */
    public double getArea();
}
