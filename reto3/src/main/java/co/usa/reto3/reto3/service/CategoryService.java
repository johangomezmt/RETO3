package co.usa.reto3.reto3.service;
import co.usa.reto3.reto3.repository.CategoryRepository;
import co.usa.reto3.reto3.model.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();

    }
    public Optional <Category> getCategory(int id){
        return categoryRepository.getCategory(id);
    }
    public Category save (Category c) {
        if(c.getID()==null) {
            return categoryRepository.save(c);
        }
        else {
            Optional<Category> aux=categoryRepository.getCategory(c.getID());
            if(aux.isEmpty()) {
                return categoryRepository.save(c);
            }else {
                return c;
            }
        }

    }
}
