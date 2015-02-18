
package ch.heigvd.ptl.sc.model;

import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/**
 *
 * @author matthieu
 */

@Document
public class Issue {
        @Id
        private String id;
        
        private String author;
        private String type;
        private Date date;
        private String description;
        private Float lngitude;
        private Float latitude;
        
}
