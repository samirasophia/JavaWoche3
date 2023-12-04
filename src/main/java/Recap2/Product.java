package Recap2;

import lombok.Builder;

@Builder
public record Product(String name, double price, boolean vegan, String id) {

}

