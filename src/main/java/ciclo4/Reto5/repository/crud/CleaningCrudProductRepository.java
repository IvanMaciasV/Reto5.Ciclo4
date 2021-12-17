package ciclo4.Reto5.repository.crud;


import ciclo4.Reto5.model.CleaningProduct;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Ivan Macias
 */
public interface CleaningCrudProductRepository extends MongoRepository<CleaningProduct, String>  {

    public List<CleaningProduct> findByPriceLessThanEqual(double precio);

    //Reto 5
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<CleaningProduct> findByDescriptionLike(String description);

}
