package com.SerializationDeserializationGson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.serializationDeSerializationJackson.PersonDetail;

public class SerializationDeserialization {

    public static void main(String[] args) {

        Person personDetail2 = new Person("alfred", 41, "Avenel");
        //Serialization the Java Object to a JSON String
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String value2 = gson.toJson(personDetail2);
        System.out.println(value2);

        String value = "{\"name\" : \"navis\",\"age\" : 40,\"city\" : \"Bayonne\"}";
        //Deserialization JSON string to Java Object
        PersonDetail personDetail = gson.fromJson(value, PersonDetail.class);

        System.out.println(personDetail.getName());
        System.out.println(personDetail.getAge());
        System.out.println(personDetail.getCity());
    }
}
