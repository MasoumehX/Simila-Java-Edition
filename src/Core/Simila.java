package Core;

import javax.naming.spi.Resolver;

/**
 * Created by Masoumeh on 12/28/2015.
 */
public class Simila extends SimilaBase<string>{


    public Simila(SimilaType constructionType, float treshold){

        if(treshold != null)
            Treshold = treshold;

        switch(constructionType)
        {
            case  SimilaType.Automatic:
                Resolver = GetDefaultResolver();
                break;
            case SimilaType.Manual:
                Resolver =  new UnityContainer();
                break;
            default:
                throw new Exception(String.format("Unknown SimilaType: {0}", ))
        }
    }
}

public enum StringComparisonOptions{
    None (0),
    CaseSensitive
}
