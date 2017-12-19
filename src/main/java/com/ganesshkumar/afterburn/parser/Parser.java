package com.ganesshkumar.afterburn.parser;

import com.ganesshkumar.afterburn.demo.Handler;

import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;

public class Parser {
    private Handler handler = new Handler();

    /**
     * Reads the incoming request from the given stream, passes the request body to the function handler and
     * writes the funtion's output into the given writer.
     *
     * @param inputStream stream from which the incoming request has to be read
     * @param outputWriter writer into which the function's response has to be written
     */
    public void acceptIncoming(DataInputStream inputStream, BufferedWriter outputWriter) throws IOException {
        System.err.println("Begin Request");
        // Read the incoming request from stdin
        Request request = new Reader(inputStream).getRequest();

        // Call the function with the request body
        System.err.println("request body: " + request.getBody());
        String responseBody = handler.function(request.getBody(), request.getHeaders().getMethod());
        System.err.println("response body: " + responseBody);

        // Make response to be returned
        String response = new Response("200 OK", responseBody, "text/plain").serialize();
        // Write the response to stdout
        outputWriter.write(response);
        outputWriter.flush();

        System.err.println("End Request");
    }
}
