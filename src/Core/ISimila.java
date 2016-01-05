package Core;

/**
 * Created by 921268 on 12/28/2015.
 */
public interface ISimila<T> {

     float Treshold;
     boolean AreSimilar(T left, T right);
     float getSimilarityPercent(T left, T right);
}
