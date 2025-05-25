package dev.snaik.mcp_server;

import org.springframework.ai.tool.annotation.Tool;

public class MathTools {

    @Tool(description = "Add two numbers")
    public int addNumbers(int number1 , int number2) { return number1 + number2 ; }

    @Tool(description = "Multiply two numbers")
    public int multiplyNumbers(int number1 , int number2) { return number1 * number2 ; }

}
