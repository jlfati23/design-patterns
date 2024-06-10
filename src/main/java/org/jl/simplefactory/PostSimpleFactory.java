package org.jl.simplefactory;

public class PostSimpleFactory {

    public static Post createPost(String type){
        return switch (type) {
            case "Blog" -> new BlogPost();
            case "News" -> new NewsPost();
            case "Product" -> new ProductPost();
            default -> throw new IllegalArgumentException("illegal post type");
        };
    }

}
