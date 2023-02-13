package com.serializationDeSerializationJackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class SerializationDeserialization {

    public static void main(String[] args) throws IOException {

        PersonDetail personDetail2 = new PersonDetail("alfred", 41, "Avenel");
        //Serialization the Java Object to a JSON String
        ObjectMapper objectMapper = new ObjectMapper();
        String value2 = objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(personDetail2);
        System.out.println(value2);

        String value = "{\"name\" : \"navis\",\"age\" : 40,\"city\" : \"Bayonne\"}";
        //Deserialization JSON string to Java Object
        PersonDetail personDetail = objectMapper.readValue(value, PersonDetail.class);

        System.out.println(personDetail.getName());
        System.out.println(personDetail.getAge());
        System.out.println(personDetail.getCity());

    }
}
