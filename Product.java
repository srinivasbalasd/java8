

import lombok.*;


import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;

    private String name;
    private String category;
    private Double price;


    private Set<Order> orders;
}
