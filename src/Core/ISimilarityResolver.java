package Core;

/**
 * Created by Masoumeh on 12/28/2015.
 * Gets the similarity of given strings. The similarity is a number between 0 and 1.
 */
public interface ISimilarityResolver <T> {

    float getSimilarity(T left, T right);
}
