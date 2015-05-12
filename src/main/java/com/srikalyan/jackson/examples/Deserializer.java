package com.srikalyan.jackson.examples;

import com.srikalyan.jackson.examples.dto.Shape;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

/**
 * This class demos the deserialization of a json string using jackson to create appropriate class
 * instance in a hierarchy.
 *
 * @author srikalyan.swayampakula
 */
public class Deserializer {

    public static void main(String args[]) throws IOException {
        final String circleJson = "{\"class\":\"com.srikalyan.jackson.examples.dto.Circle\",\"radius\":3.14}";
        final String squareString = "{\"class\":\"com.srikalyan.jackson.examples.dto.Square\",\"side\":4}";

        final ObjectMapper objectMapper = new ObjectMapper();
        // Observe that we are using shape class not circle class
        final Shape circleShape = objectMapper.readValue(circleJson, Shape.class);
        final Shape squareShape = objectMapper.readValue(squareString, Shape.class);

        System.out.println("The shape is " + circleShape.getName() + " and the area is "
                           + circleShape.getArea());

        System.out.println("The shape is " + squareShape.getName() + " and the area is "
                           + squareShape.getArea());
    }
}
