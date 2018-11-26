package readinglist;

import java.util.List;

public interface ReadingListMapper {

    List<Book> findByReader(String reader);
}
