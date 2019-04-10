/*
    Vladimir Jimenez
    License: MIT
 */

package tuan8_1_stack;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostFixEvaluator
{
    Map<String, Integer> variables;
    FileEditor fileSettings;
    List<String> expressions;
    Stack stack;

    public PostFixEvaluator(File filePath)
    {
        try
        {
            fileSettings = new FileEditor(filePath);
            variables = new HashMap<String, Integer>();
            expressions = new ArrayList<String>();
            stack = new Stack();

            if (fileSettings.get_line_count() < 3)
            {
                System.out.println("Files require at least 3 lines. One for values, the other for variables, and the last for post fix expressions");
                System.exit(1);
            }
            else
            {
                String values[] = fileSettings.returnLine(1).replaceAll("\\s", "").split(",");
                String variables[] = fileSettings.returnLine(2).replaceAll("\\s", "").split(",");

                if (values.length != variables.length)
                {
                    System.out.println("Cannot continue, number of variables and values do not match.");
                    System.exit(1);
                }
                else
                {
                    for (int i = 0; i < values.length; i++)
                    {
                        if (values[i].matches("[0-9]+") && variables[i].matches("[a-z]+"))
                        {
                            this.variables.put(variables[i], Integer.parseInt(values[i]));
                        }
                        else
                        {
                            System.out.println("Found an invalid value. I refuse to continue.");
                            System.exit(1);
                        }
                    }

                    for (int line = 3; line <= fileSettings.get_line_count(); line++)
                    {
                        if (fileSettings.returnLine(line).matches("(([a-z])|(\\s)|(\\+)|(\\-)|(\\*)|(\\/)|(\\%))+"))
                        {
                            expressions.add(fileSettings.returnLine(line));
                        }
                        else
                        {
                            System.out.println("Ignoring line " + line + " due to invalid character found...");
                        }
                    }
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("File not found. Will not proceed.");
            System.exit(1);
        }
    }

    private int parseExpression(String expression)
    {
        String actions[] = expression.split(" ");

        for (int i = 0; i < actions.length; i++)
        {
            if (actions[i].matches("[a-z]"))
            {
                if (variables.get(actions[i]) != null)
                {
                    stack.push(variables.get(actions[i]));
                }
                else
                {
                    System.out.println("No value found for " + actions[i]);
                }
            }
            else
            {
                if (stack.size() < 2)
                {
                    System.out.println("Ignoring the " + actions[i] + " because not enough values in the stack.");
                    continue;
                }

                int num2 = stack.pop();
                int num1 = stack.pop();
                int temp = 0;

                if (actions[i].equals("+"))
                {
                    temp = num1 + num2;
                }
                else if (actions[i].equals("-"))
                {
                    temp = num1 - num2;
                }
                else if (actions[i].equals("*"))
                {
                    temp = num1 * num2;
                }
                else if (actions[i].equals("/"))
                {
                    temp = num1 / num2;
                }
                else if (actions[i].equals("%"))
                {
                    temp = num1 % num2;
                }

                stack.push(temp);
            }
        }

        return stack.pop();
    }

    public void printToFile()
    {
        try
        {
            FileEditor output = FileEditor.createFile("C:\\Users\\allejo\\Downloads\\PostFix\\src\\sample_output");

            for (Map.Entry<String, Integer> entry : variables.entrySet())
            {
                output.writeToFile(entry.getKey() + " = " + entry.getValue());
            }

            for (int i = 0; i < expressions.size(); i++)
            {
                output.writeToFile("Postfix expression: " + expressions.get(i) + " Value: " + parseExpression(expressions.get(i)));
            }
        }
        catch (IOException e)
        {
            System.out.println("I don't have permissions to write to a file...");
        }
    }
}
