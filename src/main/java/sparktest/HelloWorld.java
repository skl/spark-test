package sparktest;

import static spark.Spark.get;

public class HelloWorld
{
    public static void main(final String[] args)
    {
        get("/hello", "application/json", (request, response) -> {
            return new MyMessage("HelloWorld");
        }, new JsonTransformer());
    }
}
