package sparktest;

import spark.ResponseTransformer;
import com.google.gson.Gson;

public class JsonTransformer implements ResponseTransformer
{
    private final Gson gson = new Gson();

    @Override
    public String render(final Object model)
    {
        return gson.toJson(model);
    }

}
