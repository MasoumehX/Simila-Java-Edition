package Core;

/**
 * Created by Masoumeh on 12/28/2015.
 */
public abstract class SimilaBase<T> extends ISimila<T> {

    public abstract ISimilarityResolver<T> Algorithm;
    public float Treshold;

    protected SimilaBase(){
        Treshold = (int) SimilarityRate.Similar * .1f;
    }

    @Override
    public boolean AreSimilar (T left, T right){
        return getSimilarityPercent(left, right) >= Treshold;
    }

    @Override
    public float getSimilarityPercent(T left, T right){

        return Algorithm.getSimilarity(left,right);
    }



}
